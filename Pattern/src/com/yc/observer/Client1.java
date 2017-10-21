package com.yc.observer;
/**
 *@Author Administrator
 *@Time 2016-3-30 上午12:48:09
 */
public class Client1 implements IClient {

	private IServer mServer;
	
	public Client1(IServer server) {
		super();
		this.mServer = server;
		this.mServer.registerClient(this);
	}

	@Override
	public void update(String msg) {
		System.out.println("Client1 得到 3D 号码  -->" + msg + ", 我要记下来。");  
	}

}
