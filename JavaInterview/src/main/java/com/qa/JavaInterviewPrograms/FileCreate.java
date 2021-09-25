package com.qa.JavaInterviewPrograms;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Create a file using :-
 * File
 * OutputFleStream
 */

 public class FileCreate {

    //Initialize Log4j instance
	private static final Logger log =  LogManager.getLogger(FileCreate.class);

	public static void test() {

        String fileName = "test.txt";
        String path = System.getProperty("user.dir") + "\\src\\main\\resources\\" + fileName;
        boolean b;

        // using File
        File file = new File(path);
        try{
            b = file.createNewFile();
            if(b==true)
            System.out.println("New file created");
            else
            System.out.println("File already exists");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        // using FileOutputStream
        FileOutputStream fout = null;
        Scanner sc = new Scanner(System.in);
        byte bytes[] = null;
        String data = "";
        System.out.println("Enter the data to append into file: ");
        try {
            fout = new FileOutputStream(file, true); // FileOutputStream(File file, boolean append);
            data = sc.nextLine();
            bytes = data.getBytes();
            fout.write(bytes);
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            try {
                fout.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // Converted the byte[] to String
        /*
        StringBuilder sb = new StringBuilder();
        for(byte by : bytes){
            sb.append((char)by);
        }
        System.out.println(sb.toString());
        */
    }
    
}
