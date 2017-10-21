package com.yc.command;
/**
 *@Author Administrator
 *@Time 2016-4-9 ионГ12:07:39
 */
public class DoorCloseCommand implements Command {

	private Door mDoor;
	
	public DoorCloseCommand(Door mDoor) {
		super();
		this.mDoor = mDoor;
	}

	@Override
	public void execute() {
		this.mDoor.close();
	}

}
