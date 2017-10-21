/**
 * 
 */
package com.yc.reflect;

import java.lang.reflect.*;

/**
 * @author YC2
 * @time 2017-10-20 下午10:14:27
 * TODO:反射
 */
public class TestReflect {

	public static void main(String[] args){
		try {
			//获取类名要全名
			Class<?> c = Class.forName("com.yc.reflect.Person");
			//获取方法
			Method methodSayHello = c.getMethod("sayHello");
			methodSayHello.invoke(c.newInstance());
			
			Method methodSayHello2 = c.getMethod("sayHello2", String.class, int.class);
			String str = (String) methodSayHello2.invoke(c.newInstance(), "zhangsan", 123);
			System.out.println("sayHello2 return:" + str);
			
			Field fieldName = c.getDeclaredField("name");
			Field fieldAge = c.getDeclaredField("age");
			fieldName.setAccessible(true);
			fieldAge.setAccessible(true);
			Object instance = c.newInstance();
			fieldName.set(instance, "huangxi");
			String name = (String) fieldName.get(instance);
			int age = fieldAge.getInt(instance);
			System.out.println("get field<" + name + ":" + age + ">");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
