package com.yc.strategy.role;

import com.yc.strategy.methodinterface.IAttackBehavior;
import com.yc.strategy.methodinterface.IDefendBehavior;
import com.yc.strategy.methodinterface.IDisplayBehavior;
import com.yc.strategy.methodinterface.IRunBehavior;

/**
 *@Author Administrator
 *@Time 2016-3-29 ÏÂÎç9:59:34
 */
public abstract class Role {

	protected String name;
	
	private IAttackBehavior mAttackBehavior;
	private IDefendBehavior mDefendBehavior;
	private IDisplayBehavior mDisplayBehavior;
	private IRunBehavior mRunBehavior;
	
	public Role setmAttackBehavior(IAttackBehavior mAttackBehavior) {
		this.mAttackBehavior = mAttackBehavior;
		return this;
	}
	public Role setmDefendBehavior(IDefendBehavior mDefendBehavior) {
		this.mDefendBehavior = mDefendBehavior;
		return this;
	}
	public Role setmDisplayBehavior(IDisplayBehavior mDisplayBehavior) {
		this.mDisplayBehavior = mDisplayBehavior;
		return this;
	}
	public Role setmRunBehavior(IRunBehavior mRunBehavior) {
		this.mRunBehavior = mRunBehavior;
		return this;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void attack()
	{
		this.mAttackBehavior.attack();
	}
	
	public void run()
	{
		this.mRunBehavior.run();
	}
	
	public void display()
	{
		this.mDisplayBehavior.display();
	}
	
	public void defend()
	{
		this.mDefendBehavior.defend();
	}
	
	
}
