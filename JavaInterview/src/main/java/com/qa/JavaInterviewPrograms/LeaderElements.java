package com.qa.JavaInterviewPrograms;

import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Find out all the leader elements in an array
 * 
 * A leader element is an element who is greater than all the elements to its right & 
 * the last element of an array is always a leader element.
 * 
 * using a method that has complexity of O(n)
 * using a method that has complexity of O(n^2)
 */

public class LeaderElements {

    //Initialize Log4j instance
	private static final Logger log =  LogManager.getLogger(LeaderElements.class);

	public static void test() {

        int number[] = {92, 12, 7, 78, 9, 8, 3, 14, 31, 2};        

        System.out.println("Original Array is : " + Arrays.toString(number));

        int leader[] = leader(number);

        System.out.println("============================================================");

        System.out.println("Leader elements are : " + Arrays.toString(leader));

        System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");

        System.out.println("Original Array is : " + Arrays.toString(number));

        leader = leader(number);

        System.out.println("============================================================");

        System.out.print("Leader elements are : " + Arrays.toString(leader));

    }


    // using a method that has complexity of O(n)
    public static int[] leaderElements(int number[]) {

        int leader[] = new int[number.length];
        int leaderIndex = 0;

        leader[0] = number[number.length-1];
        leaderIndex++;

        for(int i = number.length-2; i>=0; i--){
            if(number[i] > leader[leaderIndex]){
                leader[leaderIndex+1] = number[i];
                leaderIndex++;
            }
        }

        return leader;
        
    }


    // using a method that has complexity of O(n^2)
    public static int[] leader(int number[]) {

        int leader[] = new int[number.length];
        int leaderIndex = 0, count = 0;

        for(int i=0; i<number.length; i++){
            for(int j=i+1; j<number.length; j++){
                if(number[i] > number[j]){
                    count++;
                }
                else{
                    continue;
                }
            }
            if(count == number.length -1 - i){
                leader[leaderIndex] = number[i];
                leaderIndex++;
            }
            count=0;
        }

        return leader;
        
    }
    
}