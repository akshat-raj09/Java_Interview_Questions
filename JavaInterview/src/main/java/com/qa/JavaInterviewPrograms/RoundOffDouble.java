package com.qa.JavaInterviewPrograms;

import java.text.DecimalFormat;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * How to round off double / float numbers
 */

public class RoundOffDouble {

    //Initialize Log4j instance
	private static final Logger log =  LogManager.getLogger(RoundOffDouble.class);

	public static void test() {

        double number = 163.333333;
        float num = 12.9999f;

        DecimalFormat formatter = new DecimalFormat("###.##");
        System.out.println(number + " is now : " + formatter.format(number));
        System.out.println(num + " is now : " + formatter.format(num));

    }
    
}