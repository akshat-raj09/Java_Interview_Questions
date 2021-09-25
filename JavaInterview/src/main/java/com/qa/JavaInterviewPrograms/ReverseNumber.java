package com.qa.JavaInterviewPrograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Reverse a number using any technique.
 */

public class ReverseNumber {

    //Initialize Log4j instance
	private static final Logger log =  LogManager.getLogger(ReverseNumber.class);

	public static void test() {

        long number = 123456789l;
        long num = number;
        long rem = 0, rev = 0;

        while(num>0){
            rem = num % 10;
            num = num / 10;
            rev = rev*10 + rem;
        }

        System.out.println("Original number : " + number + ", Reversed number : " + rev);

    }
    
}