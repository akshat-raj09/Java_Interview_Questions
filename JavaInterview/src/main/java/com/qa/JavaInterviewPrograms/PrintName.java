package com.qa.JavaInterviewPrograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Print your name 1000 times without using loop or recursion.
 */

public class PrintName {

    //Initialize Log4j instance
	private static final Logger log =  LogManager.getLogger(PrintName.class);

	public static void test() {

        String name = "Akshat ", i = "i";

        i = i.replaceAll("i", "iiiiiiiiii"); // 10
        i = i.replaceAll("i", "iiiiiiiiii"); // 10x10 = 100
        i = i.replaceAll("i", "iiiiiiiiii"); // 100x10 = 1000
        i = i.replaceAll("i", "iiiiiiiiii");
        name = i.replaceAll("i", name);

        System.out.println(name);

    }
    
}