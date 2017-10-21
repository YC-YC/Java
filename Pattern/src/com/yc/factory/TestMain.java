package com.yc.factory;

import com.yc.factory.concrete.IHair;

/**
 *@Author Administrator
 *@Time 2016-3-31 обнГ11:59:23
 */
public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		IHair left = new HairFactory().getHair("left");
//		left.draw();
		
		IHair left = new HairFactory().getHairByClass("left");
		left.draw();
		
		PersonFactory factory = new MCFactory();
		factory.getBoy().drawBoy();
		factory.getGirl().drawGirl();
	}

}
