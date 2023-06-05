package org.universal.javaprogramming.interviewQA.LeetCodeSolutions;

import org.universal.javaprogramming.interviewQA.SumOfElements;
import org.universal.javaprogramming.shortjavaprograms.BubbleSortDemo;


/*
		 * 
		 * You have a long flowerbed in which some of the plots are planted, and some are not. 
		 * However, flowers cannot be planted in adjacent plots.
		
		Given an integer array flowerbed containing 0's and 1's, 
		where 0 means empty and 1 means not empty, and an integer n,
		 return if n new flowers can be planted in the flowerbed without violating
		  the no-adjacent-flowers rule.
		
		
		
		Example 1:
		
		Input: flowerbed = [1,0,0,0,1], n = 1
		Output: true
		Example 2:
		
		Input: flowerbed = [1,0,0,0,1], n = 2
		Output: false
		
		
		Constraints:
		
		1 <= flowerbed.length <= 2 * 104
		flowerbed[i] is 0 or 1.
		There are no two adjacent flowers in flowerbed.
		0 <= n <= flowerbed.length
 * 
 * 
 * 
 */
public class PlantNFlower {
	
	public static boolean plantFlower(int[] a, int n) {
		
		int plant =0;
		
		for(int i=0; i<a.length; i=i+2) {
			if(plant==n)
				break;
			
			else if( i!=0 && !(a[i+1]==1 || a[i-1]==1 ) && a[i]==0  ) {
				a[i] =1;
				plant++;
				
			}
			
			
			else
				continue;
		}
		
		if(plant == n) {
			BubbleSortDemo.printArray(a);
			return true;
		}
		
		else
			{BubbleSortDemo.printArray(a);
			return false;
			}
	}
	
	
	public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            // Check if the current plot is empty.
            if (flowerbed[i] == 0) {
                // Check if the left and right plots are empty.
                boolean emptyLeftPlot = (i == 0) || (flowerbed[i - 1] == 0);
                boolean emptyRightPlot = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);
                
                // If both plots are empty, we can plant a flower here.
                if (emptyLeftPlot && emptyRightPlot) {
                    flowerbed[i] = 1;
                    count++;
                }
            }
        }
        return count >= n;
    }
	
	 public boolean canPlaceFlowersAlternate(int[] flowerbed, int n) {
	        int count = 0;
	        for (int i = 0; i < flowerbed.length; i++) {
	            // Check if the current plot is empty.
	            if (flowerbed[i] == 0) {
	                // Check if the left and right plots are empty.
	                boolean emptyLeftPlot = (i == 0) || (flowerbed[i - 1] == 0);
	                boolean emptyRightPlot = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);
	                
	                // If both plots are empty, we can plant a flower here.
	                if (emptyLeftPlot && emptyRightPlot) {
	                    flowerbed[i] = 1;
	                    count++;
	                    if (count >= n) {
	                        return true;
	                    }
	                }
	            }
	        }
	        return count >= n;
	    }
	
	
	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {0,1,0,0,0,0,0,0,1,0,0,1};
		System.out.println(plantFlower(a, 2));
		

	}

}
