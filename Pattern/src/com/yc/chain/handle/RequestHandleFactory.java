package com.yc.chain.handle;
/**
 *@Author Administrator
 *@Time 2016-3-31 下午11:15:08
 *
 *该类的作用是为了更符合OO设计模式，将本来在RequestHandle中可以处理的东西移开，这样单个类处理单种业务
 *
 */
public class RequestHandleFactory {

	/**工厂类方法*/
	public static RequestHandle createHandle() {
		RequestHandle sales = new Sales();
		RequestHandle leader = new Leader();
		RequestHandle manager = new Manager();
		RequestHandle ceo = new CEO();
		
		/**设置责任链*/
		sales.setSuccessor(leader);
		leader.setSuccessor(manager);
		manager.setSuccessor(ceo);
		
		return sales;
	}

}
