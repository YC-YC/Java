package com.yc.adapter;
/**
 *@Author Administrator
 *@Time 2016-4-13 上午12:16:49
 */
public class V5PowAdapter implements V5Power{

	private V220Power v220Power;

	public V5PowAdapter(V220Power v220Power) {
		super();
		this.v220Power = v220Power;
	}

	@Override
	public int provideV5Power() {
		int power = v220Power.provideV220Power();
		System.out.println("通过适配，将220V转成5V电压");
		return 5;
	}
	
}
