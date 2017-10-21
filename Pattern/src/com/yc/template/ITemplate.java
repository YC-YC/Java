package com.yc.template;
/**
 *@Author Administrator
 *@Time 2016-3-28 下午10:19:43
 *
 *适合有统一的方法流程，有个别方法是共有的，不同的方法定义为protected abstract，让子类去实现
 *提供惟一的方法供外部调用
 *添加钩子函数，自定义某些功能
 */
public abstract class ITemplate {

	public final void prepareBaverageTemplate(){
		//将水煮沸
		boilWater();
		//泡制饮料
		brew();
		//将饮料倒入杯中
		pourInCup();
		//加入调料
		if (isCustomerCondiments())
		{
			addCondiments();
		}
		
	}

	
	private void boilWater() {
		System.out.println("将水煮沸");
	}
	
	private void pourInCup() {
		System.out.println("倒入杯中");
	}
	
	/**泡制饮料*/
	protected abstract void brew();
	/**加入调料*/
	protected abstract void addCondiments();

	/**添加钩子函数*/
	protected boolean isCustomerCondiments()
	{
		return true;
	}


	

	
}
