package com.yc.observer2;

import java.util.Observable;
import java.util.Observer;

/**
 *@Author Administrator
 *@Time 2016-3-30 ÉÏÎç1:02:31
 */
public class Client implements Observer {

	public void registerServer(Observable observable){
		observable.addObserver(this);
	}
			
	
	@Override
	public void update(Observable obser, Object arg1) {
		if (obser instanceof Server1)
		{
			Server1 server = (Server1) obser;
			System.out.println("Server1's msg -- >" + server.getMsg());  
		}
		if (obser instanceof Server2)
		{
			Server2 server = (Server2) obser;
			System.out.println("Server1's msg -- >" + server.getMsg());  
		}
	}

}
