package com.qa.JavaInterviewPrograms;

import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Use Bubble Sort to sort an array of integers
 * 
 * Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the 
 * adjacent elements if they are in wrong order.
 * 
 * First Pass: 
( 5 1 4 2 8 ) –> ( 1 5 4 2 8 ), Here, algorithm compares the first two elements, and 
swaps since 5 > 1. 
( 1 5 4 2 8 ) –>  ( 1 4 5 2 8 ), Swap since 5 > 4 
( 1 4 5 2 8 ) –>  ( 1 4 2 5 8 ), Swap since 5 > 2 
( 1 4 2 5 8 ) –> ( 1 4 2 5 8 ), Now, since these elements are already in order (8 > 5), 
algorithm does not swap them.
Second Pass: 
( 1 4 2 5 8 ) –> ( 1 4 2 5 8 ) 
( 1 4 2 5 8 ) –> ( 1 2 4 5 8 ), Swap since 4 > 2 
( 1 2 4 5 8 ) –> ( 1 2 4 5 8 ) 
( 1 2 4 5 8 ) –>  ( 1 2 4 5 8 ) 
Now, the array is already sorted, but our algorithm does not know if it is completed. 
The algorithm needs one whole pass without any swap to know it is sorted.
Third Pass: 
( 1 2 4 5 8 ) –> ( 1 2 4 5 8 ) 
( 1 2 4 5 8 ) –> ( 1 2 4 5 8 ) 
( 1 2 4 5 8 ) –> ( 1 2 4 5 8 ) 
( 1 2 4 5 8 ) –> ( 1 2 4 5 8 ) 

 */


public class BubbleSort {

    //Initialize Log4j instance
	private static final Logger log =  LogManager.getLogger(BubbleSort.class);

	public static void test() {

        int arr[] = {12, 14, 21, 1, 0, -3, -12, 17, 31, -51, 17, 91, 4, 65};

        System.out.println("Array before sorting is : " + Arrays.toString(arr));
        System.out.println("==================================================================================");

        arr = bubbleSort(arr);

        System.out.println("Array after sorting is : " + Arrays.toString(arr));

    }

     // An optimized version of Bubble Sort
     public static int[] bubbleSort(int arr[])
     {
         int i=0, j=0, temp=0;
         boolean swapped;
         int n = arr.length;

         for (i = 0; i < n - 1; i++)
         {
             swapped = false;
             for (j = 0; j < n - i - 1; j++)
             {
                 if (arr[j] > arr[j + 1])
                 {
                     // swap arr[j] and arr[j+1]
                     temp = arr[j];
                     arr[j] = arr[j + 1];
                     arr[j + 1] = temp;
                     swapped = true;
                 }
             }
  
             // IF no two elements were swapped by inner loop, then break
             if (swapped == false)
                 break;
         }

         return arr;
     }
    
}