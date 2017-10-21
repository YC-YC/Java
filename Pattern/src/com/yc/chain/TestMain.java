package com.yc.chain;

import java.util.Random;

import com.yc.chain.handle.RequestHandle;
import com.yc.chain.handle.RequestHandleFactory;

/**
 * @Author Administrator
 * @Time 2016-3-31 下午10:42:05
 */
public class TestMain {

	private RequestHandle handle;

	/**该方法为了解耦，请求只关注一个RequestHandle 接口，而不必关注Sales,Leader等*/
	public void setHandle(RequestHandle handle) {
		this.handle = handle;
	}

	public void request(float request) {
		handle.handleRequest(request);
	}

	public static void main(String[] args) {
		TestMain client = new TestMain();
		client.setHandle(RequestHandleFactory.createHandle());
		
		Random rand = new Random();
		for (int i = 0; i < 100; i++)
		{
			System.out.println(i + ":");
			client.request(rand.nextFloat());
		}

	}

}
