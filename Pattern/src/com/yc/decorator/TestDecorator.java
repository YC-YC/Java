package com.yc.decorator;
/**
 *@Author Administrator
 *@Time 2016-4-7 上午12:16:08
 *
 *与代理模式的区别是：代理模式可以选择不执行底层方法，装饰者模式需要一定执行（这样才起到装饰的作用）
 */
public class TestDecorator {

	public static void main(String[] args) {

		System.out.println("2两红宝石，1颗蓝宝石装饰的武器");
		IEquip equip = new RedDiamondDecorator(new RedDiamondDecorator(new YellowDiamondDecorator(new ArmEquip())));
	
		System.out.println("攻击力为：" + equip.attack());
		System.out.println("描述为：" + equip.description());
	}

}
