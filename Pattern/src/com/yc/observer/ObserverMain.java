package com.yc.observer;
/**
 *@Author Administrator
 *@Time 2016-3-30 上午12:50:59
 *
 *观察者模式：向服务器注册用户，服务器有数据变化时，回调用户端
 */
public class ObserverMain {

	public static void main(String[] args) {
		ServerFor3D serverFor3D = new ServerFor3D();
		
		IClient client1 = new Client1(serverFor3D);
		IClient client2 = new Client2(serverFor3D);
		
		serverFor3D.setMsg("20160330的3D号码是：127");
		serverFor3D.setMsg("20160331的3D号码是：127");
	}

}
