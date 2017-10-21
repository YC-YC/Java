package com.yc.proxy;
/**
 *@Author Administrator
 *@Time 2016-4-5 下午10:38:47
 */
public class Car2 extends Car {

	/**使用继承方式代理，单独处理时间*/
	@Override
	public void move() {
		
		long startTime = System.currentTimeMillis();
		System.out.println("汽车开始行驶...");
		
		super.move();
		
		System.out.println("汽车结束行驶...");
		long endTime = System.currentTimeMillis();
		System.out.println("汽车行驶了 " + (endTime - startTime));
	}
}
