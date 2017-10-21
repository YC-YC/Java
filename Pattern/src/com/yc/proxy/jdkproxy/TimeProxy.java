package com.yc.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.yc.proxy.Car;
import com.yc.proxy.Moveable;

/**
 *@Author Administrator
 *@Time 2016-4-5 下午11:02:49
 *
 *jdk提供的动态加载方法
 *
 */
public class TimeProxy implements InvocationHandler {

	private Object target;
	
	public TimeProxy(Moveable car) {
		target = car;
	}

	/**
	 * proxy ：被代理对象
	 * method ：被代理对象的方法
	 * args ：方法的参数
	 * 
	 * @return 方法的返回值
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		
		long startTime = System.currentTimeMillis();
		System.out.println("时间代理...");
		
		method.invoke(target);
		
		long endTime = System.currentTimeMillis();
		System.out.println("时间代理计算花费了 " + (endTime - startTime));
		
		
		return null;
	}

}
