package com.qa.JavaInterviewPrograms;

import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Find frequency of all digits in a number in java
 * using reverse number logic & inserting the remainder digit into HashMap
 * using Long class & toString() & toCharArray() & store each digit into HashMap
 * using Long class & toString() & charAt() & store each digit into HashMap
 */

public class RepeatNumberCount {

    //Initialize Log4j instance
	private static final Logger log =  LogManager.getLogger(RepeatNumberCount.class);

	public static void test() {

        // using reverse number logic & inserting the remainder digit into HashMap
        long number = 121452187455478998l;
        long num = number, rem = 0;

        Map<Long, Long> map = new HashMap<Long, Long>();

        while(num > 0){
            rem = num % 10;
            num = num / 10;

            if(map.containsKey(rem)){
                map.put(rem, map.get(rem) + 1);
            }
            else{
                map.put(rem, 1L);
            }
        }

        //  Print the HashMap
        Set<Entry<Long, Long>> entrySet = map.entrySet();
        for (Entry<Long,Long> entry : entrySet) {
            System.out.println("(key) " + entry.getKey() + " : " + entry.getValue() + " (value)");
        }

    }
    
}