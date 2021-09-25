package com.qa.JavaInterviewPrograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Find out one missing elements in an integer array
 * apply the formula for sum of n terms in an AP = n/2[2a + (n-1)d]
 */

public class MissingElement {

    //Initialize Log4j instance
	private static final Logger log =  LogManager.getLogger(MissingElement.class);

	public static void test() {

        int arr[] = {1,2,3,4,5,6,7,8,10};
        float d = arr[1] - arr[0];
        float n = arr.length + 1;
        float a =  arr[0];
        float expectedSum = (n/2)*((2*a) + ((n-1)*d));
        float actualSum = 0.0f;

        for(int i=0; i<arr.length; i++){
            actualSum = actualSum + arr[i];
        }

        System.out.println("Missing number is: " + (expectedSum-actualSum));


    }
    
}
