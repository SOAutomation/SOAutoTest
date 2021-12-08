package com.qa.util;

import java.util.Date;
import java.util.Random;

public class JavaUtility {
	/*
	 * generate random number
	 */

	public static String getRandomData() {
		Random random = new Random();
		int ran = random.nextInt(1000);
		return " " + ran;

	}
	/*
	 * generate current system date
	 */

	public static String getCurrentSystemDate() {
		Date date = new Date();
		String currentdate = date.toString();
		return currentdate.replace(" ", "_").replace(":", "_");

	}

}