package org.universal.javaprogramming.oldJavaCode;

import java.util.Arrays;

public class MissingNumberIntArray {

	public static int[] addX(int n, int arr[], int x) 
    { 
        int i; 
  
        // create a new array of size n+1 
        int newarr[] = new int[n + 1]; 
  
        // insert the elements from 
        // the old array into the new array 
        // insert all elements till n 
        // then insert x at n+1 
        for (i = 0; i < n; i++) 
            newarr[i] = arr[i]; 
  
        newarr[n] = x; 
  
        return newarr; 
    } 
  
	public static void main(String[] args) {

	    // given input
	    //int[] input = { 1, 1, 2, 3, 5, 5, 7, 9, 9, 9 };
		
		int[] input = { 1, 1, 2, 3, 5, 5, 7, 9};

	    // let's create another array with same length
	    // by default all index will contain zero
	    // default value for int variable

	    int[] register = new int[input.length];
	    
	    int[] missArray = new int[0];
	    int n= 0;

	    // now let's iterate over given array to
	    // mark all present numbers in our register
	    // array

	    for (int i : input) {
	      register[i] = 1;
	    }

	    // now, let's print all the absentees
	    System.out.println("missing numbers in given array");

	    for (int i = 1; i < register.length; i++) {
	      if (register[i] == 0) {
	        System.out.println(i);
	        missArray = addX(n,missArray,i);
	        n = n +1;
	      }
	    }
	    
	    System.out.println(Arrays.toString(missArray));
	  }
	
}
