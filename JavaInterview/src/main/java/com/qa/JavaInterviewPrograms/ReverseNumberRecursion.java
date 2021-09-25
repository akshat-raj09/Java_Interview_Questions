package com.qa.JavaInterviewPrograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Reverse a number using recursion
 */

public class ReverseNumberRecursion {

    //Initialize Log4j instance
	private static final Logger log =  LogManager.getLogger(ReverseNumberRecursion.class);

    private static long rev = 0;

	public static void test() {

        long num = 123456789l;
        System.out.println("Original number : " + num + ", Reversed number : " + reverse(num));

    }

    public static long reverse(long number) {

        if(number < 10){

            rev = rev*10 + number;
            return rev;
        }

        else{

            rev = rev*10 + (number%10);
            reverse(number/10);
            return rev;
        }    
    }
    
}