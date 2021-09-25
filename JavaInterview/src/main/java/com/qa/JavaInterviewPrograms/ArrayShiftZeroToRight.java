package com.qa.JavaInterviewPrograms;

import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Shift all 0 elements in an array to right end of the array.
 * using a new array
 * using brute force & swapping elements (System.arrayCopy())
 */

public class ArrayShiftZeroToRight {

    //Initialize Log4j instance
	private static final Logger log =  LogManager.getLogger(ArrayShiftZeroToRight.class);

	public static void test() {

        int count = 0;
        int arr[] = {1, 0, 8, 0, 0, 5, 1, 3, 0, 2, 0};
        int a[] = new int[arr.length];

        System.out.println("Original array is :");
        System.out.println(Arrays.toString(arr));

        // using a new array
        for(int i : arr){
            if(i==0)
            continue;
            else{
                a[count] = i;
                count++;
            }
        }

        // we can use this loop if the element is other than 0 becoz default value of int[] is 0
        // for(int j=count+1; j<arr.length; j++){
        //     if(arr[j] == 0) // condition for elements that we need to transfer to right end of array
        //     a[j] = arr[j];
        // }
            
        System.arraycopy(a, 0, arr, 0, arr.length);

        System.out.println("==========================================");
        System.out.println("Modified array is :");
        System.out.println(Arrays.toString(arr));
    }
    
}