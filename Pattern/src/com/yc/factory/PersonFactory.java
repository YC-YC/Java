package com.yc.factory;

import com.yc.factory.concrete.Boy;
import com.yc.factory.concrete.Girl;

/**
 * @author Administrator
 * @time 2016-4-1
 * 抽象工厂：负责管理一类事件
 */
public interface PersonFactory {
	public Boy getBoy();
	public Girl getGirl();
}
