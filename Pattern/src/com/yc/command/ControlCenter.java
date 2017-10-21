package com.yc.command;
/**
 *@Author Administrator
 *@Time 2016-4-9 上午12:17:02
 */
public class ControlCenter {
	private static final int CONTROL_SIZE = 9; 
	
	
	private Command[] commands;
	public ControlCenter() {
		commands = new Command[9];
		for (int i = 0; i < CONTROL_SIZE; i++)
		{
			commands[i] = new NoCommand();
		}
	}
	
	/**提供设置按键相应命令的方法*/
	public void setCommand(int index, Command command)
	{
		commands[index] = command;
	}
	
	/**模拟执行按键*/
	public void onKeyDown(int index)
	{
		commands[index].execute();
	}
}
