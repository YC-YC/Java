package com.yc.proxy;
/**
 *@Author Administrator
 *@Time 2016-4-5 下午10:43:01
 */
public class CarLogProxy implements Moveable {

	private Moveable mMoveable;
	
	public CarLogProxy(Moveable car) {
		mMoveable = car;
	}
	
	/**使用聚合方式，真正的内容作为成员变量，日记处理代理处理*/
	@Override
	public void move() {
		
		System.out.println("汽车开始记录日记...");
		
		mMoveable.move();
		
		System.out.println("汽车结束记录日记...");
	}

}
