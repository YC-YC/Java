/**
 * 
 */
package com.yc.reflect;

/**
 * @author YC2
 * @time 2017-10-20 下午10:09:32
 * TODO:
 */
public class Person implements IChina{
	
	private String name;
	private int age;
	
	public String getName(){
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public void sayHello() {
		System.out.println(NAME + ":" + AGE);
	}

	@Override
	public String sayHello2(String name, int age) {
		return name + ":" + age;
	}

}
