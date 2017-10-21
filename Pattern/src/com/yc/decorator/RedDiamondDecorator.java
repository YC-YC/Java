package com.yc.decorator;
/**
 *@Author Administrator
 *@Time 2016-4-7 ÉÏÎç12:23:57
 */
public class RedDiamondDecorator implements IEquipDecorator {

	private IEquip equip;
	
	
	public RedDiamondDecorator(IEquip equip) {
		super();
		this.equip = equip;
	}

	@Override
	public int attack() {
		return 2 + equip.attack();
	}

	@Override
	public String description() {
		return equip.description() + " + ºì±¦Ê¯";
	}

}
