package com.taobao.api.internal.util;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import com.taobao.api.Constants;
import com.taobao.api.internal.util.codec.Base64;
import com.taobao.api.internal.util.json.JSONReader;

/**
 * 系统工具类。
 * 
 * @author carver.gu
 * @since 1.0, Sep 12, 2009
 */
public abstract class TaobaoUtils {

	private TaobaoUtils() {}

	/**
	 * 给TOP请求签名。
	 * 
	 * @param requestHolder 所有字符型的TOP请求参数
	 * @param secret 签名密钥
	 * @return 签名
	 * @throws IOException
	 */
	public static String signTopRequest(RequestParametersHolder requestHolder, String secret)
			throws IOException {
		// 第一步：把字典按Key的字母顺序排序
		Map<String, String> sortedParams = new TreeMap<String, String>();
		TaobaoHashMap appParams = requestHolder.getApplicationParams();
		if(appParams != null && appParams.size() > 0){
			sortedParams.putAll(appParams);
		}
		TaobaoHashMap protocalMustParams = requestHolder.getProtocalMustParams();
		if(protocalMustParams != null && protocalMustParams.size() > 0){
			sortedParams.putAll(protocalMustParams);
		}
		TaobaoHashMap protocalOptParams = requestHolder.getProtocalOptParams();
		if(protocalOptParams != null && protocalOptParams.size() > 0){
			sortedParams.putAll(protocalOptParams);
		}
		
		Set<Entry<String, String>> paramSet = sortedParams.entrySet();

		// 第二步：把所有参数名和参数值串在一起
		StringBuilder query = new StringBuilder(secret);
		for (Entry<String, String> param : paramSet) {
			if (StringUtils.areNotEmpty(param.getKey(), param.getValue())) {
				query.append(param.getKey()).append(param.getValue());
			}
		}

		// 第三步：使用MD5加密
		byte[] bytes = encryptMD5(query.toString());

		// 第四步：把二进制转化为大写的十六进制
		return byte2hex(bytes);
	}

	/**
	 * 给TOP请求签名。
	 * 
	 * @param requestHolder 所有字符型的TOP请求参数
	 * @param secret 签名密钥
	 * @param isHmac 是否为HMAC方式加密
	 * @return 签名
	 * @throws IOException
	 */
	public static String signTopRequestNew(RequestParametersHolder requestHolder, String secret, boolean isHmac)
			throws IOException {
		// 第一步：把字典按Key的字母顺序排序
		Map<String, String> sortedParams = new TreeMap<String, String>();
		TaobaoHashMap appParams = requestHolder.getApplicationParams();
		if(appParams != null && appParams.size() > 0){
			sortedParams.putAll(appParams);
		}
		TaobaoHashMap protocalMustParams = requestHolder.getProtocalMustParams();
		if(protocalMustParams != null && protocalMustParams.size() > 0){
			sortedParams.putAll(protocalMustParams);
		}
		TaobaoHashMap protocalOptParams = requestHolder.getProtocalOptParams();
		if(protocalOptParams != null && protocalOptParams.size() > 0){
			sortedParams.putAll(protocalOptParams);
		}

		Set<Entry<String, String>> paramSet = sortedParams.entrySet();

		// 第二步：把所有参数名和参数值串在一起
		StringBuilder query = new StringBuilder();
		if (!isHmac) {
			query.append(secret);
		}
		for (Entry<String, String> param : paramSet) {
			if (StringUtils.areNotEmpty(param.getKey(), param.getValue())) {
				query.append(param.getKey()).append(param.getValue());
			}
		}

		// 第三步：使用MD5/HMAC加密
		byte[] bytes;
		if (isHmac) {
			bytes = encryptHMAC(query.toString(), secret);
		} else {
			query.append(secret);
			bytes = encryptMD5(query.toString());
		}

		// 第四步：把二进制转化为大写的十六进制
		return byte2hex(bytes);
	}

	private static byte[] encryptHMAC(String data, String secret) throws IOException {
		byte[] bytes = null;
		try {
			SecretKey secretKey = new SecretKeySpec(secret.getBytes(Constants.CHARSET_UTF8), "HmacMD5");
			Mac mac = Mac.getInstance(secretKey.getAlgorithm());
			mac.init(secretKey);
			bytes = mac.doFinal(data.getBytes(Constants.CHARSET_UTF8));
		} catch (GeneralSecurityException gse) {
			throw new IOException(gse);
		}
		return bytes;
	}

