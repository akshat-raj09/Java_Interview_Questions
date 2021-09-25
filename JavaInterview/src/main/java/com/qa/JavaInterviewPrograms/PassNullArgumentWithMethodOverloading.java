package com.qa.JavaInterviewPrograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Pass null argument with method overloading with String & Object types & see which function is called.
 * String argument method will be called as String is child of Object class.
 */

public class PassNullArgumentWithMethodOverloading {

	//Initialize Log4j instance
	private static final Logger log =  LogManager.getLogger(PassNullArgumentWithMethodOverloading.class);

	public static void test(String s) {
		System.out.println("String Argument");
	}

	public static void test(Object o) {
		System.out.println("Object Argument");
	}

}
