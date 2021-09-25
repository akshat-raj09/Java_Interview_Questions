package com.qa.JavaInterviewPrograms;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * How to set file permissions in java using following methods :-
 * setExecutable(boolean executable, boolean ownerOnly)
 * setReadable(boolean readable, boolean ownerOnly)
 * setWritable(boolean writable, boolean ownerOnly)
 */

public class FilePermissions {

    //Initialize Log4j instance
	private static final Logger log =  LogManager.getLogger(FilePermissions.class);

	public static void test() {

        String fileName = "file_permissions_sample.txt";
        String path = System.getProperty("user.dir") + "\\src\\main\\resources\\" + fileName;
        
        File file = new File(path);

        System.out.println("Read permission is set : " + file.setReadable(true, true));
        System.out.println("Execute permission is set : " + file.setExecutable(true, true));
        System.out.println("Write permission is set : " + file.setWritable(true, true));
        

    }
    
}