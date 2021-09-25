package com.qa.JavaInterviewPrograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HelloWorldWithoutSemicolon {

	//Initialize Log4j instance
	private static final Logger log =  LogManager.getLogger(HelloWorldWithoutSemicolon.class);

	public static void test() {

		if(System.out.printf("Hello World \n") == null) {

		}

		if(System.out.append("Hello World \n") == null) {

		}

		for(int i=0; i<1; System.out.println("Hello World"), i++) {

		}

	}

}
