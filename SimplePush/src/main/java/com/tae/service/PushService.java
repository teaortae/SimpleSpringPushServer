package com.tae.service;

public interface PushService {
	boolean SendPush(String regid, String msg) throws Exception;
}
