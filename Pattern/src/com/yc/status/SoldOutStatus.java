package com.yc.status;
/**
 *@Author Administrator
 *@Time 2016-4-14 上午12:55:14
 */
public class SoldOutStatus implements Status {

	private Machine machine;
	
	
	public SoldOutStatus(Machine machine) {
		super();
		this.machine = machine;
	}

	@Override
	public void insertMoney() {
		System.out.println("货架为空，请不要投币");
	}

	@Override
	public void backMoney() {
		System.out.println("您没有投入硬币");
	}

	@Override
	public void turnCrank() {
		System.out.println("商品售完，摇动也没有用");
	}

	@Override
	public void dispense() {
		throw new IllegalStateException("非法状态");
	}

}
