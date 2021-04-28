package org.universal.javaprogramming.shortjavaprograms.IntegerArrayprog;

import java.util.Arrays;

/**
 * Class to find missing number in an array
 */
public class MissingNumberSortedArray {

    static void print(String value) {
        System.out.println(value);
    }

    /**
     * Function to find the missing number in a array
     *
     * @param arr : given array
     * @param max : value of maximum number in the series
     */
    static void findMissingNumber(int[] arr, int max) {
    
          //3
        Arrays.sort(arr);
          //4
        int currentValue = 1;
    
          //5
        for (int i = 0; i < arr.length; i++) {
              //6
            if (arr[i] != currentValue) {
                for (int j = currentValue; j < arr[i]; j++) {
                    print("Missing number Found : " + j);
                }
            }
            currentValue = arr[i] + 1;
        }

    }

    public static void main(String[] args) {
          //1
        int maxNumber = 10;
        int[] givenArr = {3, 5, 7, 6, 8, 10};
    
          //2
        findMissingNumber(givenArr, maxNumber);

    }
}

