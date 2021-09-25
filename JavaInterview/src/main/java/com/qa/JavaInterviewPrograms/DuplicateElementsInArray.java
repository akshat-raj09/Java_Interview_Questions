package com.qa.JavaInterviewPrograms;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Find out the duplicate elements in an array.
 * brute force: print the duplicate values
 * HashSet: print the duplicate values
 * HashMap: print the occurences of duplicate elements
 */

public class DuplicateElementsInArray {

    //Initialize Log4j instance
	private static final Logger log =  LogManager.getLogger(DuplicateElementsInArray.class);

	public static void test() {

        String arr[] = {"amazon","gcp","azure","amazon","ali baba","saucelabs","azure","gcp", "ibm cloud", "ali baba"};

        System.out.println("*************** Brute Force************ \n");
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i].equals(arr[j])){
                    System.out.println(arr[i]);
                }
            }
        }

        System.out.println("\n\n ********************** HashSet ******************** \n");
        Set<String> set = new HashSet<String>();
        for(String e : arr){
            if(set.contains(e)){
                System.out.println(e);
            }
            else{
                set.add(e);
            }
        }

        System.out.println("\n\n ********************** HashMap ******************** \n");
        Map<String, Integer> map = new HashMap<String, Integer>();
        Integer value;
        String key;
        for(String o : arr){
            if(map.containsKey(o)){
                value = map.get(o);
                value = value+1;
                map.put(o, value);
            }
            else{
                map.put(o, 1);
            }
        }
        for(String ele : map.keySet()){
            if(map.get(ele) > 1){
                System.out.println("Key: " + ele + ",   Value: " + map.get(ele));
            }
        }

    }
    
}
