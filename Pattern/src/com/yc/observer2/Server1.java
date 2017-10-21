package com.yc.observer2;

import java.util.Observable;
import java.util.Observer;

/**
 *@Author Administrator
 *@Time 2016-3-30 上午12:58:10
 */
public class Server1 extends Observable {

	private String msg;
	
	public String getMsg()
	{
		return this.msg;
	}
	
	public void setMsg(String msg)
	{
		this.msg = msg;
		
		/**要同时调用下列两个方法才能完成通知*/
		setChanged();
		notifyObservers();
	}

}
