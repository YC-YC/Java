package com.yc.adapter;
/**
 *@Author Administrator
 *@Time 2016-4-13 上午12:10:27
 *适配器模式
 *定义：将一个类的接口转换成客户期望的另一个接口，适配器让原本接口不兼容的类可以相互合作
 */
public class TestMain {

	public static void main(String[] args) {

		/**
		 * 需求：有一部手机，需要提供5V电压充电，但现在只有220V的电压
		 */
		Mobile mobile = new Mobile();
		V220Power v220Power = new V220Power();
		mobile.inputPower(new V5PowAdapter(v220Power));
	}

}
