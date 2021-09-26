package com.qa.JavaInterviewPrograms;

import java.util.Arrays;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Create a matrix with the help of user input & display its contents
 */

public class MatrixCreation {

    //Initialize Log4j instance
	private static final Logger log =  LogManager.getLogger(MatrixCreation.class);

	public static void test() {

        int row=0, col=0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        row = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        col = sc.nextInt();
        System.out.print("\n");

        int arr[][] = new int[row][col];

        // enter the matrix elements from user
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print("[" + i + " : " + j + "] -> ");
                arr[i][j] = sc.nextInt();
            }
            System.out.print("\n");
        }

        System.out.println("========================================================================\n");
        System.out.println("The matrix you entered is : \n");
        // display the matrix entered by user
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print("[" + i + " : " + j + "] -> ");
                System.out.print(arr[i][j]);
                System.out.print("\t");
            }
            System.out.print("\n");
        }

        System.out.println("=============================================================");
        System.out.println("Another way to print matrix with single loop is : ");
        for(int i[] : arr){
            System.out.println(Arrays.toString(i));
        }

        System.out.println("=============================================================");
        System.out.println("Another way to print matrix without using loops is : " + Arrays.deepToString(arr));

    }
    
}