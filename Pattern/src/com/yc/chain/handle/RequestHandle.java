package com.yc.chain.handle;
/**
 *@Author Administrator
 *@Time 2016-3-31 обнГ10:43:18
 */
public abstract class RequestHandle {
	protected RequestHandle successor;

	protected void setSuccessor(RequestHandle successor) {
		this.successor = successor;
	}
	
	public abstract void handleRequest(float request);
}
