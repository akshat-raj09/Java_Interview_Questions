package com.qa.JavaInterviewPrograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Why Passwords (Semsitive data) should be stored in a char[] instead of String
 * https://docs.oracle.com/javase/8/docs/technotes/guides/security/crypto/CryptoSpec.html#PBEEx
 * 
 * It would seem logical to collect and store the password in a String. However, here's the caveat: 
 * String is immutable, i.e., there are no methods defined that allow you to change contents of a 
 * String after usage. This feature makes String objects unsuitable for storing security 
 * sensitive information such as user passwords. You should always collect and store security sensitive 
 * information in a char[] instead.
 * 
 * String is stored inside String pool. String passwords can be hacked if hacker gets access to Heap Dump
 * before the garbage collector clears the old String password object. Or if we want to use String based 
 * passwords we should encrypt it.
 * 
 * So we should use char[] to store password so that we can change (scramble) it after it is used once.
 */

public class PasswordsInCharArray {

    //Initialize Log4j instance
	private static final Logger log =  LogManager.getLogger(PasswordsInCharArray.class);

	public static void test() {

        System.out.println("Read the program's comments for the Answer");
    }
    
}