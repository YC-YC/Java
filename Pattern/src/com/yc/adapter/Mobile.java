package com.yc.adapter;
/**
 *@Author Administrator
 *@Time 2016-4-13 上午12:12:03
 */
public class Mobile {

	void inputPower(V5Power v5Power){
		System.out.println("我是手机，我需要5V电压充电，现在电压是：" + v5Power.provideV5Power());
	}
}