	private static byte[] encryptMD5(String data) throws IOException {
		byte[] bytes = null;
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			bytes = md.digest(data.getBytes(Constants.CHARSET_UTF8));
		} catch (GeneralSecurityException gse) {
			throw new IOException(gse);
		}
		return bytes;
	}

	private static String byte2hex(byte[] bytes) {
		StringBuilder sign = new StringBuilder();
		for (int i = 0; i < bytes.length; i++) {
			String hex = Integer.toHexString(bytes[i] & 0xFF);
			if (hex.length() == 1) {
				sign.append("0");
			}
			sign.append(hex.toUpperCase());
		}
		return sign.toString();
	}

	/**
	 * 验证TOP回调地址的签名是否合法。要求所有参数均为已URL反编码的。
	 * 
	 * @param topParams TOP私有参数（未经BASE64解密）
	 * @param topSession TOP私有会话码
	 * @param topSign TOP回调签名
	 * @param appKey 应用公钥
	 * @param appSecret 应用密钥
	 * @return 验证成功返回true，否则返回false
	 * @throws IOException
	 */
	public static boolean verifyTopResponse(String topParams, String topSession, String topSign,
			String appKey, String appSecret) throws IOException {
		StringBuilder result = new StringBuilder();
		result.append(appKey).append(topParams).append(topSession).append(appSecret);
		byte[] bytes = encryptMD5(result.toString());
		Base64 encoder = new Base64();
		return new String(encoder.encode(bytes)).equals(topSign);
	}

	/**
	 * 获取TOP容器回调上下文，仅用于正式环境下的客户端应用。
	 * 
	 * @param authCode 授权码
	 * @return TOP容器上下文
	 * @throws IOException 如果授权码已经过期或者容器不可访问
	 */
	public static TaobaoContext getTopContext(String authCode) throws IOException {
		String url = getProductClientSessionUrl(authCode);
		String rsp = WebUtils.doGet(url, null, Constants.CHARSET_UTF8);
		if (StringUtils.isEmpty(rsp)) {
			return null;
		}

		TaobaoContext context = new TaobaoContext();

		Set<Entry<String, String>> paramSet = WebUtils.splitUrlQuery(rsp).entrySet();
		for (Entry<String, String> param : paramSet) {
			if (TaobaoContext.PARAMETERS.equals(param.getKey())) {
				context.addParameters(decodeTopParams(param.getValue()));
			} else {
				context.addParameter(param.getKey(), param.getValue());
			}
		}

		return context;
	}

	/**
	 * 解释TOP回调参数为键值对。
	 * 
	 * @param topParams 经过BASE64编码的字符串
	 * @return 键值对
	 * @throws IOException
	 */
	public static Map<String, String> decodeTopParams(String topParams) throws IOException {
		if (StringUtils.isEmpty(topParams)) {
			return null;
		}

		Base64 decoder = new Base64();		
		byte[] buffer = decoder.decode(WebUtils.decode(topParams).getBytes());
		String originTopParams = new String(buffer, Constants.CHARSET_GBK);

		return WebUtils.splitUrlQuery(originTopParams);
	}

	/**
	 * 获取沙箱环境下客户端应用的上下文。
	 * 
	 * @param appKey 应用编码
	 * @param nick 用户昵称
	 * @return 应用的上下文
	 * @throws IOException
	 
	public static TaobaoContext getSandboxContext(String appKey, String nick) throws IOException {
		Map<String, String> authParams = new HashMap<String, String>();
		authParams.put("appkey", appKey);
		authParams.put("nick", nick);
		authParams.put("zhxz", "1");

		String response = WebUtils.doPost(Constants.SANDBOX_AUTHORIZE_URL, authParams);
		String authRegex = "<input type=\"text\" id=\"autoInput\" value=\"(.+?)\" style=\".+?\">";
		Pattern pattern = Pattern.compile(authRegex);
		Matcher matcher = pattern.matcher(response);
		if (matcher.find()) {
			String authCode = matcher.group(1);
			String sessionUrl = getSandboxSessionUrl(authCode);
			String rsp = WebUtils.doGet(sessionUrl, null);

			TaobaoContext context = new TaobaoContext();
			context.setCallbackUrl(rsp);

			Set<Entry<String, String>> paramSet = WebUtils.splitUrlQuery(rsp).entrySet();
			for (Entry<String, String> param : paramSet) {
				if (TaobaoContext.PARAMETERS.equals(param.getKey())) {
					context.addParameters(decodeTopParams(param.getValue()));
				} else {
					context.addParameter(param.getKey(), param.getValue());
				}
			}

			return context;
		} else {
			return null;
		}
	}
*/
	/**
	 * 根据授权码获取沙箱环境SessionKey的地址。
	 * 
	 * @param authCode 授权码
	 * @return 地址
	 
	public static String getSandboxSessionUrl(String authCode) {
		StringBuilder url = new StringBuilder(Constants.SANDBOX_CONTAINER_URL);
		url.append("?authcode=").append(authCode);
		return url.toString();
	}
*/
	/**
	 * 根据应用编号获取正式环境WEB应用SessionKey的地址。
	 * 
	 * @param appKey 应用编号
	 * @return 地址
	 */
	public static String getProductWebSessionUrl(String appKey) {
		StringBuilder url = new StringBuilder(Constants.PRODUCT_CONTAINER_URL);
		url.append("?appkey=").append(appKey);
		return url.toString();
	}

	/**
	 * 根据应用编号获取正式环境客户端应用SessionKey的地址。
	 * 
	 * @param authCode 授权码
	 * @return 地址
	 */
	public static String getProductClientSessionUrl(String authCode) {
		StringBuilder url = new StringBuilder(Constants.PRODUCT_CONTAINER_URL);
		url.append("?authcode=").append(authCode);
		return url.toString();
	}

	/**
	 * 获取文件的真实后缀名。目前只支持JPG, GIF, PNG, BMP四种图片文件。
	 * 
	 * @param bytes 文件字节流
	 * @return JPG, GIF, PNG or null
	 */
	public static String getFileSuffix(byte[] bytes) {
		if (bytes == null || bytes.length < 10) {
			return null;
		}

		if (bytes[0] == 'G' && bytes[1] == 'I' && bytes[2] == 'F') {
			return "GIF";
		} else if (bytes[1] == 'P' && bytes[2] == 'N' && bytes[3] == 'G') {
			return "PNG";
		} else if (bytes[6] == 'J' && bytes[7] == 'F' && bytes[8] == 'I' && bytes[9] == 'F') {
			return "JPG";
		} else if (bytes[0] == 'B' && bytes[1] == 'M') {
			return "BMP";
		} else {
			return null;
		}
	}

	/**
	 * 获取文件的真实媒体类型。目前只支持JPG, GIF, PNG, BMP四种图片文件。
	 * 
	 * @param bytes 文件字节流
	 * @return 媒体类型(MEME-TYPE)
	 */
	public static String getMimeType(byte[] bytes) {
		String suffix = getFileSuffix(bytes);
		String mimeType;

		if ("JPG".equals(suffix)) {
			mimeType = "image/jpeg";
		} else if ("GIF".equals(suffix)) {
			mimeType = "image/gif";
		} else if ("PNG".equals(suffix)) {
			mimeType = "image/png";
		} else if ("BMP".equals(suffix)) {
			mimeType = "image/bmp";
		}else {
			mimeType = "application/octet-stream";
		}

		return mimeType;
	}

	/**
	 * 清除字典中值为空的项。
	 * 
	 * @param <V> 泛型
	 * @param map 待清除的字典
	 * @return 清除后的字典
	 */
	public static <V> Map<String, V> cleanupMap(Map<String, V> map) {
		if (map == null || map.isEmpty()) {
			return null;
		}

		Map<String, V> result = new HashMap<String, V>(map.size());
		Set<Entry<String, V>> entries = map.entrySet();

		for (Entry<String, V> entry : entries) {
			if (entry.getValue() != null) {
				result.put(entry.getKey(), entry.getValue());
			}
		}

		return result;
	}

	/**
	 * 把JSON字符串转化为Map结构。
	 * 
	 * @param body JSON字符串
	 * @return Map结构
	 */
	public static Map<?, ?> parseJson(String body) {
		JSONReader jr = new JSONReader();
		Object obj = jr.read(body);
		if (obj instanceof Map<?, ?>) {
			return (Map<?, ?>) obj;
		} else {
			return null;
		}
	}

}
