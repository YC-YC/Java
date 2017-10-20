/**
 * 
 */
package com.yc.templates;

/**
 * @author YC2
 * @time 2017-10-20 下午6:01:03
 * TODO:
 * 泛型类
 * 
 */
public class Pair<T> {

	private T value;
	
	public Pair(T value){
		this.value = value;
	}
	
	public T getValue(){
		return this.value;
	}
	
	public void setValue(T value){
		this.value = value;
	}
}
