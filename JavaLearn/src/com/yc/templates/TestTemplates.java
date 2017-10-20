/**
 * 
 */
package com.yc.templates;

import java.io.Serializable;
import java.util.Date;

/**
 * @author YC2
 * @time 2017-10-20 下午12:33:40
 * TODO:
 * 泛型
 */
public class TestTemplates {

	
	public static void main(String[] args) {
		
//		泛型类
		Pair<String> pair = new Pair<String>("Hello");
		System.out.println("getValue = " + pair.getValue());
		pair.setValue("World");
		System.out.println("getValue = " + pair.getValue());
		
		Pair<Integer> pairInt = new Pair<Integer>(123);
		Pair<Float> pairf = new Pair<Float>(456.0f);
		
		printValue(pair);
		printValue(pairInt);
		printValue(pairf);
		
		
//		泛型接口
		ShowImpl showImpl = new ShowImpl();
		showImpl.show("Hello", new Date());
		
//		泛型方法
		System.out.println("get = " + get("Hello", 5));
		
//		泛型变量限定
		System.out.println("myCompare = " + myCompare("Hello", "World"));
	}
	
	/**泛型为标记“？”表示为所有泛型的父类*/
	private static void printValue(Pair<?> pair){
		System.out.println("getValue = " + pair.getValue());
	}
	
	
	
	private static <T, U> T get(T t, U u){
		if (u != null){
			return t;
		}
		else{
			return null;
		}
	} 
	
	/**通过extends限定泛型类型，&给出多个限定*/
	private static <T extends Comparable & Serializable> int myCompare(T t1, T t2){
		return t1.compareTo(t2);
	} 
	
}
