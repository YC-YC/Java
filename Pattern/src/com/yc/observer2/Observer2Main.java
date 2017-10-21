package com.yc.observer2;
/**
 *@Author Administrator
 *@Time 2016-3-30 上午1:06:06
 *观察者模式：利用系统提供的类，向服务器注册用户，服务器有数据变化时，回调用户端
 */
public class Observer2Main {

	public static void main(String[] args) {

		Server1 server1 = new Server1();
		Server2 server2 = new Server2();
		
		Client client = new Client();
		
		client.registerServer(server1);
		client.registerServer(server2);
		System.out.println("Observer2Main");
		server1.setMsg("Server1'nums : 110 ");  
		server2.setMsg("Server2'nums : 12,13,31,5,4,3 15"); 
		
	}

}
