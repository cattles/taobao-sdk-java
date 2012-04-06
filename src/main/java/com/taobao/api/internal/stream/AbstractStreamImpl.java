package com.taobao.api.internal.stream;

import java.io.IOException;
import java.util.concurrent.RejectedExecutionException;

import org.apache.log4j.Logger;

import com.taobao.api.internal.stream.connect.HttpResponse;
import com.taobao.api.internal.stream.message.StreamMsgConsumeFactory;
import com.taobao.api.internal.stream.message.TopCometMessageListener;

/**
 * 
 * @author zhenzi
 * 2011-8-12 上午10:02:57
 */
public abstract class AbstractStreamImpl implements StreamImplementation{
	private static final Logger log = Logger.getLogger(AbstractStreamImpl.class);
	protected HttpResponse response;
	private StreamMsgConsumeFactory msgConsumeFactory;
	protected boolean streamAlive = true;
	public AbstractStreamImpl(StreamMsgConsumeFactory msgConsumeFactory,HttpResponse response){
		this.msgConsumeFactory = msgConsumeFactory;
		this.response = response;
	}
	
	public void nextMsg() throws IOException {
		if(!streamAlive){
			throw new IOException("Stream closed");
		}
        try {
            String line = response.getMsg();
            if (null == line) {
                throw new IOException("the end of the stream has been reached");
            }
            msgConsumeFactory.consume(new StreamEvent(line));
        } catch (IOException e) {
            response.close();
            streamAlive = false;
            throw e;
        }catch(RejectedExecutionException rejectException){
        	log.error("Message consume thread pool is full:", rejectException);
        }catch(NullPointerException npe){
        	log.error("Null point exception:", npe);
        }
    }

	public abstract TopCometMessageListener getMessageListener();
	class StreamEvent implements Runnable{
		String msg;
		StreamEvent(String msg){
			this.msg = msg;
		}
		public void run() {
			String line = null;
			try {
				line = parseLine(msg);
			} catch (Exception e) {
				log.error("parse error line:" + msg, e);
			}
			if(line != null){
				getMessageListener().onReceiveMsg(line);
			}
		}
		
	}
	
}
