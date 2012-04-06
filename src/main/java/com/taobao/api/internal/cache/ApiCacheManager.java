package com.taobao.api.internal.cache;

//import java.math.BigInteger;
//import java.util.List;
//
//import org.apache.log4j.Logger;
//
//import com.taobao.api.ApiException;
//import com.taobao.api.DefaultTaobaoClient;
//import com.taobao.api.domain.Apirule;
//import com.taobao.api.domain.ApiruleParameter;
//import com.taobao.api.internal.util.RequestParametersHolder;
//import com.taobao.api.internal.util.TaobaoHashMap;
//import com.taobao.api.request.TopApiruleSyncRequest;
//import com.taobao.api.response.TopApiruleSyncResponse;

/**
 * SDK cache manager
 * 
 * @author jeck.xie 2011-1-10
 */
public class ApiCacheManager {
/*
	private static final Logger log = Logger.getLogger("sdk.api.cache");

	private static LRUCache<String, Apirule> lruCache;

	static {
		lruCache = new LRUCache<String, Apirule>(200);
	}

	public static void validateApiLocal(DefaultTaobaoClient client,
			String apiName, RequestParametersHolder map) throws ApiException {
		log.debug("SDK cache in ...");
		
		if (apiName == null || "".equals(apiName.trim()))
			return;

		if (lruCache.containsKey(apiName)) {
			TaobaoHashMap paras = map.getProtocalMustParams();
			paras.putAll(map.getProtocalOptParams());
			paras.putAll(map.getApplicationParams());

			Apirule apirule = lruCache.get(apiName);

			doLocalcheck(apirule, paras);
			return;
		}

		// request api, put apirule in lrucache
		log.debug("SDK cache sync adding api='" + apiName + "'");
		putApiruleCache(client, apiName, lruCache);
	}

	private static void putApiruleCache(DefaultTaobaoClient client,
			String apiName, LRUCache<String, Apirule> lruCache) {
		try {
			TopApiruleSyncRequest req = new TopApiruleSyncRequest();
			req.setApiName(apiName);
			TopApiruleSyncResponse rsp = client.execute(req);

			if (rsp.isSuccess()) {
				lruCache.put(apiName, rsp.getApirule());
			} else {
				log.error("SDK cache sync faile, api='" + apiName + "', body=" + rsp.getBody());
			}

		} catch (ApiException e) {
			log.error("SDK cache sync faile, api='" + apiName + "'", e);
		}
	}

	private static void doLocalcheck(Apirule apirule, TaobaoHashMap map) throws ApiException {
		
		// session
		if (apirule.getNeedSession() && map.get("session") == null) {
			throw new ApiException(ErrorCode.MISSING_SESSION.code(), ErrorCode.MISSING_SESSION.msg());
		}
		
		List<ApiruleParameter> rules = apirule.getApiruleParameters();
		
		for (ApiruleParameter r : rules) {
			String name = r.getName();
			String value = map.get(name);
			String type = r.getType();
			Long length = r.getLength();
			Long maxListSize = r.getMaxListSize();
			Long minValue = r.getMinValue();
			Long maxValue = r.getMaxValue();

			// must
			if (r.getMust() && value == null && !"byte[]".equals(type)) {
				throw new ApiException(ErrorCode.MISSING_REQUIRED_ARGUMENTS.code(), ErrorCode.MISSING_REQUIRED_ARGUMENTS.msg() + ":" + name);
			}

			if (value != null && "".equals(value.trim()))
				continue;

			// byte array
			if ("byte[]".equals(type)) {
				// sdk client ignore check
			}

			if (length != null & length > 0) {
				if (value.length() > length)
					throw new ApiException(ErrorCode.INVALID_ARGUMENTS.code(), ErrorCode.INVALID_ARGUMENTS.msg() + ":" + name);
			}

			// list
			if (!"field_list".equals(type) && !"byte[]".equals(type) && maxListSize != null & maxListSize > 0) {
				String[] fields = value.split(",");
				if (fields != null) {
					if (fields.length > length)
						throw new ApiException("", "");

					for (String f : fields) {
						if (!checkPrimativeType(type, f, minValue, maxValue)) {
							throw new ApiException(ErrorCode.INVALID_ARGUMENTS.code(), ErrorCode.INVALID_ARGUMENTS.msg() + ":" + name);
						}
					}
				}
			} else {
				if (!checkPrimativeType(type, value, minValue, maxValue)) {
					throw new ApiException(ErrorCode.INVALID_ARGUMENTS.code(), ErrorCode.INVALID_ARGUMENTS.msg() + ":" + name);
				}
			}

		}
	}

	private static boolean checkPrimativeType(String type, String value,
			Long minValue, Long maxValue) {
		if ("number".equals(type)) {
			return ValidateUtil.isNumberInRange(value, minValue == null ? null
					: BigInteger.valueOf(minValue), maxValue == null ? null
					: BigInteger.valueOf(maxValue));
		} else if ("boolean".equals(type)) {
			return ValidateUtil.isBoolean(value);
		} else if ("date".equals(type)) {
			return ValidateUtil.isDate(value);
		} else if ("price".equals(type)) {
			return ValidateUtil.isPrice(value);
		}

		return true;
	}
*/
}
