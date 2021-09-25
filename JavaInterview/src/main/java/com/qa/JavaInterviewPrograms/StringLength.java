package com.qa.JavaInterviewPrograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Findthe length of the String without using the length()
 */

public class StringLength {

    //Initialize Log4j instance
	private static final Logger log =  LogManager.getLogger(StringLength.class);

	public static void test() {

        String str = "test string";

        // 1. 
        System.out.println("Length of " + str + " is: " + str.toCharArray().length);

        // 2.
        System.out.println("Length of " + str + " is: " + str.lastIndexOf(""));
        
        // 3.
        int count = 0;
        char ch[] = str.toCharArray();
        for(char c : ch){
            count++;
        }
        System.out.println("Length of " + str + " is: " + count);

        // 4.
        count=0;
        try{
            while(true){
                str.charAt(count);
                count++;
            }
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Length of " + str + " is: " + count);
        }
        
    }
    
}
