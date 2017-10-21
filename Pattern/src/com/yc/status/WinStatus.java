package com.yc.status;

/**
 * @Author Administrator
 * @Time 2016-4-14 上午12:55:14
 */
public class WinStatus implements Status {

	private Machine machine;

	public WinStatus(Machine machine) {
		super();
		this.machine = machine;
	}

	@Override
	public void insertMoney() {
		throw new IllegalStateException("非法状态");
	}

	@Override
	public void backMoney() {
		throw new IllegalStateException("非法状态");
	}

	@Override
	public void turnCrank() {
		throw new IllegalStateException("非法状态");
	}

	@Override
	public void dispense() {
		System.out.println("恭喜您中奖了");
		machine.dispense();
		if (machine.getCount() <= 0) {
			System.out.println("已经售罄");
			machine.setStatus(machine.getSoldOutStatus());
		} else {
			machine.dispense();
			if (machine.getCount() > 0) {
				machine.setStatus(machine.getNoMoneyStatus());
			} else {
				System.out.println("已经售罄");
				machine.setStatus(machine.getSoldOutStatus());
			}
		}

	}

}
