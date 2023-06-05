package org.universal.javaprogramming.oldJavaCode;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 
 *
 */
public class LeftRotation {

	static int[] rotLeft(int[] a, int d) {
		int n = a.length;
		int[] rotArray = new int[n];

		for (int oldIndex = 0; oldIndex < n; oldIndex++) {
			int newIndex = (oldIndex + n - d) % n;
			rotArray[newIndex] = a[oldIndex];
		}

		return rotArray;

	}

	public static void main(String[] args) {

		int[] myArray =  new int[] {1,2,3,4,5};
		int[] outputArray = new int[myArray.length];
		 Scanner sc = new Scanner(System.in);
		 int noOfRotations = sc.nextInt();
		 int rotatingPoint = noOfRotations;
		 
		 int i =0;
		 
		 while(rotatingPoint<myArray.length) {
			 outputArray[i] = myArray[rotatingPoint];
			 i++;
			 rotatingPoint++;
			 
		 }
		 
		 rotatingPoint = 0;
		 while(rotatingPoint<noOfRotations) {
			 outputArray[i] = myArray[rotatingPoint];
			 i++;
			 rotatingPoint++;
		 }
		 
		 
		 System.out.println("Output array is: ");
		 for (int arrayElement : outputArray ) {
			 System.out.print(arrayElement+ " ");
		 }
	}

}