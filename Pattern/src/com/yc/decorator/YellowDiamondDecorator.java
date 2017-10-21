package com.yc.decorator;
/**
 *@Author Administrator
 *@Time 2016-4-7 ÉÏÎç12:23:57
 */
public class YellowDiamondDecorator implements IEquipDecorator {

	private IEquip equip;
	
	
	public YellowDiamondDecorator(IEquip equip) {
		super();
		this.equip = equip;
	}

	@Override
	public int attack() {
		return 5 + equip.attack();
	}

	@Override
	public String description() {
		return equip.description() + " + »Æ±¦Ê¯";
	}

}
