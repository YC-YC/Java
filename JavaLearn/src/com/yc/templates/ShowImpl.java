/**
 * 
 */
package com.yc.templates;

import java.util.Date;

/**
 * @author YC2
 * @time 2017-10-20 下午6:04:12
 * TODO:
 */
public class ShowImpl implements IShow<String, Date>{

	@Override
	public void show(String t, Date u) {
		System.out.println("para1 = " + t);
		System.out.println("para2 = " + u);
	}

}
