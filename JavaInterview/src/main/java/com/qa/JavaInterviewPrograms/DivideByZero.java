package com.qa.JavaInterviewPrograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * What will the output when you divide a number (Integer, Double, Float) by zero
 */

public class DivideByZero {

	//Initialize Log4j instance
	private static final Logger log =  LogManager.getLogger(DivideByZero.class);

	public static void test() {

		try {
			System.out.println(9/0); // ArithematicException
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println(123.12f/0); // Infinity
		System.out.println(123.12f/0.0); // Infinity
		System.out.println(123.3674756d/0.0); // Infinity
		System.out.println(0.0/0.0); // NaN
		System.out.println(0.0/0); // NaN

	}

}
