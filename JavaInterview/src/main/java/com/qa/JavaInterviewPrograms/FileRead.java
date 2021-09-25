package com.qa.JavaInterviewPrograms;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Read the file using :-
 * FileInputStream
 * Scanner
 */

public class FileRead {

    //Initialize Log4j instance
	private static final Logger log =  LogManager.getLogger(FileRead.class);
    
    public static void test() {

        String fileName = "test.txt";
        String path = System.getProperty("user.dir") + "\\src\\main\\resources\\" + fileName;
        byte bytes[] = null;
        StringBuilder sb = new StringBuilder();
        int i=0;
        FileInputStream fin = null;
        Scanner sc = null;

        File file = new File(path);

        try {
            // 1. using FileInputStream
            fin = new FileInputStream(path);
            System.out.println("The size of the file (in Bytes) is : " + fin.available() + "\n");

            // (i) using read()
            while((i=fin.read()) != -1){
                System.out.print((char)i);
            }
            fin.close();
            System.out.println("\n================================================");

            // (ii) using readAllBytes()
            fin = new FileInputStream(path); // again open a new FileInputStream to move file pointer to start of file.
            bytes = fin.readAllBytes();
            for(byte by : bytes){
                sb.append((char)by);
            }
            System.out.println(sb.toString());
            System.out.println("================================================");

            // 2. using Scanner
            sc = new Scanner(file);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            try {
                fin.close();
                sc.close();
            } 
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
}
