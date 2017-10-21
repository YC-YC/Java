/**
 * 
 */
package com.yc.proxy.staticproxy;

/**
 * @author YC2
 * @time 2017-10-21 上午11:46:19
 * TODO:
 */
public class Source implements Sourceable {

	@Override
	public void method() {
		System.out.println("original method");
	}

}
