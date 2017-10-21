package com.yc.command;
/**
 *@Author Administrator
 *@Time 2016-4-9 ионГ12:10:41
 */
public class ComputerOffCommand implements Command {

	private Computer mComputer;
	
	public ComputerOffCommand(Computer mComputer) {
		super();
		this.mComputer = mComputer;
	}
	
	@Override
	public void execute() {
		this.mComputer.off();
	}

}
