package com.yc.chain.handle;
/**
 *@Author Administrator
 *@Time 2016-3-31 下午10:47:11
 */
public class CEO extends RequestHandle {

	@Override
	public void handleRequest(float request) {
		if (request <= 0.65)
		{
			System.out.println(this.getClass().getName() + "响应了请求：" + request);
		}
		else
		{
			System.out.println("无人响应请求：" + request);
		}
	}

}
