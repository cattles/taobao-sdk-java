package com.taobao.api.internal.cache;

/**
 * local cache error code
 * 
 * @author jeck.xie 2011-1-10
 */ 
public enum ErrorCode {

	MISSING_SESSION("26", "Missing session"),
	MISSING_REQUIRED_ARGUMENTS("40", "Missing required arguments"),
	INVALID_ARGUMENTS("41", "Invalid arguments");

	private String code;
	private String msg;

	private ErrorCode(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public String code() {
		return code;
	}

	public String msg() {
		return msg;
	}

}
