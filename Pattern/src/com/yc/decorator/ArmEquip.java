package com.yc.decorator;
/**
 *@Author Administrator
 *@Time 2016-4-7 ÉÏÎç12:19:31
 */
public class ArmEquip implements IEquip {

	@Override
	public int attack() {
		return 20;
	}

	@Override
	public String description() {
		return "ÍÀÁúµ¶";
	}

}
