package org.universal.javaprogramming.algorithms;

import java.util.Scanner;

public class FibonnaciSum {

	  private static long calc_fib(int n) {
		    if (n <= 1)
		      return n;
		    
		    long sum = 0;

		    int[] result = new int[n + 1];
		    result[0] = 0;
		    result[1] = 1;
		    for (int i = 2; i < n + 1; i++) {
		      result[i] = result[i - 1] + result[i - 2];
		      sum+= result[i];
		    }
		    return result[n];
		  }
	  
	  private static long calc_fib_sum(int n) {
		    if (n <= 1)
		      return n;
		    
		    long sum = 0;

		    int[] result = new int[n + 1];
		    result[0] = 0;
		    result[1] = 1;
		    for (int i = 2; i < n + 1; i++) {
		      result[i] = result[i - 1] + result[i - 2];
		      sum+= result[i];
		    }
		    return sum + result[1];
		  }
	  
	  private static long getFibonacciPartialSumNaive(long from, long to) {
	        long sum = 0;

	        long current = 0;
	        long next  = 1;

	        for (long i = 0; i <= to; ++i) {
	            if (i >= from) {
	                sum += current;
	            }

	            long new_current = next;
	            next = next + current;
	            current = new_current;
	        }

	        return sum;
	    }

	  private static long getFibonacciSumNaive( long to) {
	        long sum = 0;

	        long current = 0;
	        long next  = 1;

	        for (long i = 0; i <= to; ++i) {
	            
	                sum += current;
	         

	            long new_current = next;
	            next = next + current;
	            current = new_current;
	        }

	        return sum;
	    }

		  public static void main(String args[]) {
		    Scanner in = new Scanner(System.in);
		    int n = in.nextInt();
		    long from = in.nextLong();
	        long to = in.nextLong();
		    System.out.println(calc_fib_sum(n));
		    System.out.println(getFibonacciSumNaive(to));
		  }
}
