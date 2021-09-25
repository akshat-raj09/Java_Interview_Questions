package com.qa.JavaInterviewPrograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * What is the maximum number of parameters that a method can take in java
 * for non static int, short, byte, float & classtypes limit is 254
 * for static int, short, byte, float & classtypes limit is 255
 * 
 * for static & non static long & double limit is 127
 * 
 * double --> 8 bytes
 * int --> 4 bytes
 */

public class MaxMethodParameters {

    //Initialize Log4j instance
	private static final Logger log =  LogManager.getLogger(MaxMethodParameters.class);

	public static void test() {

        System.out.println("read the program's comments for Q&A");

    }
    
}
