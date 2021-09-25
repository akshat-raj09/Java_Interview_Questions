package com.qa.JavaInterviewPrograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Find all the Armstrong Numbers between 0 to 10000 :- Armstrong Number/ Narcissistic 
 * number/ pluperfect digital invariant (PPDI) number/ plus perfect number
 * 
 * Armstrong Number is a number that is the sum of its own digits with each digit raised to the power 
 * of the number of digits. There is no negative Armstrong Number.
 * eg. 153 => 1^3 + 5^3 + 3^3 = 1 + 125 + 27 => 153
 * eg. 9474 => 9^4 + 4^4 + 7^4 + 4^4 => 9474
 * 
 * using Math.pow(base, exponent)
 * without using Math.pow(base, exponent)
 */

public class ArmstrongNumber {

    //Initialize Log4j instance
	private static final Logger log =  LogManager.getLogger(ArmstrongNumber.class);

	public static void test() {

        boolean isArmstrong;

        for(long number=0; number<10000; number++) {

            isArmstrong = isArmstrongNumber(number);
            if(isArmstrong){
                System.out.println(number + " is an Armstrong Number.");
            }
            else{
                continue;
            }

        }

    }


    public static boolean isArmstrongNumber(long number) {

        long num = number, power = 0, sum = 0, pow = 1, digit = 0;

        if(number < 0)
        return false;

        if(number >= 0 && number <= 9)
        return true;

        power = power(number);

        while(num > 0){

            digit = num % 10;
            num = num / 10;

            for(int i=0; i<power; i++){
                pow = pow * digit;
            }
            sum = sum + pow;
            pow = 1;
        }

        if(sum == number){
            return true;
        }
        else{
            return false;
        }

    }

    public static long power(long number) {

        long power = 0;

        while(number>0){
            power++;
            number = number / 10;
        }

        return power;
        
    }
    
}