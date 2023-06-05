package org.universal.javaprogramming.interviewQA.LeetCodeSolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCodeMaxSubarray {


	public static  int maxSubArray(int[] nums) {

		int l=nums.length;
		int i=0,s=0,max=nums[0];
		int[] b = new int[l];

		while(i!=l)
		{
			b[i]=nums[i];
			i++;
		}
		// if(l==1)
			//     return nums[0];
		Arrays.sort(b);
		if(b[l-1]<=0)
			return b[l-1];

		i=0;
		while(i!=l)
		{
			s+=nums[i];
			if(s<0)
			{
				s=0;
			}
			else if(s>max)
				max=s;
			// System.out.println(max);
			i++;
		}
		System.out.println(max);
		return max;
	}


	static void maxSubArraySum(int a[], int size)
	{
		int max_so_far = Integer.MIN_VALUE,
				max_ending_here = 0, start = 0, end = 0, s = 0;

		for (int i = 0; i < size; i++) {
			max_ending_here += a[i];

			if (max_so_far < max_ending_here) {
				max_so_far = max_ending_here;
				start = s;
				end = i;
			}

			if (max_ending_here < 0) {
				max_ending_here = 0;
				s = i + 1;
			}
		}
		System.out.println("Maximum contiguous sum is "
				+ max_so_far);
		System.out.println("Starting index " + start);
		System.out.println("Ending index " + end);
	}

	public static void main(String[] args) {

		int a[] = {-1, -2, -3, 4, -1, -2, 1 , 5, -3, 0};
		System.out.println(maxSubArray(a));

		maxSubArraySum(a, a.length);

		System.out.println(maximumSubarraySum(a));



	}

	
	/**
	 * @author Nikhil
	 * @param arr
	 * @return
	 */
	public static int maximumSubarraySum(int[] arr) {
		int n = arr.length;
		int maxSum = Integer.MIN_VALUE;
		int index=0, startIndex=0;
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i <= n - 1; i++) {
			int currSum = 0;
			for (int j = i; j <= n - 1; j++) {
				currSum += arr[j];
				if (currSum > maxSum) {
					maxSum = currSum;
					index=j;
					startIndex=i;
				}
			}

		}
		System.out.println(startIndex);
		System.out.println(index);

		System.out.println(Arrays.toString((Arrays.copyOfRange(arr, startIndex, index+1))));

		return maxSum;
	}




}