package com.yc.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.yc.proxy.jdkproxy.TimeProxy;

/**
 *@Author Administrator
 *@Time 2016-4-5 下午10:37:59
 */
public class TestProxy {

	public static void main(String[] args) {

//		/**使用继承方式代理*/
//		Moveable m = new Car2();
//		m.move();
		
		/**使用聚合方式，真正的内容作为成员变量，时间处理代理处理*/
//		Car car = new Car();
//		Moveable m = new CarTimeProxy(car);
//		m.move();
		
		/**使用聚合方式更容易扩展,只是调整顺序即可，而继承方式需要无限扩大继承*/
//		Car car = new Car();
//		CarTimeProxy ctp = new CarTimeProxy(car);
//		CarLogProxy clp = new CarLogProxy(ctp);
//		clp.move();		
		
//		Car car = new Car();
//		CarLogProxy clp = new CarLogProxy(car);
//		CarTimeProxy ctp = new CarTimeProxy(clp);
//		ctp.move();	
		
		/**动态加载
		 * 1、创建一个实现InvocationHandler的类，并实现invoke方法
		 * 2、创建被代理类及接口
		 * 3、调用Proxy方法动态创建一个代理类
		 * 4、通过代理调用方法
		 * */
		
		Car car = new Car();
		InvocationHandler h = new TimeProxy(car);
		
		Class<?> cls = car.getClass();
		ClassLoader loader = cls.getClassLoader();
		
		Class<?>[] interfaces = cls.getInterfaces();
		/** JDK动态加载 
		 * loader:类加载器
		 * interfaces：实现接口
		 * */
		Moveable m = (Moveable) Proxy.newProxyInstance(loader, interfaces, h);
		m.move();
	}

}
