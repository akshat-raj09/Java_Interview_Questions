package com.qa.JavaInterviewPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Join two Arrays -->
 * using for loops
 * using List
 * using arrayCopy() :-
 * System.arraycopy(Object src, int src_position, Object dest, int dest_position, int length) 
 * length: number of elements to be copied
 */

public class ArraysJoin {

    //Initialize Log4j instance
	private static final Logger log =  LogManager.getLogger(ArraysJoin.class);

	public static void test() {

        int index = 0;
        String arr1[] = {"rohit", "virat", "dhawan", "sachin", "dravid", "sehwag"};
        String arr2[] = {"hardik", "bhuvi", "bumrah", "chahal", "jadeja"};

        String arr[] = new String[arr1.length + arr2.length];

        // 1. using for loop
        for(String s : arr1){
            arr[index] = s;
            index++;
        }
        for(String s : arr2){
            arr[index] = s;
            index++;
        }

        for(String s : arr)
        System.out.println(s);

        System.out.println("=============================================");

        // 2. using List
        List<String> list = new ArrayList<String>(Arrays.asList(arr1));
        list.addAll(Arrays.asList(arr2));
        Object joinedArray[] = list.toArray();

        for(Object o : joinedArray)
        System.out.println(o.toString());
        
    }
    
}
