package com.qa.JavaInterviewPrograms;

import java.io.File;
import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Print all files & folders inside the directory in sorted order
 */

public class FileListSorted {

    //Initialize Log4j instance
	private static final Logger log =  LogManager.getLogger(FileListSorted.class);

	public static void test() {

        String path = System.getProperty("user.dir") + "\\src\\main\\java\\com\\qa\\JavaInterviewPrograms\\";

        File file = new File(path);

        File files[] = file.listFiles();
        Arrays.sort(files);

        for(File f : files){
            if(f.isFile())
            System.out.println("File: " + f.getName() + " ---> " + f.getAbsolutePath() + "\n");
            else if(f.isDirectory())
            System.out.println("Directory: " + f.getName() + " ---> " + f.getAbsolutePath() + "\n");
            else
            System.out.println("Unknown: " + f.getName() + " ---> " + f.getAbsolutePath() + "\n");
        }
    }
}
