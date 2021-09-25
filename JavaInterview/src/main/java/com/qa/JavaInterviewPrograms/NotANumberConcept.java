package com.qa.JavaInterviewPrograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * What is NaN : Not a Number
 */

public class NotANumberConcept {

	//Initialize Log4j instance
	private static final Logger log =  LogManager.getLogger(NotANumberConcept.class);

	public static void test() {

		double nan = 2.1 % 0; // NaN
		System.out.println((2.1 % 0) == nan); // false
		System.out.println(nan == nan); // false

		System.out.println(0.0/0.0); // NaN
		System.out.println(Math.sqrt(-1)); // NaN

		System.out.println(Float.NaN == Float.NaN); // false
		System.out.println(Double.NaN == Double.NaN); // false

		System.out.println(Float.NaN != Float.NaN); // true
		System.out.println(Double.NaN != Double.NaN); // true



	}

}
