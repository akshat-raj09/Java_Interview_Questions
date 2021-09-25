package com.qa.JavaInterviewPrograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * 1. Explain static block in java
 * static block in java is executed before the main() as soon as the class is loaded.
 * There can be multiple static blocks in a java class which will be executed in the order that they are defined
 * 
 * 
 * 2. How can we run a java program without making an object
 * by using static block & by using static methods
 * 
 * 
 * 3. static block & static method
 * static block is called automatically when the class is loaded before the main()
 * we have to call static method explicitly by using the class name
 * both static block & static method are defined at the class level
 * 
 * 
 * 4. How can we create objects if we make constructor private
 * by using singleton pattern
 * by using static method that returns a private object of the class
 * by using static block
 * 
 * 
 * 5. Is it possible to compile & write java program without main()
 * yes by using static block &by using static method
 * 
 * 
 * 6. Can we initialize member variables in static block
 * yes we can initialize static member variables directly inside static block
 * we can initialize non static member variables inside static block by creating the class object inside static block
 */

public class StaticBlockConcept{

    //Initialize Log4j instance
	private static final Logger log =  LogManager.getLogger(StaticBlockConcept.class);

	public static void test() {
        System.out.println("read the program's comments for Q&A");
    }

}