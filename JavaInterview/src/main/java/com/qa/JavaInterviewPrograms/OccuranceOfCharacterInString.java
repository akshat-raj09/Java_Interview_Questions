package com.qa.JavaInterviewPrograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Count occurances of a character in String
 * by using HashMap & toCharArray() - similar approach as in DuplicateCharacterInString.java
 * by using for loop & charAt(int index)
 * by using toCharArray & for loop
 */

public class OccuranceOfCharacterInString {

    //Initialize Log4j instance
	private static final Logger log =  LogManager.getLogger(OccuranceOfCharacterInString.class);

	public static void test() {
        duplicate("Hi, this is a test message to test the program", 't');
    }

    public static void duplicate(String s, char c) {

        int count=0, counter=0;

        if(s==null)
        return;

        if(s.isEmpty())
        return;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == c){
                count++;
            }
        }
        System.out.println(c + " : " + count);
        
        char chs[] = s.toCharArray();
        for(Character ch : chs){
            if(ch == c){
                counter++;
            }
        }
        System.out.println(c + " : " + counter);
    }
    
}
