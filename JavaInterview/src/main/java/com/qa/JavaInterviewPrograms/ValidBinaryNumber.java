package com.qa.JavaInterviewPrograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Check if a given number is a valid binary number or not
 * using for loop till length of number(String) & charAt() & ASCII comparision
 * using for loop till length of number(String) & toCharArray() & ASCII comparision
 * using reverse number logic (in while loop) & compairing the remainder is either 0 or 1
 * using regular expressions :- String.valueOf(number).matches("[0-1]+")
 * using try-catch & Long.parseLong(String.valueOf(number), 2);  [2 is the base of the number]
 */

public class ValidBinaryNumber {

    //Initialize Log4j instance
	private static final Logger log =  LogManager.getLogger(ValidBinaryNumber.class);

	public static void test() {

        long number = 101100110101l;
        System.out.println(isBinary(number));

    }

    // using reverse number logic (in while loop) & compairing the remainder is either 0 or 1
    public static boolean isBinary(long number) {

        long num = number, rem = 0;

        if(num < 0){
            num = num * (-1);
        }

        while(num > 0){
            
            rem = num % 10;
            num = num / 10;
            if(rem > 1){
                System.out.print("Is " + number + " a valid binary number : ");
                return false;
            }
        }

        System.out.print("Is " + number + " a valid binary number : ");
        return true;        
    }
    
}