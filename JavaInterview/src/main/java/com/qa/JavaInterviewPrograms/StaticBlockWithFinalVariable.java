package com.qa.JavaInterviewPrograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StaticBlockWithFinalVariable {

	//Initialize Log4j instance
	private static final Logger log =  LogManager.getLogger(StaticBlockWithFinalVariable.class);

	public static void test() {

		System.out.println(Test.x);
		/*
		 * Main.x is replaced by 100 in bytecode therefore static block is not executed before main()
		 * otherwise normally static block is executed before main() & constructor
		 */
		System.out.println("---------------------");
		System.out.println(Test.y);

	}

}

class Test{

	public static final int x = 100;
	public static int y = 100;

	static {
		System.out.println("Main class static block");
	}

}
