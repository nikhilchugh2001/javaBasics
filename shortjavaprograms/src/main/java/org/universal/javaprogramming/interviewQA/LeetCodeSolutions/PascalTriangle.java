package org.universal.javaprogramming.interviewQA.LeetCodeSolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//java program for Pascal's Triangle
//A O(n^2) time and O(n^2) extra
//space method for Pascal's Triangle


public class PascalTriangle {
	public static void main (String[] args) {
		int n = 5;
		printPascal(n);
		rightPyramid(n);
		
		int a[]= {1,2,3,4};
		int b[]= {-1,1,0,-3,3};
		int arr[]  = {10, 3, 5, 6, 2};
		System.out.println(Arrays.toString(productArray(a)));
		System.out.println(Arrays.toString(productArray(b)));
		System.out.println(Arrays.toString(productArray(arr)));
		
		
		int[][] matrix = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
		int[][] matrixTwo= {{1,1,1},{1,0,1},{1,1,1}};
		
		RotateImageMatrix.printarrayElements(matrix);
		RotateImageMatrix.printarrayElements(setZeroes(matrix));
		
		RotateImageMatrix.printarrayElements(matrixTwo);
		RotateImageMatrix.printarrayElements(setZeroesSet(matrixTwo));
		
		int numbers[]={2, 7, 11, 15}; 
		System.out.println(Arrays.toString(twoSum(numbers, 9)));
		System.out.println(Arrays.toString(findTwoSum(numbers, 9)));
	}

	public static void printPascal(int n)
	{
		//An auxiliary array to store generated pascal triangle values
		int[][] arr = new int[n][n];

		//Iterate through every line and print integer(s) in it and this is for row
		for (int line = 0; line < n; line++)
		{
			// Every line has number of integers equal to line number and this loop is for column
			for (int i = 0; i <= line; i++)
			{
				// First and last values in every row are 1, i==0 means first column and line==j means end column
				if (line == i || i == 0)
					arr[line][i] = 1;
				else // Other values are sum of values just above and left of above
					arr[line][i] = arr[line-1][i-1] + arr[line-1][i];
				System.out.print(arr[line][i]);
			}
			
			//Below for changing line
			System.out.println("");
		}
		
		
	}
	
	
	/*
	 * 
	 * *
	 * * *
	 * * * *
	 * 
	 * Above is right Pyramid
	 */
	public static void rightPyramid(int n) {
		
		int i, j,  row = n;
		
		System.out.println("==============Pyramid Pattern Right==============");
		for(i=1;i<=row;i++) {
			for(j=1; j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		
	}
	
	
	/**
	 * LeetCode Problem Array for product leaving 1 element a time
	 * @param a
	 * @return
	 */
	/*
	 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
	 * 
	 * 
	 * 
	 * 
	 */
	public static int[] productArray(int a[]) {
		
		int[] productArray= new int[a.length];
		
		for(int i=0; i<a.length;i++) {
			int product =1;
			for(int j=0; j<a.length;j++) {
				if(i!=j) {
				product = product * a[j];
				}
			}
			productArray[i]=product;
		}
		
		return productArray;
		
	}
	
	/*
	 * Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

You must do it in place.

 

Example 1:

Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]
	 * 
	 */
	
	
	public static int[][] setZeroes(int[][] matrix) {
		/*
		 * Set<Integer> row = new HashSet<>(); Set<Integer> col = new HashSet<>();
		 */
	    List<Integer> row = new ArrayList<>();
	    List<Integer> col = new ArrayList<>();
	    int m = matrix.length;
	    int n = matrix[0].length;
	    for (int i = 0; i < m; i++) {
	      for (int j = 0; j < n; j++) {
	        if (matrix[i][j] == 0) {
	          row.add(i);
	          col.add(j);
	        }
	      }
	    }

	    for (int r : row) {
	      for (int j = 0; j < n; j++) {
	        matrix[r][j] = 0;
	      }
	    }

	    for (int c : col) {
	      for (int i = 0; i < m; i++) {
	        matrix[i][c] = 0;
	      }
	    }
	    return matrix;
	  }
	
	public static int[][] setZeroesSet(int[][] matrix) {
		
		  Set<Integer> row = new HashSet<>(); 
		  Set<Integer> col = new HashSet<>();
		 
		/*
		 * List<Integer> row = new ArrayList<>(); List<Integer> col = new ArrayList<>();
		 */
	    int m = matrix.length;
	    int n = matrix[0].length;
	    for (int i = 0; i < m; i++) {
	      for (int j = 0; j < n; j++) {
	        if (matrix[i][j] == 0) {
	          row.add(i);
	          col.add(j);
	        }
	      }
	    }

	    for (int r : row) {
	      for (int j = 0; j < n; j++) {
	        matrix[r][j] = 0;
	      }
	    }

	    for (int c : col) {
	      for (int i = 0; i < m; i++) {
	        matrix[i][c] = 0;
	      }
	    }
	    return matrix;
	  }
	
	
	/*
	 * TwoSum method is to return array if indices whose sum is equal to a given target
	 * e.g given target sum is 9 and array elements are 2,7, 11, 15
	 * So here first two elements sum is 9
	 */
	public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap();
        
        /* 2, 7, 11, 15  ==  target=9
         * 0  1   2   3  => 4
         *  
         *    --HasMap--
         *  key   value(index)
         *   2  ->  0
         *   7  ->  1
         *
        */
        for(int i=0; i<nums.length; i++) {
           int expectedKey = target - nums[i];
           if(map.containsKey(expectedKey)) {
               return new int[]{map.get(expectedKey), i};
           }
           map.put(nums[i], i);
        }
             
        throw new IllegalArgumentException("No Solution");
    }
	
	
	  private static int[] findTwoSum(int[] nums, int target) {
	        for (int i = 0; i < nums.length; i++) {
	            for (int j = i + 1; j < nums.length; j++) {
	                if (nums[i] + nums[j] == target) {
	                    return new int[] { i, j };
	                }
	            }
	        }
	        return new int[] {};
	    }
	
}
