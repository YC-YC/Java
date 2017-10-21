package com.yc.status;
/**
 *@Author Administrator
 *@Time 2016-4-14 上午12:55:14
 */
public class SoldStatus implements Status {

	private Machine machine;
	
	
	public SoldStatus(Machine machine) {
		super();
		this.machine = machine;
	}

	@Override
	public void insertMoney() {
		System.out.println("您已经投入硬币，无需再投");
	}

	@Override
	public void backMoney() {
		System.out.println("正在出货，无法退币");
	}

	@Override
	public void turnCrank() {
		System.out.println("正在出货，请勿重复摇动手柄");
	}

	@Override
	public void dispense() {
		machine.dispense();
		if (machine.getCount() > 0){
			machine.setStatus(machine.getNoMoneyStatus());
		}else{
			machine.setStatus(machine.getSoldOutStatus());
		}
		
	}

}
