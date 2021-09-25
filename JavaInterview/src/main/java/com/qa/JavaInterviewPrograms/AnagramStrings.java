package com.qa.JavaInterviewPrograms;

import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Find if two Strings are Anagram 
 * eg:- Listen & Silent
 * using toCharArray(), Arrays.sort(), & equals()
 * using HashMap<String, Integer>
 */

public class AnagramStrings {

    //Initialize Log4j instance
	private static final Logger log =  LogManager.getLogger(AnagramStrings.class);

	public static void test() {

        char comp1[], comp2[];
        int count=0;
        String str1 = "Lives";
        String str2 = "Elvis";

        // remove whitespaces from the Strings
        str1 = str1.replaceAll("\\s", "");
        str2 = str2.replaceAll("\\s", "");

        if(str1.length() == str2.length()){
            comp1 = str1.toLowerCase().toCharArray();
            comp2 = str2.toLowerCase().toCharArray();

            Arrays.sort(comp1);
            Arrays.sort(comp2);

            for(int i=0; i<comp1.length; i++){
                if(comp1[i] == comp2[i])
                count++;
            }

            if(count == comp1.length) // if(Arrays.equals(comp1, comp2))
            System.out.println(str1 + " & " + str2 + " are Anagram");
            else
            System.out.println("Not Anagram");
        }
        else
        System.out.println("Not Anagram");

    }
    
}
