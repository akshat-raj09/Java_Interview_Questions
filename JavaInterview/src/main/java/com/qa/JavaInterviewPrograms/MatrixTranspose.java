package com.qa.JavaInterviewPrograms;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Find the transpose of the matrix that is entered by user
 */

public class MatrixTranspose {

    //Initialize Log4j instance
	private static final Logger log =  LogManager.getLogger(MatrixTranspose.class);

	public static void test() {

        int row=0, col=0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        row = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        col = sc.nextInt();
        System.out.print("\n");

        int arr[][] = new int[row][col];
        int transpose[][] = new int[col][row];

        System.out.println("Enter the elements of the matrix");
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

        System.out.println("========================================================================\n");
        System.out.println("The transpose of the matrix is : \n");
        // display the transpose of the matrix entered by user
        for(int i=0; i<col; i++){
            for(int j=0; j<row; j++){
                System.out.print("[" + i + " : " + j + "] -> ");
                transpose[i][j] = arr[j][i];
                System.out.print(transpose[i][j]);
                System.out.print("\t");
            }
            System.out.print("\n");
        }

    }
    
}