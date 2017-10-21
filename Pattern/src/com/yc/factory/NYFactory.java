package com.yc.factory;

import com.yc.factory.concrete.Boy;
import com.yc.factory.concrete.Girl;
import com.yc.factory.concrete.NYBoy;
import com.yc.factory.concrete.NYGirl;

public class NYFactory implements PersonFactory {

	@Override
	public Boy getBoy() {
		// TODO Auto-generated method stub
		return new NYBoy();
	}

	@Override
	public Girl getGirl() {
		// TODO Auto-generated method stub
		return new NYGirl();
	}

}
