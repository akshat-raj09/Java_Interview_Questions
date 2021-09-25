package com.qa.JavaInterviewPrograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Create a copy of the file in the same folder with different name.
 */

public class FileCopy {
    
    //Initialize Log4j instance
	private static final Logger log =  LogManager.getLogger(FileCopy.class);
    
    public static void test() {

        int i=0;
        byte bytes[];

        String fileNameIn = "test.txt";
        String pathIn = System.getProperty("user.dir") + "\\src\\main\\resources\\" + fileNameIn;

        String fileNameOut = "test_copy.txt";
        String pathOut = System.getProperty("user.dir") + "\\src\\main\\resources\\" + fileNameOut;

        File fileIn = new File(pathIn);
        File fileOut = new File(pathOut);

        FileInputStream fin = null;
        FileOutputStream fout = null;

        try {
            fin = new FileInputStream(fileIn);
            fout = new FileOutputStream(fileOut);

            // using read()
            /*
            while((i=fin.read()) != -1){
                fout.write(i);
            }
            */

            // using readAllBytes()
            bytes = fin.readAllBytes();
            fout.write(bytes);
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            try {
                fin.close();
                fout.close();
            } 
            catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
    
}
