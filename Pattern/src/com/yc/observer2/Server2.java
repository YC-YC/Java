package com.yc.observer2;

import java.util.Observable;
import java.util.Observer;

/**
 *@Author Administrator
 *@Time 2016-3-30 ионГ12:58:10
 */
public class Server2 extends Observable {

	private String msg;
	
	public String getMsg()
	{
		return this.msg;
	}
	
	public void setMsg(String msg)
	{
		this.msg = msg;
		setChanged();
		notifyObservers();
	}

}
