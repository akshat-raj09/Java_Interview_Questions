package com.qa.JavaInterviewPrograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * can we execute comments in java
 * yes by using \u008d unicode character
 */

public class ExecuteComments {

    //Initialize Log4j instance
	private static final Logger log =  LogManager.getLogger(ExecuteComments.class);

	public static void test() {
        // this is a test comment. \u008dSystem.out.println("Hello World");
    }
    
}
