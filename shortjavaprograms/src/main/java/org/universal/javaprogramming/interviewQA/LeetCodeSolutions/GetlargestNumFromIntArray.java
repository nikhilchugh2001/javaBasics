package org.universal.javaprogramming.interviewQA.LeetCodeSolutions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class GetlargestNumFromIntArray {
	
	public static void printLargest(int[] a) {
		
		String[] strArray = getIntToStringArray(a);
		Arrays.sort(strArray, new Comparator<String>()
        {
            // A comparison function which is used by
            // sort() in printLargest()
            @Override public int compare(String X, String Y)
            {
 
                // first append Y at the end of X
                String XY = X + Y;
 
                // then append X at the end of Y
                String YX = Y + X;
 
                // Now see which of the two
                // formed numbers
                // is greater
                return XY.compareTo(YX) > 0 ? -1 : 1;
            }
        });
		
		for(String str : strArray) {
			System.out.print(str);
		}
	}
	
	public static String[] getIntToStringArray(int[] arr) {
		
		String strArray[] = new String[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			strArray[i] = String.valueOf(arr[i]);
			
		}
		return strArray;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,9,3,2,5};
		
		printLargest(arr);
	}

}
