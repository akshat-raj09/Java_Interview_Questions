package com.qa.JavaInterviewPrograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Check if a given number is valid phone number (String) or not
 * using try-catch & Long.parseLong() & checking if length of number is 10
 * using for loop till length of number & charAt() & ASCII comparision
 * using for loop till length of number & toCharArray() & ASCII comparision
 * using reverse number logic (in while loop) & compairing the remainder is between 0 to 9
 * using regular expressions:- number.matches("[0-9]{10}")    OR    number.matches("\\d{10}")
 */

public class ValidPhoneNumber {

    //Initialize Log4j instance
	private static final Logger log =  LogManager.getLogger(ValidPhoneNumber.class);

	public static void test() {

        System.out.println(isValidPhoneNumber("1234567890"));

    }

    // using try-catch & Long.parseLong() & checking if length of number is 10
    public static boolean isValidPhoneNumber(String number) {

        if(number.length()==10 && isValidNumber(number)){
            System.out.print("Is " + number + " a valid phone number : ");
            return true;
        }

        else{
            System.out.print("Is " + number + " a valid phone number : ");
            return false;
        }
        
    }

    public static boolean isValidNumber(String number) {

        try {
            if(number.charAt(0) < '1' || number.charAt(0) > '9')
            return false;
            long num = Long.parseLong(number);
            return true;
        } 
        catch (NumberFormatException e) {
            return false;
        }
        
    }
    
}