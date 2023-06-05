package org.universal.javaprogramming.shortjavaprograms;

import java.util.*;
import java.util.stream.Stream;
import java.lang.*;
 
public class LargestNumber {
    // Function to print the largest number
    static void printLargest(int a[], int n)
    {
        // store the index of largest
        // left most digit of elements
        int max = -1;
        int ind = -1;
 
        // Iterate for all numbers
        for (int i = 0; i < n; i++) {
            int num = a[i];
 
            // check for the last digit
            while (num > 0) {
                int r = num % 10;
                num = num / 10;
                if (num == 0) {
                    // check for the largest left most digit
                    if (max < r) {
                        max = r;
                        ind = i;
                    }
                }
            }
        }
        // print the largest number
 
        // print the rotation of array
        for (int i = ind; i < n; i++)
            System.out.print(a[i]);
 
        // print the rotation of array
        for (int i = 0; i < ind; i++)
            System.out.print(a[i]);
    }
 
    // Driver Code
    public static void main(String args[])
    {
        int a[] = { 465, 42, 46, 427, 4 };
        
        int n = a.length;
        printLargest(a, n);
        
        System.out.println("");
        System.out.println("***************");
  
        
        List<Integer> list2 = Arrays.asList(2, 4, 1, 3, 7, 5, 9, 6, 8);

      
        
        Optional<Integer> maxNumber = list2.stream()
                .max((i, j) -> i.compareTo(j));

        System.out.println(maxNumber.get());
    }
}