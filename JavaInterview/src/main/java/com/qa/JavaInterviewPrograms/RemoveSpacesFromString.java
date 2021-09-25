package com.qa.JavaInterviewPrograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Remove all the White spaces from the string using
 * StringBuilder & split()
 * for loop & chatAt()
 * replace()
 */

 public class RemoveSpacesFromString {

    //Initialize Log4j instance
	private static final Logger log =  LogManager.getLogger(RemoveSpacesFromString.class);

	public static void test() {

        String test = "   this is a test string      " + "\n\n\t message\n" + "\tjava\n";
        StringBuilder sb = new StringBuilder();
        StringBuilder outString = new StringBuilder();
        String strs[];

        System.out.println("Original String : \n" + test + "\n===================================");

        // using StringBuilder & split()
        strs = test.split("\\s");
        for(String s : strs){
            sb.append(s);
        }
        System.out.println(sb.toString() + "\n==================================");

        // using for loop & charAt()
        for(int i=0; i<test.length(); i++){
            if(test.charAt(i) != ' ' && test.charAt(i) != '\t' && test.charAt(i) != '\n')
            outString.append(test.charAt(i));
        }
        System.out.println(outString.toString() + "\n==================================");

        // using replaceAll()
        test = test.replaceAll("\\s", "");
        System.out.println(test);

    }
    
}
