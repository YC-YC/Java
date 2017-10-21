package com.yc.command;
/**
 *@Author Administrator
 *@Time 2016-4-9 ионГ12:09:25
 */
public class LightOffCommand implements Command {

	private Light mLight;
	
	public LightOffCommand(Light mLight) {
		super();
		this.mLight = mLight;
	}

	@Override
	public void execute() {
		this.mLight.on();
	}

}
