package com.taobao.api.internal.stream;

/**
 * 出现的系统级的异常，这类型的异常产生后需要整个系统退出
 * 比如：missing app key,签名不对等
 * @author zhenzi
 * 2011-8-12 下午02:29:11
 */
public class TopCometSysErrorException extends TopCometException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2890964819607554013L;

	public TopCometSysErrorException() {
		super();
	}

	public TopCometSysErrorException(String message, Throwable cause) {
		super(message, cause);
	}

	public TopCometSysErrorException(String message) {
		super(message);
	}

	public TopCometSysErrorException(Throwable cause) {
		super(cause);
	}

}
