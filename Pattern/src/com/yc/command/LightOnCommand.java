package com.yc.command;
/**
 *@Author Administrator
 *@Time 2016-4-9 ионГ12:09:25
 */
public class LightOnCommand implements Command {

	private Light mLight;
	
	public LightOnCommand(Light mLight) {
		super();
		this.mLight = mLight;
	}

	@Override
	public void execute() {
		this.mLight.off();
	}

}
