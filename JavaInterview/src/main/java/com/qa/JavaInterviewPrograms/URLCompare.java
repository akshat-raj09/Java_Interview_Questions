package com.qa.JavaInterviewPrograms;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * What will be th output when you compare site URL with its IP Address
 */

public class URLCompare {

    //Initialize Log4j instance
	private static final Logger log =  LogManager.getLogger(URLCompare.class);

	public static void test() {
        URL domain = null, ip = null;
        
        try {

            domain = new URL("https://www.screener.in");        
            ip = new URL("https://3.7.241.105");
        
        }
        catch (MalformedURLException e) {
            e.printStackTrace();
        }

        System.out.println(domain.equals(ip));
    
    }
    
}
