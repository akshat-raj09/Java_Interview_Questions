package com.qa.JavaInterviewPrograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * What will the output when you use a long number with L & without L in suffix ?
 * with L ---> 31536000000 (Answer) ---> 36 bits ---> 11101010111101100010010110000000000
 * therefore java will convert this 36 bit number to 32 bit integer value by deleting 4 most significant bits
 * without L ---> 36 bit to 32 bit conversion ---> 1010111101100010010110000000000 ---> 1471228928 (Answer)
 */

public class LongNumberWithoutL {
	
	//Initialize Log4j instance
		private static final Logger log =  LogManager.getLogger(LongNumberWithoutL.class);

		public static void test() {
			
			long longNumberWithoutL = 1000*60*60*24*365; // 1471228928
			long longNumberWithL = 1000*60*60*24*365L; // 31536000000
			
			System.out.println("Long number with L: " + longNumberWithL); // 31536000000
			System.out.println("Long number without L: " + longNumberWithoutL); // 1471228928
			
		}

}
