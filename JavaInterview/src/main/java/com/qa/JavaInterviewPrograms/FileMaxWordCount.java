package com.qa.JavaInterviewPrograms;

import java.io.File;
import java.io.FileInputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Find all the words that have appeared maximum times into a text file
 */

public class FileMaxWordCount {
    
    //Initialize Log4j instance
	private static final Logger log =  LogManager.getLogger(FileMaxWordCount.class);

	public static void test() {

        int value = 0;
        Scanner sc = null;
        FileInputStream fin = null;
        StringBuilder str = new StringBuilder();
        Map<String, Integer> map = new HashMap<String, Integer>();
        Map<String, Integer> maxMap = new HashMap<String, Integer>();
        String fileName = "sample.txt";
        String path = System.getProperty("user.dir") + "\\src\\main\\resources\\" + fileName;

        File file = new File(path);

        // Read the file using Scanner or FileInputStream & store it into StringBuilder
        try{
            // using FileInputStream
            /*
            fin = new FileInputStream(file);
            byte bytes[] = fin.readAllBytes();
            for(byte b: bytes){
                str.append((char)b);
            }
            */
            
            // using Scanner class
            sc = new Scanner(file);
            while(sc.hasNextLine()){
                str.append(sc.nextLine() + "\n");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                sc.close();
                /*
                fin.close();
                */
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        
        // Convert the StringBuilder fetched from the file & convert it into String & split the String based on space & newline
        String strs[] = str.toString().toLowerCase().split("[\n\s\r]");

        // Store the frequency of each word inside the HashMap
        for(String s : strs){
            if(s.isBlank() || s.isEmpty())
            continue;
            else{
                if(map.containsKey(s)){
                    map.put(s, map.get(s)+1);
                }
                else{
                    map.put(s, 1);
                }
            }
        }

        // Store all the words that have maximum frequency into HashMap(maxMap)
        Set<Entry<String, Integer>> entrySet = map.entrySet();
        value = Collections.max(map.values()); // get maximum value of HashMap(map) & store into value
        for(Entry<String, Integer> e : entrySet){
            if(value == e.getValue()){
                maxMap.put(e.getKey(), e.getValue());
            }
        }

        // Print all the words that have maximum frequency stored into HashMap(maxMap)
        System.out.println("The words that were repeated most number of times in the file were ----->>>");
        for(String s : maxMap.keySet())
        System.out.println("Key: " + s + ", Value: " + maxMap.get(s));
    }
}