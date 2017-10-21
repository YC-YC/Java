package com.yc.status;
/**
 *@Author Administrator
 *@Time 2016-4-14 上午12:48:58
 *状态模式：
 *定义：允许对象在内部状态改变时改变它的行为，对象看起来好像修改了它的类。
 */
public class TestMain {

	/**
	 * 需求：一部自动售货机，根据不同的状态执行不同的操作
	 * 
	 * 2、增加中奖需求
	 */
	public static void main(String[] args) {

		Machine machine = new Machine(10);
		
		machine.insertMoney();
		machine.backMoney();
		
		System.out.println("我要中奖");
		machine.insertMoney();
		machine.turnCrank();
		machine.insertMoney();
		machine.turnCrank();
		machine.insertMoney();
		machine.turnCrank();
		machine.insertMoney();
		machine.turnCrank();
		machine.insertMoney();
		machine.turnCrank();
		machine.insertMoney();
		machine.turnCrank();
		machine.insertMoney();
		machine.turnCrank();
		
		System.out.println("压力测试------");
		
		machine.insertMoney();  
        machine.insertMoney();  
        machine.turnCrank();  
        machine.turnCrank();  
        machine.backMoney();  
        machine.turnCrank();
		
	}

}
