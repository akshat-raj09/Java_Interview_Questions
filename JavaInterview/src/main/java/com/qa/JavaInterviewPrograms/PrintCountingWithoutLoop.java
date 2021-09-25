package com.qa.JavaInterviewPrograms;

import java.util.stream.IntStream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Print the numbers from 1 to 100 without using loops
 * by using recursion
 * by using java streams
 */

 /*
 public static int i=1;
 public static int count(int num){
     if(i>=num+1){
         return 0;
     }
     System.out.println(i);
     i++;
     count(num);
     return 0;
 }
 */

public class PrintCountingWithoutLoop {

    //Initialize Log4j instance
	private static final Logger log =  LogManager.getLogger(PrintCountingWithoutLoop.class);

	public static void test() {

        count(1,100);
        System.out.println("=================================\n");
        // using java streams
        IntStream.range(1, 101).forEach(e -> System.out.println(e));
    }

    public static void count(int start, int end){
        if(start <= end){
            System.out.println(start);
            start++;
            count(start, end);
        }
    }
    
}
