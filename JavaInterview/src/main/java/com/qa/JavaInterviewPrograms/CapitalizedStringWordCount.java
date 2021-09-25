package com.qa.JavaInterviewPrograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Find the count of total words in a given Capitalized String
 * using charAt()
 * using toCharArray()
 * using ASCII range : (i) 65-'A' to 90-'Z',  (ii) 97-'a' to 122-'z',   (iii) 48-'0' to 57-'9'
 * using Character.isUpperCase(str.charAt(i))
 * using split("[A-Z]")
 */

public class CapitalizedStringWordCount {

    //Initialize Log4j instance
	private static final Logger log =  LogManager.getLogger(CapitalizedStringWordCount.class);

	public static void test() {

        int count = 0;
        String s = "HiThisIsATestString";

        s = s.trim();

        char ch[] = s.toCharArray();

        // using charAt()
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                count++;
            }
        }
        System.out.println("Number of words in " + s + " are: " + count);

        // using toCharArray()
        count=0;
        for(int i=0; i<ch.length; i++){
            if(ch[i] >= 'A' && ch[i] <= 'Z'){
                count++;
            }
        }

        System.out.println("Number of words in " + s + " are: " + count);

    }
    
}