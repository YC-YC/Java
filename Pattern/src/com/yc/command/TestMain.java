package com.yc.command;
/**
 *@Author Administrator
 *@Time 2016-4-9 上午12:02:09
 *
 *定义：将“请求”封装成对象，以便使用不同的请求、队列或者日志来参数化其他对象。命令模式也支持可撤销的操作。
 *简化一下：将请求封装成对象，将动作请求者和动作执行者解耦
 *命令模式就是把命令封装成对象，然后将动作请求者与动作执行者完全解耦，上例中遥控器的按钮和电器一毛钱关系都没
 *
 */
public class TestMain {

	public static void main(String[] args) {

		Door mDoor = new Door();
		Light mLight = new Light();
		Computer mComputer = new Computer();
		
		ControlCenter controlCenter = new ControlCenter();
		controlCenter.setCommand(0, new DoorOpenCommand(mDoor));
		controlCenter.setCommand(1, new DoorCloseCommand(mDoor));
		controlCenter.setCommand(2, new LightOnCommand(mLight));
		controlCenter.setCommand(3, new LightOffCommand(mLight));
		controlCenter.setCommand(4, new ComputerOnCommand(mComputer));
		controlCenter.setCommand(5, new ComputerOffCommand(mComputer));
		
		controlCenter.onKeyDown(0);
		controlCenter.onKeyDown(1);
		controlCenter.onKeyDown(2);
		controlCenter.onKeyDown(3);
		controlCenter.onKeyDown(4);
		controlCenter.onKeyDown(5);
		
		QuickCommand quickCommand = new QuickCommand(new Command[]{
				new DoorOpenCommand(mDoor),
				new LightOnCommand(mLight),
				new DoorCloseCommand(mDoor),
				new ComputerOnCommand(mComputer),
		});
		controlCenter.setCommand(6, quickCommand);
		controlCenter.onKeyDown(6);
	}

}
