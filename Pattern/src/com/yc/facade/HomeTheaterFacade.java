package com.yc.facade;
/**
 *@Author Administrator
 *@Time 2016-4-13 上午12:32:52
 */
public class HomeTheaterFacade {

	/**
	 * 需求：
	 * 1、看电影需要
	 * 		打开电脑
	 * 		打开播放器
	 * 		播放
	 * 		
	 * 2、关闭电影
	 * 		停止播放	
	 * 		关闭播放器
	 * 		关闭电脑
	 */
	private Computer computer;
	private Player player;
	private Control control;
	public HomeTheaterFacade(Computer computer, Player player, Control control) {
		super();
		this.computer = computer;
		this.player = player;
		this.control = control;
	}
	
	public void watchMovie(){
		this.computer.on();
		this.player.open();
		this.control.play();
	}
	
	public void stopMovie(){
		this.control.stop();
		this.player.close();
		this.computer.off();
	}
}
