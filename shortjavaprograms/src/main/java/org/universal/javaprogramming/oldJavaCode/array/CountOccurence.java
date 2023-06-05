package org.universal.javaprogramming.oldJavaCode.array;

import java.util.Scanner;

public class CountOccurence {
	
static final int MAX_CHAR = 256; 
	
	static void getOccuringChar(String str) 
	{ 
		// Create an array of size 256 i.e. ASCII_SIZE 
		int count[] = new int[MAX_CHAR]; 

		int len = str.length(); 

		// Initialize count array index 
		for (int i = 0; i < len; i++) 
			count[str.charAt(i)]++; 

		// Create an array of given String size 
		char ch[] = new char[str.length()]; 
		for (int i = 0; i < len; i++) { 
		

			

			
				System.out.println("Number of Occurrence of " + 
				str.charAt(i) + " is:" + count[str.charAt(i)]);			 
		} 
	} 
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in); 
		String str = "HelloIndiaYourbestIamfromDelhi"; 
		getOccuringChar(str); 
	} 

}
