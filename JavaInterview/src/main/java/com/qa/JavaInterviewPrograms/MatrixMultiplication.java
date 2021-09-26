package com.qa.JavaInterviewPrograms;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Find the multiplication of two matrices that are entered by user.
 */

public class MatrixMultiplication {

    //Initialize Log4j instance
	private static final Logger log =  LogManager.getLogger(MatrixMultiplication.class);

	public static void test() {

        int row1=0, col1=0, row2=0, col2=0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows for first matrix: ");
        row1 = sc.nextInt();
        System.out.print("Enter the number of columns for first matrix: ");
        col1 = sc.nextInt();
        System.out.print("\n");

        System.out.print("Enter the number of rows for second matrix: ");
        row2 = sc.nextInt();
        System.out.print("Enter the number of columns for second matrix: ");
        col2 = sc.nextInt();
        System.out.print("\n");

        if(col1 != row2)
        System.out.println("Matrix multiplication is undefined : colums of 1st matrix should be equal to rows of second matrix");

        else{
            int matrix1[][] = new int[row1][col1];
            int matrix2[][] = new int[row2][col2];
            int product[][] = new int[row1][col2];

            // enter the elements for first matrix from user
            System.out.println("Enter the elements of first matrix");
            for(int i=0; i<row1; i++){
                for(int j=0; j<col1; j++){
                    System.out.print("[" + i + " : " + j + "] -> ");
                    matrix1[i][j] = sc.nextInt();
                }
                System.out.print("\n");
            }

            // enter the elements for second matrix from user
            System.out.println("Enter the elements of second matrix");
            for(int i=0; i<row2; i++){
                for(int j=0; j<col2; j++){
                    System.out.print("[" + i + " : " + j + "] -> ");
                    matrix2[i][j] = sc.nextInt();
                }
                System.out.print("\n");
            }

            System.out.println("========================================================================\n");
            System.out.println("The first matrix you entered is : ");
            // display the elements of first matrix entered by user
            for(int i=0; i<row1; i++){
                for(int j=0; j<col1; j++){
                    System.out.print("[" + i + " : " + j + "] -> ");
                    System.out.print(matrix1[i][j]);
                    System.out.print("\t");
                }
                System.out.print("\n");
            }

            System.out.println("========================================================================\n");
            System.out.println("The second matrix you entered is : ");
            // display the elements of second matrix entered by user
            for(int i=0; i<row2; i++){
                for(int j=0; j<col2; j++){
                    System.out.print("[" + i + " : " + j + "] -> ");
                    System.out.print(matrix2[i][j]);
                    System.out.print("\t");
                }
                System.out.print("\n");
            }

            // perform the product of both the matrices
            for(int i=0; i<row1; i++){
                for(int j=0; j<col2; j++){
                    for(int k=0; k< col1; k++){
                        product[i][j] = product[i][j] + (matrix1[i][k] * matrix2[k][j]);
                    }
                }
            }


            System.out.println("========================================================================\n");
            System.out.println("The final product matrix is : ");
            // display the product matrix
            for(int i=0; i<row1; i++){
                for(int j=0; j<col2; j++){
                    System.out.print("[" + i + " : " + j + "] -> ");
                    System.out.print(product[i][j]);
                    System.out.print("\t");
                }
                System.out.print("\n");
            }
        }

    }
    
}