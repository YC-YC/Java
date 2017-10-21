package com.yc.template;
/**
 *@Author Administrator
 *@Time 2016-3-28 ÏÂÎç10:30:56
 */
public class Coffee extends ITemplate {

	@Override
	protected void brew() {
		System.out.println("³åÅİ¿§·È");
	}

	@Override
	protected void addCondiments() {
		System.out.println("¼ÓÈë±ù¿é");
	}

}
