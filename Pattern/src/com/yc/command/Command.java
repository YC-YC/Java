package com.yc.command;
/**
 *@Author Administrator
 *@Time 2016-4-9 上午12:05:41
 *
 *提供一个接口执行命令，从而将执行者与命令分开
 */
public interface Command {

	public void execute();
	
}
