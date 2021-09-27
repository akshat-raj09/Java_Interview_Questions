package com.qa.JavaInterviewPrograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Compare two Integer numbers (Integer caching)
 * 
 * Integer Caching was introduced to save the memory and improve performance for Integer type objects handling. 
 * Integer objects are cached internally and reused via the same referenced objects.
 * 
 * This is applicable for Integer values in the range between –128 to +127.
 * Integer caching works only on auto-boxing (Conversion from a primitive type to an object reference
 * is called autoboxing). 
 * Integer objects will not be cached when they are built using the constructor.
 * Integer a = 10; // this is autoboxing
 * Integer b = new Integer(40); // this is not autoboxing
 */

public class IntegerCaching {

	//Initialize Log4j instance
	private static final Logger log =  LogManager.getLogger(IntegerCaching.class);

	public static void test() {

		// In range declaration (-128 to 127) then object reference will be same.
		Integer n1 = 100;
		Integer n2 = 100;

		// Not in range declaration (-128 to 127) then object reference will not be same in this case.
		Integer n3 = 129;
		Integer n4 = 129;

		// Then it will be true because both value of n1 and n2 will point to the same object reference.
		if(n1==n2) {
			System.out.println("100 == 100");
		}
		else {
			System.out.println("100 != 100");
		}

		// Then it will be false because both value of n3 and n4 will point to the different memory location.
		if(n3==n4) {
			System.out.println("129 == 129");
		}
		else {
			System.out.println("129 != 129");
		}

	}

}
