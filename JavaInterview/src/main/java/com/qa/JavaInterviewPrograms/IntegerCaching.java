package com.qa.JavaInterviewPrograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Compare two Integer numbers (Integer caching)
 * -128 to +127
 */

public class IntegerCaching {

	//Initialize Log4j instance
	private static final Logger log =  LogManager.getLogger(IntegerCaching.class);

	public static void test() {

		Integer n1 = 100;
		Integer n2 = 100;
		Integer n3 = 129;
		Integer n4 = 129;

		if(n1==n2) {
			System.out.println("100 == 100");
		}
		else {
			System.out.println("100 != 100");
		}

		if(n3==n4) {
			System.out.println("129 == 129");
		}
		else {
			System.out.println("129 != 129");
		}

	}

}
