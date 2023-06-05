package org.universal.javaprogramming.oldJavaCode.array;

import java.util.Arrays;

public class ArrayInitialization {
	
	static final int MAX_CHAR = 256; 
	public static void main(String[] args) {
		
		String str = "HelloIndiaYourbestIamfromDelhi";
		// Create an array of size 256 i.e. ASCII_SIZE 
				int count[] = new int[MAX_CHAR]; 

				int len = str.length(); 

				// Initialize count array index 
				for (int i = 0; i < len; i++) 
				{
					System.out.println(count[str.charAt(i)]++); 
				}
				
				System.out.println("Missing numbers are"+Arrays.toString(count));

		
	}

}
