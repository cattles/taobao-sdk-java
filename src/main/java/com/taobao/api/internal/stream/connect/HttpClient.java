package com.taobao.api.internal.stream.connect;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.log4j.Logger;

import com.taobao.api.internal.stream.Configuration;
import com.taobao.api.internal.stream.StreamConstants;
import com.taobao.api.internal.stream.TopCometSysErrorException;
/**
 * 专用于stream的httpclient
 * @author zhenzi
 * 2011-8-9 上午10:37:33
 */
public class HttpClient{
	private static final Logger log = Logger.getLogger(HttpClient.class);
	/*
	 * 在jdk14以及之前的版本中设置connectionTimeout和readTimeout的方法与1.5之后的不一样
	 */
	private static boolean isJDK14orEarlier = false;
	static {
        try {
            String versionStr = System.getProperty("java.specification.version");
            if (versionStr != null) {
                isJDK14orEarlier = 1.5d > Double.parseDouble(versionStr);
            }
        } catch (Exception ignore) {
            isJDK14orEarlier = false;
        }
    }
	private Map<String,String> params;
	private Configuration conf;
    public HttpClient(Configuration conf,Map<String,String> params) {
    	if(conf == null || params == null){
    		throw new RuntimeException("conf and params is must not null");
    	}
    	this.conf = conf;
        this.params = params;
    }
    
    public HttpResponse post() throws TopCometSysErrorException {
        int retriedCount;
        int retry = conf.getHttpConnectRetryCount() + 1;
        HttpResponse resp = null;
        for (retriedCount = 1; retriedCount <= retry; retriedCount++) {
            int responseCode = -1;
            try {
                HttpURLConnection con = null;
                OutputStream out = null;
                try {
                    con = getConnection(conf.getConnectUrl(),conf.getHttpConnectionTimeout(),conf.getHttpReadTimeout());
                    con.setDoInput(true);
                    con.setDoOutput(true);
                    
                    setHeaders(con,conf.getRequestHeader());
                    con.setRequestMethod("POST");
                    con.setRequestProperty("Content-Type",
                            "application/x-www-form-urlencoded");
                    String postParam = encodeParameters(params);
                    if(log.isDebugEnabled()){
                    	log.debug("Post param is:" + postParam);
                    }
                    byte[] bytes = postParam.getBytes("UTF-8");
                    con.setRequestProperty("Content-Length",
                            Integer.toString(bytes.length));
                    
                    out = con.getOutputStream();
                    out.write(bytes);
                    out.flush();
                    responseCode = con.getResponseCode();
                    if(HttpURLConnection.HTTP_OK == responseCode){
                    	if(log.isDebugEnabled()){
                    		log.debug("connect successful");
                    		StringBuilder respHeader = new StringBuilder();
                            Map<String, List<String>> responseHeaders = con.getHeaderFields();
                            for (String key : responseHeaders.keySet()) {
                                List<String> values = responseHeaders.get(key);
                                for (String value : values) {
                                    if (key != null) {
                                        respHeader.append(key).append("=").append(value);
                                    } else {
                                        respHeader.append(value);
                                    }
                                    respHeader.append(";");
                                }
                            }
                            log.debug("Response: " + respHeader.toString());
                    	}
                    	resp = new HttpResponse(con);
                    	return resp;
                    }else if(HttpURLConnection.HTTP_BAD_REQUEST == responseCode){//参数校验出错
                    	if(log.isDebugEnabled()){
                    		log.debug("Request param is invalid,errmsg is:" + con.getHeaderField(StreamConstants.ERR_MSG_HEADER));
                    	}
                        throw new TopCometSysErrorException("Server response err msg:" + con.getHeaderField(StreamConstants.ERR_MSG_HEADER));
                    }else if(HttpURLConnection.HTTP_FORBIDDEN == responseCode){//服务端在发布，需要休眠一段时间
                    	if(log.isDebugEnabled()){
                    		log.debug("Server is deploying,sleep " + retriedCount * conf.getHttpConnectRetryInterval()  + " seconds");
                    	}
                    	if (retriedCount == conf.getHttpConnectRetryCount()) {
                    		if(log.isDebugEnabled()){
                    			log.debug("May be server occure some error,please contact top tech support");
                    		}
                            throw new TopCometSysErrorException("May be server occure some error,please contact top tech support");
                        }
                    	try {
							Thread.sleep(retriedCount * conf.getHttpConnectRetryInterval() * 1000);
						} catch (InterruptedException e) {
							//ignore;
						}
						continue;
                    }
                } finally {
                    try {
                    	if(out != null){
                    		out.close();
                    	}
                    } catch (Exception ignore) {
                    }
                }
            } catch (IOException ioe) {
                // connection timeout or read timeout
                if (retriedCount == conf.getHttpConnectRetryCount()) {
                    throw new TopCometSysErrorException(ioe.getMessage(), ioe);
                }
            }
            try {
            	if(log.isDebugEnabled()){
            		log.debug("Sleeping " + conf.getHttpConnectRetryInterval() + " seconds until the next retry.");
            	}
                Thread.sleep(retriedCount * conf.getHttpConnectRetryInterval() * 1000);
            } catch (InterruptedException ignore) {
                //nothing to do
            }
        }
        return resp;
    }

    public static String encode(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (java.io.UnsupportedEncodingException neverHappen) {
            throw new AssertionError("will never happen");
        }
    }
    private String encodeParameters(Map<String,String> params) {
        if (null == params || (params != null && params.size() == 0)) {
            return "";
        }
        StringBuilder buf = new StringBuilder();
        Iterator<Entry<String,String>> it = params.entrySet().iterator();
        int j = 0;
    	while(it.hasNext()){
    		Entry<String,String> e = it.next();
    		if(j != 0){
    			buf.append("&");
    		}
    		buf.append(encode(e.getKey()))
            .append("=").append(encode(e.getValue()));
    		j++;
    	}
        return buf.toString();
    }
    /**
     * sets HTTP headers
     *
     * @param connection HttpURLConnection
     * @param reqHeader 
     */
    private void setHeaders(HttpURLConnection connection,Map<String,String> reqHeader) {
        if (reqHeader != null && reqHeader.size() > 0) {
        	Iterator<Entry<String,String>> it = reqHeader.entrySet().iterator();
        	while(it.hasNext()){
        		Entry<String,String> e = it.next();
        		connection.addRequestProperty(e.getKey(), e.getValue());
        	}
        }
    }

    private HttpURLConnection getConnection(String url,int connTimeout,int readTimeout) throws IOException {
        HttpURLConnection con = null;
        con = (HttpURLConnection) new URL(url).openConnection();
        if (connTimeout > 0) {
        	if(!isJDK14orEarlier){
        		con.setConnectTimeout(connTimeout * 1000);
        	}else{
        		System.setProperty("sun.net.client.defaultConnectTimeout", String.valueOf(connTimeout * 1000));
        	}
        }
        if (readTimeout > 0) {
        	if(!isJDK14orEarlier){
        		con.setReadTimeout(readTimeout * 1000);
        	}else{
        		System.setProperty("sun.net.client.defaultReadTimeout", String.valueOf(readTimeout * 1000)); 
        	}
        }
        con.setInstanceFollowRedirects(false);
        return con;
    }
}

