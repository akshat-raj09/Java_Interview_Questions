package com.qa.JavaInterviewPrograms;

import java.util.Arrays;
import java.util.BitSet;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Print counting from 1 to 100 without using loops & recursion.
 * using Arrays.fill() & overriding toString()
 * using BitSet
 */

public class PrintCountingWithoutLoopRecursion {

    //Initialize Log4j instance
	private static final Logger log =  LogManager.getLogger(PrintCountingWithoutLoopRecursion.class);

	public static void test() {

        Object num[] = new Object[100];
        
        Arrays.fill(num, new Object(){
            int count = 1;
            @Override
            public String toString(){
                return Integer.toString(count++);
            }
        });

        System.out.println(Arrays.toString(num));

        System.out.println("======================================================================");

        // using BitSet
        String set = new BitSet() {{set(1, 101);}}.toString();
        System.out.append(set, 1, set.length());  // System.out.println(set);

    }
    
}