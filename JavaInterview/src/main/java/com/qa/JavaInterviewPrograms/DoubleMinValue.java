package com.qa.JavaInterviewPrograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Which is bigger Double MIN_Value or 0.0d ? (same que for Float also) ---> Answer: Double MIN_VALUE
 * what is the value of Double MIN_VALUE & Float MIN_VALUE, Integer MIN_VALUE, Long MIN_VALUE
 */

public class DoubleMinValue {

	//Initialize Log4j instance
	private static final Logger log =  LogManager.getLogger(DoubleMinValue.class);

	public static void test() {

		System.out.println("Minimum Values ----------->>>>>>>");
		System.out.println("Double minimum value: " + Double.MIN_VALUE); // +ve value
		System.out.println("Float minimum value: " + Float.MIN_VALUE); // +ve value
		System.out.println("Integer minimum value: " + Integer.MIN_VALUE); // -ve value
		System.out.println("Long minimum value: " + Long.MIN_VALUE); // -ve value

		System.out.println("\nMaximum Values ----------->>>>>>>");
		System.out.println("Double maximum value: " + Double.MAX_VALUE); // +ve value
		System.out.println("Float maximum value: " + Float.MAX_VALUE); // +ve value
		System.out.println("Integer maximum value: " + Integer.MAX_VALUE); // +ve value
		System.out.println("Long maximum value: " + Long.MAX_VALUE); // +ve value

	}

}
