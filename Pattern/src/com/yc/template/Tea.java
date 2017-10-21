package com.yc.template;
/**
 *@Author Administrator
 *@Time 2016-3-28 下午10:28:20
 */
public class Tea extends ITemplate {

	@Override
	protected void brew() {
		System.out.println("80度泡茶5分钟");		
	}

	@Override
	protected void addCondiments() {
		System.out.println("加入柠檬");
	}
	
	@Override
	protected boolean isCustomerCondiments() {
		return false;
	}

}
