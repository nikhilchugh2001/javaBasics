package org.universal.javaprogramming.oldJavaCode.array;

import java.util.Arrays;

import org.universal.javaprogramming.oldJavaCode.MissingNumberIntArray;



public class RemoveDuplicates {

	public static void main(String[] args) {
	int names[] = {7,7,2,2,9,8,99};
	
	
	
	int n = 0;
	
	int[] arr = new int[n];
	
	for (int i = 0; i < names.length; i++) 
	{ 
		for (int j = i + 1 ; j < names.length; j++) 
	{ 
			if (names[i] ==(names[j])) 
	{ 
				// got the duplicate element 
			names[i] = 0;
				
	} 
	} 
	
	}

	//System.out.println(Arrays.toString(names));
	
	names =sortArray.bubbleSort(names);
	System.out.println(Arrays.toString(names));
	
	int a = names[names.length-1];
	int[] newArray = new int[a];
	
	for (int k = 1;k<=a;k++) {
		newArray[k-1] = k;
	}
	
	
	System.out.println(Arrays.toString(newArray));
	
	int m = 0;
	int[] missArray = new int[m];
	
	for(int z =0 ; z<newArray.length;z++) {
		for(int i  = 0; i<names.length;i++) {
			if(names[i]==newArray[z]) {
				newArray[z]=0;
				
				
			}
			
			
				
			
		}
	}
	
	for(int z =0 ; z<newArray.length;z++) {
		if(newArray[z]!=0) {
			missArray = MissingNumberIntArray.addX(m, missArray, newArray[z]);
			m= m+1;
			
		}
		}
	
	System.out.println(Arrays.toString(newArray));
	
	System.out.println("Missing numbers are"+Arrays.toString(missArray));
	
	}
}
