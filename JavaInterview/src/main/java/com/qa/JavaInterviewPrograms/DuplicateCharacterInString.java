package com.qa.JavaInterviewPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Print duplicate characters from a string or print count of each character in a String
 * check if String is null
 * check if String has 1 character only
 * check if String is empty
 * 
 * can be done by using HashMap & toCharArray()
 */

public class DuplicateCharacterInString {

    //Initialize Log4j instance
	private static final Logger log =  LogManager.getLogger(DuplicateCharacterInString.class);

	public static void test() {
        duplicate("This is a string");
    }

    public static void duplicate(String s){

        if(s==null)
        return;

        if(s.isEmpty())
        return;

        if(s.length()==1)
        return;

        char c[] = s.toCharArray();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(Character ch : c){
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            }
            else{
                map.put(ch, 1);
            }
        }

        Set<Entry<Character, Integer>> entrySet = map.entrySet();
        for(Entry<Character, Integer> e : entrySet){
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
    
}
