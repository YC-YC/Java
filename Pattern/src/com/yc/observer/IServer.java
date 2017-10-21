package com.yc.observer;
/**
 *@Author Administrator
 *@Time 2016-3-30 ионГ12:40:08
 */
public interface IServer {

	public void registerClient(IClient client);
	public void unRegisterClient(IClient client);
	public void notifyClient();
}
