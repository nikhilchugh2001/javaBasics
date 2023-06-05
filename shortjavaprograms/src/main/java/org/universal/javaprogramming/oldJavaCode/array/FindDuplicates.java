package org.universal.javaprogramming.oldJavaCode.array;

import java.util.Arrays;

import org.universal.javaprogramming.oldJavaCode.MissingNumberIntArray;



public class FindDuplicates {
	
	
	
	public static void main(String[] args) {
	int names[] = {7,7,2,2,9};
	
	
	
	int n = 0;
	
	int[] arr = new int[n];
	
	for (int i = 0; i < names.length; i++) 
	{ 
		for (int j = i + 1 ; j < names.length; j++) 
	{ 
			if (names[i] ==(names[j])) 
	{ 
				// got the duplicate element 
			arr=	MissingNumberIntArray.addX(n, arr, names[i]);
			n=n+1;
				
	} 
	} 
	
	}

	System.out.println(Arrays.toString(arr));
	}
}


