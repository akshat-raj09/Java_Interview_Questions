package com.qa.JavaInterviewPrograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Convert a String to a number without using Integer.parseInt()
 * 
 * First checking if the number(String) contains digits only. After it using charAt() and 
 * reverse number logic & ASCII conversion to convert the String number to integer.
 */

public class StringToNumber {

    //Initialize Log4j instance
	private static final Logger log =  LogManager.getLogger(StringToNumber.class);

	public static void test() {

        String number = "1234567890";

        long num = convertNumber(number);

        if(num==0)
        System.out.println(number + " is not a valid number");
        else
        System.out.println(number + " is a valid number : " + num);

    }

    // function to check if the number(String) contains digits only
    public static boolean isValidNumber(String number) {

        int length = number.length();
        int count = 0, j = 0;

        if(number.charAt(0) == '-' || number.charAt(0) == '+'){
            j = j+1;
            count = count+1;
        }

        for(int i=j; i<length; i++){
            if(number.charAt(i) < '0' || number.charAt(i) > '9'){
                continue;
            }
            else{
                count++;
            }
        }

        if(length == count){
            return true;
        }
        else{
            return false;
        }
        
    }


    // convert the number(String) to integer after checking if the number(String) contains digits only
    public static long convertNumber(String number) {

        int length = number.length();
        int j = 0;
        long num = 0, digit=0;
        boolean negativeFlag = false;

        if(isValidNumber(number)){

            if(number.charAt(0) == '-' || number.charAt(0) == '+'){
                j = j+1;
                if(number.charAt(0) == '-')
                negativeFlag = true;
            }

            for(int i=j; i<length; i++){

                digit = ((long) (number.charAt(i) - '0'));
                num = (num * 10) + digit;
                /*
                switch (number.charAt(i)) {
                    case '0':
                    digit=0;
                    break;
                    case '1':
                    digit=1;
                    break;
                    case '2':
                    digit=2;
                    break;
                    case '3':
                    digit=3;
                    break;
                    case '4':
                    digit=4;
                    break;
                    case '5':
                    digit=5;
                    break;
                    case '6':
                    digit=6;
                    break;
                    case '7':
                    digit=7;
                    break;
                    case '8':
                    digit=8;
                    break;
                    case '9':
                    digit=9;
                    break;
                }
                num = (num * 10) + digit;
                */
            }
            if(negativeFlag == true){
                num = num * (-1);
            }

        }
        return num;
    }
    
}