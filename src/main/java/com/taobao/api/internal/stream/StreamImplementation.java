package com.taobao.api.internal.stream;

import java.io.IOException;
/**
 * 
 * @author zhenzi
 * 2011-8-12 上午10:03:05
 */
public interface StreamImplementation {
	public void nextMsg()throws IOException;
	public String parseLine(String msg)throws TopCometException,IOException;
	public void onException(Exception ex);
	public void close()throws IOException;
}
