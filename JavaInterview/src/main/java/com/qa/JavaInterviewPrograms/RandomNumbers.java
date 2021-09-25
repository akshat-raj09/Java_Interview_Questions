package com.qa.JavaInterviewPrograms;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Generate random numbers
 * using Random class : nextDouble(),  nextFloat(),  nextLong(),  nextBoolean(),  nextBytes(bytes);
 * using Math.random() : this originally generates double values : (int)(Math.random() * 50)
 * using ThreadLocalRandom Class : current().nextDouble(origin, bound),  current().nextFloat(),  current().nextLong(origin, bound),  current().nextBoolean(),  current().nextBytes(bytes);
 */

public class RandomNumbers {

    //Initialize Log4j instance
	private static final Logger log =  LogManager.getLogger(RandomNumbers.class);

	public static void test() {

        // using Random class
        Random random = new Random();
        for(int i=0; i<7; i++){
            System.out.print(random.nextInt(50) + "\t"); // generates random integers upto 50
        }
        System.out.println("\n=====================================================");


        // using Math.random() : this generates double values
        for(int i=0; i<7; i++){
            System.out.print((int)(Math.random() * 50) + "\t"); // generates random integers upto 50
        }
        System.out.println("\n=====================================================");


        // using ThreadLocalRandom Class
        for(int i=0; i<7; i++){
            System.out.print(ThreadLocalRandom.current().nextInt(5, 20) + "\t"); // generates random integers between 5 to 20
        }

    }
    
}