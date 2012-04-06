package com.taobao.api.internal.stream.connect;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
/**
 * 
 * @author zhenzi
 * 2011-8-9 下午01:56:06
 */
public class HttpResponse {
	private HttpURLConnection con;
    private InputStream is;
    private BufferedReader reader;
    
    public HttpResponse(HttpURLConnection con) throws IOException {
    	if(con == null){
    		throw new IOException("Http url connection is null");
    	}
        this.con = con;
        if (null == (is = con.getErrorStream())) {
            is = con.getInputStream();
        }
        if (is != null && "gzip".equals(con.getContentEncoding())) {
            is = new GZIPInputStream(is);
        }
        reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
    }
    
    public String getResponseHeader(String name) {
        return con.getHeaderField(name);
    }

    public Map<String, List<String>> getResponseHeaderFields() {
        return con.getHeaderFields();
    }
    
    public void close() {
    	if(reader != null){
    		try {
				reader.close();
			} catch (IOException e) {
				//ignore
			}
    	}
    	if(is != null){
    		try {
				is.close();
			} catch (IOException e) {
				//ignore
			}
    	}
    	if(con != null){
    		con.disconnect();
    	}
    }
    
    public String getMsg()throws IOException{
    	return reader.readLine();
    }
}
