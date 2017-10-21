package com.yc.command;
/**
 *@Author Administrator
 *@Time 2016-4-9 上午12:37:41
 *
 *定义一个超级类，可执行一系列命令
 */
public class QuickCommand implements Command {

	private Command[] commands;
	public QuickCommand(Command[] commands) {
		super();
		this.commands = commands;
	}

	@Override
	public void execute() {
		System.out.println("超级类开始执行");
		for (int i = 0; i < commands.length; i++)
		{
			commands[i].execute();
		}
		System.out.println("超级类结束执行");
	}

}
