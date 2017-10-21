package com.yc.status;
/**
 *@Author Administrator
 *@Time 2016-4-14 上午12:55:14
 */
public class NoMoneyStatus implements Status {

	private Machine machine;
	
	
	public NoMoneyStatus(Machine machine) {
		super();
		this.machine = machine;
	}

	@Override
	public void insertMoney() {
		System.out.println("投币成功");
		machine.setStatus(machine.getHasMoneyStatus());
	}

	@Override
	public void backMoney() {
		System.out.println("您还没有投入硬币");
	}

	@Override
	public void turnCrank() {
		System.out.println("您还没有投入硬币");
	}

	@Override
	public void dispense() {
		throw new IllegalStateException("您还没有投入硬币");
	}

}
