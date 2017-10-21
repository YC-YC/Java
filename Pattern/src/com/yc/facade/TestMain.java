package com.yc.facade;
/**
 *@Author Administrator
 *@Time 2016-4-13 上午12:31:13
 * 外观模式（Facade Pattern）
 * 定义：提供一个统一的接口，用来访问子系统中的一群接口，外观定义了一个高层的接口，让子系统更容易使用
 */
public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		HomeTheaterFacade facade = new HomeTheaterFacade(new Computer(),
				new Player(), 
				new Control());
		facade.watchMovie();
		facade.stopMovie();
	}

}
