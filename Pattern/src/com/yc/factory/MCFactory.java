package com.yc.factory;

import com.yc.factory.concrete.Boy;
import com.yc.factory.concrete.Girl;
import com.yc.factory.concrete.MCBoy;
import com.yc.factory.concrete.MCGirl;

public class MCFactory implements PersonFactory {

	@Override
	public Boy getBoy() {
		// TODO Auto-generated method stub
		return new MCBoy();
	}

	@Override
	public Girl getGirl() {
		// TODO Auto-generated method stub
		return new MCGirl();
	}

}
