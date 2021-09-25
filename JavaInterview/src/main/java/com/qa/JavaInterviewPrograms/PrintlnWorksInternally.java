package com.qa.JavaInterviewPrograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * How System.out.println() works in java
 * System is a class inside java.lang package. 
 * Constructor of System class is private so we cannot create its object
 * 
 * out is an public static final instance variable of PrintStream class (inside io package) whose value is null. 
 * out is initialized by public static void setOut(PrintStream out). 
 * setOut(PrintStream out) method is calling setOut0(out) method.
 * setout0() is declared with native keyword & is called internally by JVM & is written in System.c file (written in c language).
 * 
 * println() is a method of PrintStream class which in turn calls newLine()
 */

public class PrintlnWorksInternally {

    //Initialize Log4j instance
	private static final Logger log =  LogManager.getLogger(PrintlnWorksInternally.class);

	public static void test() {

        System.out.println("read the program's comments for Q&A");

    }
    
}
