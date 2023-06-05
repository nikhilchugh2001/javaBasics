package org.universal.javaprogramming.algorithms;

import java.util.Scanner;

public class Fibonacci {

  private static long calc_fib(int n) {
    if (n <= 1)
      return n;

    int[] result = new int[n + 1];
    result[0] = 0;
    result[1] = 1;
    for (int i = 2; i < n + 1; i++) {
      result[i] = result[i - 1] + result[i - 2];
    }
    return result[n];
  }
  
  private static long calc_fib_last_digit(int n) {
	    if (n <= 1)
	      return n;

	    int[] result = new int[n + 1];
	    result[0] = 0;
	    result[1] = 1;
	    for (int i = 2; i < n + 1; i++) {
	      result[i] = result[i - 1] + result[i - 2];
	    }
	    return result[n]%10;
	  }

  
  private static int getFibonacciLastDigitNaive(int n) {
      if (n <= 1)
          return n;

      int previous = 0;
      int current = 1;

      for (int i = 0; i < n - 1; ++i) {
          int tmp_previous = previous;
          previous = current;
          current = tmp_previous + current;
      }

      return current % 10;
  }
  
  public static int getFibonacciLastDigitFast(int n) {
      if (n <= 1)
          return n;

      int[] result = new int[n + 1];
      result[0] = 0;
      result[1] = 1;
      for (int i = 2; i < n + 1; i++) {
          result[i] = (result[i - 1] + result[i - 2]) % 10;
      }
      return result[n];
  }
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    System.out.println(getFibonacciLastDigitNaive(n));
  }
}