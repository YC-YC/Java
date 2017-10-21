/**
 * 
 */
package com.yc.proxy.staticproxy;

/**
 * @author YC2
 * @time 2017-10-21 上午11:47:30
 * TODO:
 * Proxy的原理就是实现与实体对象一样的接口，通过new不同的实体对象实现不同的代理
 */
public class Proxy implements Sourceable {

	private Source source;
	
	public Proxy() {
		this.source = new Source();
	}
	
	@Override
	public void method() {
		before();
		source.method();
		after();
	}

	private void after() {
		System.out.println("after proxy");
	}

	private void before() {
		System.out.println("before proxy");
	}

}
