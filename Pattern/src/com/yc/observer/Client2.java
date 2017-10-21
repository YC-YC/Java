package com.yc.observer;
/**
 *@Author Administrator
 *@Time 2016-3-30 上午12:48:09
 */
public class Client2 implements IClient {

	private IServer mServer;
	
	public Client2(IServer server) {
		super();
		this.mServer = server;
		this.mServer.registerClient(this);
	}

	@Override
	public void update(String msg) {
		System.out.println("Client2 得到 3D 号码 -->" + msg + "我要告诉舍友们。");  
	}

}
