package com.qa.JavaInterviewPrograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Find whether the given substring is part of the string or not
 * using contains()
 * using indexOf()
 * without using any inbuilt method
 * using regular expressions
 */

public class SubString {

    //Initialize Log4j instance
	private static final Logger log =  LogManager.getLogger(SubString.class);

	public static void test() {

        int count=0;
        String s = "  This is a test string message  ";
        String sub = "string";

        // s = s.trim(); // if we are finding spaces then we don't need to use trim()

        // using contains()
        System.out.println("\"" + sub + "\"" + " is a part of " + "\"" + s.trim() + "\"" + " : " + s.contains(sub));

        // using indexOf()
        System.out.println("\"" + sub + "\"" + " is a part of " + "\"" + s.trim() + "\"" + " : " + (s.indexOf(sub) != -1));

        // without using inbuilt methods
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == sub.charAt(0)){
                for(int j=0; j<sub.length(); j++){
                    if(sub.charAt(j) == s.charAt(i + j)){
                        count++;
                    }
                }
            }
            if(count == sub.length())
            break;
            count=0;
        }
        System.out.println("\"" + sub + "\"" + " is a part of " + "\"" + s.trim() + "\"" + " : " + (count == sub.length()));
    
        // using regular expressions
        boolean b = s.matches(".*" + sub + ".*");
        System.out.println("\"" + sub + "\"" + " is a part of " + "\"" + s.trim() + "\"" + " : " + b);

    }
    
}