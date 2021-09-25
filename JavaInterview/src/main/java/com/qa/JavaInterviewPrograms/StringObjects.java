package com.qa.JavaInterviewPrograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * How many String objects will be created
 * In total 4 objects will be created by this program : 2 by s1 + 1 by s2 + 1 by s3.
 */

public class StringObjects {

	//Initialize Log4j instance
	private static final Logger log =  LogManager.getLogger(StringObjects.class);

	public static void test() {

		String s1 = new String("Hello World");
		/*
		 * This line will create 2 objects :-
		 * one inside the String pool (inside Heap) &
		 * other inside the Heap but outside the String pool
		 */

		String s2 = new String("Hello World");
		/*
		 * This line will create 1 new object :-
		 * one inside the Heap but outside the String pool
		 * & it will point to same object inside String pool created by s1
		 */

		String s3 = "New World";
		String s4 = "New World";
		String s5 = s3;
		/*
		 * s3 & s4 will point to same object inside String pool becoz Strings are Immutable in Java
		 */

		System.out.println(s3 == s4); // == operator compares value as well as the object location :- true
		System.out.println(s4 == s5);

	}

}
