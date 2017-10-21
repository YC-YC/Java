package com.yc.proxy;
/**
 *@Author Administrator
 *@Time 2016-4-5 下午10:35:01
 */
public class Car implements Moveable {

	@Override
	public void move() {
//		long startTime = System.currentTimeMillis();
//		System.out.println("汽车开始行驶...");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		System.out.println("汽车结束行驶...");
//		long endTime = System.currentTimeMillis();
//		System.out.println("汽车行驶了 " + (endTime - startTime));
	}

}
