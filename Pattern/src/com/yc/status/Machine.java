package com.yc.status;
/**
 *@Author Administrator
 *@Time 2016-4-14 上午12:56:24
 */
public class Machine {
	
	private NoMoneyStatus noMoneyStatus;
	private HasMoneyStatus hasMoneyStatus;
	private SoldStatus soldStatus;
	private SoldOutStatus soldOutStatus;
	private WinStatus winStatus;
	
	private Status mCurStatus = noMoneyStatus;
	private int count;


	public Machine(int count) {
		super();
		this.count = count;
		noMoneyStatus = new NoMoneyStatus(this);
		hasMoneyStatus = new HasMoneyStatus(this);
		soldStatus = new SoldStatus(this);
		soldOutStatus = new SoldOutStatus(this);
		winStatus = new WinStatus(this);
		
		if (this.count > 0) {
			mCurStatus = noMoneyStatus;
		}else{
			mCurStatus = soldOutStatus;
		}
		
	}
	
	public int getCount() {
		return count;
	}

	public void insertMoney() {
		mCurStatus.insertMoney();
	}
	
	public void backMoney() {
		mCurStatus.backMoney();
	}
	
	public void turnCrank() {
		mCurStatus.turnCrank();
		if (mCurStatus == soldStatus || mCurStatus == winStatus){
			mCurStatus.dispense();
		}
	}

	public void dispense(){
		count--;
		System.out.println("发出一件商品...");
	}
	
	public void setStatus(Status status){
		mCurStatus = status;
	}

	public NoMoneyStatus getNoMoneyStatus() {
		return noMoneyStatus;
	}

	public HasMoneyStatus getHasMoneyStatus() {
		return hasMoneyStatus;
	}

	public SoldStatus getSoldStatus() {
		return soldStatus;
	}

	public SoldOutStatus getSoldOutStatus() {
		return soldOutStatus;
	}

	public WinStatus getWinStatus() {
		return winStatus;
	}
	
	

}
