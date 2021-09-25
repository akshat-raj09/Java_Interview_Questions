package com.qa.JavaInterviewPrograms;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Launch External Applications like notepad, chrome etc. using Java.
 */

public class LaunchExternalApp {

    //Initialize Log4j instance
	private static final Logger log =  LogManager.getLogger(LaunchExternalApp.class);

	public static void test() {

        String cmd[] = {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe", "https://www.google.com"};
        Runtime runtime = Runtime.getRuntime();

        
        try {
            // launch notepad
            Process process = runtime.exec("notepad.exe" + " " + System.getProperty("user.dir") + "\\src\\main\\resources\\test.txt");
            Thread.sleep(3000);
            process.destroy();


            // launch chrome
            Process process1 = runtime.exec(cmd);
            Thread.sleep(4000);
            process1.destroy();

        } 
        catch (Exception e) {
            e.printStackTrace();
        }

    }
    
}