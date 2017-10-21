package com.yc.strategy.role;

import com.yc.strategy.methodinterface.AttackJYSG;
import com.yc.strategy.methodinterface.AttackXLSBZ;
import com.yc.strategy.methodinterface.DefendTBS;
import com.yc.strategy.methodinterface.Display1;
import com.yc.strategy.methodinterface.Display2;
import com.yc.strategy.methodinterface.RunJCTQ;
import com.yc.strategy.methodinterface.RunYWD;

/**
 *@Author Administrator
 *@Time 2016-3-29 下午10:09:04
 *
 *策略模式:
 *	定义很多算法族，分别封装起来，让它们之间可相互替换，此模式让算法的变化独立于使用算法的客户
 *	每个客户根据自己需要使用不同的技能方法（感觉像大杂烩，要什么技能就从技能库中new一个）
 *
 */
public class StrategyMain {

	public static void main(String[] args) {
		Role role = new RoleA("角色1");
		role.setmAttackBehavior(new AttackJYSG())
			.setmDefendBehavior(new DefendTBS())
			.setmDisplayBehavior(new Display1())
			.setmRunBehavior(new RunYWD());
		
		System.out.println(role.getName() + ":");
		role.attack();
		role.defend();
		role.display();
		role.run();
		
		System.out.println("\n----------------\n");
		
		role = new RoleB("角色2");
		role.setmAttackBehavior(new AttackXLSBZ())
			.setmDefendBehavior(new DefendTBS())
			.setmDisplayBehavior(new Display2())
			.setmRunBehavior(new RunJCTQ());
		
		System.out.println(role.getName() + ":");
		role.attack();
		role.defend();
		role.display();
		role.run();
	}

}
