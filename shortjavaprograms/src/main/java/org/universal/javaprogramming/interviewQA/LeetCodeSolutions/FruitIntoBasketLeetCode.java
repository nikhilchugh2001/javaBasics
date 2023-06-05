package org.universal.javaprogramming.interviewQA.LeetCodeSolutions;

import java.util.HashSet;
import java.util.Set;

/*
 * 
 * You are visiting a farm that has a single row of fruit trees arranged from left to right. The trees are represented by an integer array fruits where fruits[i] is the type of fruit the ith tree produces.

You want to collect as much fruit as possible. However, the owner has some strict rules that you must follow:

You only have two baskets, and each basket can only hold a single type of fruit. There is no limit on the amount of fruit each basket can hold.
Starting from any tree of your choice, you must pick exactly one fruit from every tree (including the start tree) while moving to the right. The picked fruits must fit in one of your baskets.
Once you reach a tree with fruit that cannot fit in your baskets, you must stop.
Given the integer array fruits, return the maximum number of fruits you can pick.

 

Example 1:

Input: fruits = [1,2,1]
Output: 3
Explanation: We can pick from all 3 trees.
Example 2:

Input: fruits = [0,1,2,2]
Output: 3
Explanation: We can pick from trees [1,2,2].
If we had started at the first tree, we would only pick from trees [0,1].
Example 3:

Input: fruits = [1,2,3,2,2]
Output: 4
Explanation: We can pick from trees [2,3,2,2].
If we had started at the first tree, we would only pick from trees [1,2].
 

Constraints:

1 <= fruits.length <= 105
0 <= fruits[i] < fruits.length
 * 
 * 
 */

public class FruitIntoBasketLeetCode {
	
	 public static int totalFruit(int[] fruits) {
	        // Maximum number of fruits we can pick
	        int maxPicked = 0;
	        
	        // Iterate over the left index left of subarrays.
	        for (int left = 0; left < fruits.length; ++left) {
	            // Empty set to count the type of fruits.
	            Set<Integer> basket = new HashSet<>();
	            int right = left;
	            
	            // Iterate over the right index right of subarrays.
	            while (right < fruits.length) {
	                // Early stop. If adding this fruit makes 3 types of fruit,
	                // we should stop the inner loop.
	                if (!basket.contains(fruits[right]) && basket.size() == 2)
	                    break;
	                
	                // Otherwise, update the number of this fruit.
	                basket.add(fruits[right]);
	                right++;
	            }
	            
	            // Update maxPicked.
	            maxPicked = Math.max(maxPicked, right - left);
	        }
	        
	        // Return maxPicked as the maximum length of valid subarray.
	        // (maximum number of fruits we can pick).
	        return maxPicked;
	    }

	 public static void main(String[] args) {
		int a[] = {1,2,1};
		int[] fruits = {0,1,2,2};
		
		int[] fruits2 = {1,2,3,2,2};
		
		System.out.println(totalFruit(fruits2));
		System.out.println(totalFruit(fruits));
		System.out.println(totalFruit(a));
		
		
	}
}
