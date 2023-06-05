package org.universal.javaprogramming.interviewQA.LeetCodeSolutions;

import java.util.Scanner;

public class RotateImageMatrix {

	public static void rotate(int[][] matrix) {
		transpose(matrix);
		reverse(matrix);
	}

	private static void transpose(int[][] matrix) {
		
		//This is for rows
		System.out.println(matrix.length);
		//No of columns
		System.out.println(matrix[0].length);
		for (int i = 0; i < matrix.length; i++) {
			//This is for traversing each cell in a row
			for (int j = (i + 1); j < matrix[0].length; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
	}

private static int[][] transpose2(int[][] matrix) {
		
		//This is for rows
		System.out.println(matrix.length);
		//No of columns
		System.out.println(matrix[0].length);
		for (int i = 0; i < matrix.length; i++) {
			//This is for traversing each cell in a row
			for (int j = (i + 1); j < matrix[0].length; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		return matrix;
	}
	private static void  reverse(int[][] matrix) {
		for (int[] row : matrix) {
			for (int i = 0, j = row.length - 1; i < j; i++, j--) {
				int temp = row[j];
				row[j] = row[i];
				row[i] = temp;
			}
		}
	}
	
	private static int[][]  reverse2(int[][] matrix) {
		for (int[] row : matrix) {
			for (int i = 0, j = row.length - 1; i < j; i++, j--) {
				int temp = row[j];
				row[j] = row[i];
				row[i] = temp;
			}
		}
		return matrix;
	}
	
	public static void printarrayElements(int[][] array) {
		
		int m, n, i, j;
		m= array.length;
		n= array[0].length;
		
			
			
		System.out.println("Elements of the array are: ");
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++)
				// prints the array elements
				System.out.print(array[i][j] + " ");
			// throws the cursor to the next line
			System.out.println();
		}
		
	}

	
	public static int[][] twoDArrayInput() {
		
		int m, n, i, j;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		// taking row as input
		m = sc.nextInt();
		System.out.print("Enter the number of columns: ");
		// taking column as input
		n = sc.nextInt();
		// Declaring the two-dimensional matrix
		int array[][] = new int[m][n];
		// Read the matrix values
		System.out.println("Enter the elements of the array: ");
		// loop for row
		for (i = 0; i < m; i++)
			// inner for loop for column
			for (j = 0; j < n; j++)
				array[i][j] = sc.nextInt();
		// accessing array elements
		System.out.println("Elements of the array are: ");
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++)
				// prints the array elements
				System.out.print(array[i][j] + " ");
			// throws the cursor to the next line
			System.out.println();
		}
		
		return array;
		
	}
	public static void main(String[] args) {
     
		/*
		 * int a[][] = RotateImageMatrix.twoDArrayInput(); RotateImageMatrix.rotate(a);
		 * RotateImageMatrix.printarrayElements(a);
		 */
		//int a[][] = RotateImageMatrix.twoDArrayInput();
		
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		RotateImageMatrix.printarrayElements(a);
		RotateImageMatrix.reverse(a);
		int transpose [][] = RotateImageMatrix.transpose2(a);
		RotateImageMatrix.printarrayElements(transpose);
		int reverse [][] = RotateImageMatrix.reverse2(transpose);
		RotateImageMatrix.printarrayElements(reverse);
		RotateImageMatrix.printarrayElements(a);
		
	}
	// TODO Auto-generated method stub

}
