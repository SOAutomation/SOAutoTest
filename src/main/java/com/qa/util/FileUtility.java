package com.qa.util;
import java.io.FileInputStream;

import java.util.Properties;



public class FileUtility {

	/**
	 * this method used to read data from properties
	 * @param key
	 * @return the value based on the key specified
	 * @throws Throwable
	 */
	
	public String getPropertyKeyValue(String key) throws Throwable {
		FileInputStream file=new FileInputStream("data\\commondata.properties");
		Properties prop=new Properties();
		prop.load(file);
		return prop.getProperty(key);
		
	}
	
}
