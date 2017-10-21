package com.yc.factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 *@Author Administrator
 *@Time 2016-4-1 ÉÏÎç12:08:43
 */
public class PropertiesReader {

	public Map<String, String> getProgerties()
	{
		Properties pro = new Properties();
		
		Map<String, String> map = new HashMap<String, String>();

		try {
			InputStream inputStream = getClass().getResourceAsStream("type.properties");
			pro.load(inputStream);
			Enumeration en = pro.propertyNames();
			while (en.hasMoreElements())
			{
				String key = (String) en.nextElement();
				String val = pro.getProperty(key);
				map.put(key, val);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return map;
	}

}
