package com.tae.service;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import com.google.android.gcm.server.Message;
import com.google.android.gcm.server.Sender;

public class PushServiceImpl implements PushService {
	private static final String APIKEY = "AIzaSyDu10iHfYrHjTM8SrPLDicvxoG7bnGtNqw";

	@Override
	public boolean SendPush(String regid, String msg) throws Exception {
		Sender sender = new Sender(APIKEY);
		try {
			final Message.Builder messageBuilder = new Message.Builder();
			messageBuilder.addData("message", msg);
			
			final com.google.android.gcm.server.Result result = sender.send(
					messageBuilder.build(), regid, 5);
			final String messageId = result.getMessageId();
			return (messageId != null);
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
