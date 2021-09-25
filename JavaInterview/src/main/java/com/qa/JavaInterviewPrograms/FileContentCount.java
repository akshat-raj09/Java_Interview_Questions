package com.qa.JavaInterviewPrograms;

import java.io.File;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Count total number of characters, words & lines in a given file.
 */

public class FileContentCount {

    //Initialize Log4j instance
	private static final Logger log =  LogManager.getLogger(FileContentCount.class);

	public static void test() {

        String fileName = "test.txt";
        String path = System.getProperty("user.dir") + "\\src\\main\\resources\\" + fileName;
        int characters=0, words=0, lines=0;
        Scanner sc = null;
        StringBuilder sb = new StringBuilder();
        String str = "";
        String strs[];

        File file = new File(path);

        try {
            sc = new Scanner(file);
            while(sc.hasNextLine()){
                sb.append(sc.nextLine() + " ");
                lines++;
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            try {
                sc.close();
            } 
            catch (Exception e) {
                e.printStackTrace();
            }
        }

        str = sb.toString().trim();
        strs = str.split(" ");
        words = strs.length;

        for(String s : strs){
            if(s.isEmpty() || s.isBlank())
            continue;
            else
            characters = characters + s.length();
        }

        System.out.println("Characters: " + characters + ", Words: " + words + ", Lines: " + lines);
    }
    
}
