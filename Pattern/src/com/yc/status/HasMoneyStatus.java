package com.yc.status;

import java.util.Random;

/**
 *@Author Administrator
 *@Time 2016-4-14 上午12:55:14
 */
public class HasMoneyStatus implements Status {

	private Machine machine;
	
	
	public HasMoneyStatus(Machine machine) {
		super();
		this.machine = machine;
	}

	@Override
	public void insertMoney() {
		System.out.println("您已经投入硬币，无需再投");
	}

	@Override
	public void backMoney() {
		System.out.println("正在退币");
		machine.setStatus(machine.getNoMoneyStatus());
	}

	@Override
	public void turnCrank() {
		System.out.println("转动手柄");
		int random = new Random().nextInt(10);
		if (random == 5){
			machine.setStatus(machine.getWinStatus());
		}else{
			machine.setStatus(machine.getSoldStatus());
		}
	}

	@Override
	public void dispense() {
		throw new IllegalStateException("非法状态");
	}

}
