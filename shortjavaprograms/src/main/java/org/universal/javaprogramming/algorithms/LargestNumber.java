package org.universal.javaprogramming.algorithms;

import java.util.*;

public class LargestNumber {
 
	 private static String largestNumber(String[] a) {
	        // write your code here
			
		
		 Arrays.sort(a, new Comparator<String>()
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
	        
	        String result = "";
	        for (int i = 0; i < a.length; i++) {
	            result += a[i];
	        }
	        return result;
	    }
    // The main function that prints the
    // arrangement with the largest value.
    // The function accepts a vector of strings
    static void printLargest(Vector<String> arr)
    {
 
        Collections.sort(arr, new Comparator<String>()
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
 
        Iterator it = arr.iterator();
 
        while (it.hasNext())
            System.out.print(it.next());
    }
 
    // Driver code
    public static void main(String[] args)
    {
 
        Vector<String> arr;
        arr = new Vector<>();
 
        // output should be 6054854654
        arr.add("5");
        arr.add("52");
        arr.add("57");
        arr.add("517");
        arr.add("532");
        arr.add("569");
        arr.add("581");
        //printLargest(arr);
       
        String[] a = {"23","39","92"};
        
        System.out.println(largestNumber(a));
       
    }
}