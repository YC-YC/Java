package com.yc.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *@Author Administrator
 *@Time 2016-3-30 ионГ12:43:19
 */
public class ServerFor3D implements IServer {

	private List<IClient> clients = new ArrayList<IClient>();
	
	private String msg;
	
	@Override
	public void registerClient(IClient client) {
		clients.add(client);
	}

	@Override
	public void unRegisterClient(IClient client) {
		int index = clients.indexOf(client);
		if (index >= 0)
		{
			clients.remove(index);
		}
	}

	@Override
	public void notifyClient() {
		for (IClient client : clients)
		{
			client.update(msg);
		}
	}
	
	public void setMsg(String message)
	{
		this.msg = message;
		notifyClient();
	}


}
