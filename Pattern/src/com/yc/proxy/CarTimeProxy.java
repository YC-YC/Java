package com.yc.proxy;
/**
 *@Author Administrator
 *@Time 2016-4-5 下午10:43:01
 */
public class CarTimeProxy implements Moveable {

	private Moveable mMoveable;
	
	public CarTimeProxy(Moveable car) {
		mMoveable = car;
	}
	
	/**使用聚合方式，真正的内容作为成员变量，时间处理代理处理*/
	@Override
	public void move() {
		
		long startTime = System.currentTimeMillis();
		System.out.println("汽车开始行驶...");
		
		mMoveable.move();
		
		System.out.println("汽车结束行驶...");
		long endTime = System.currentTimeMillis();
		System.out.println("汽车行驶了 " + (endTime - startTime));
	}

}
