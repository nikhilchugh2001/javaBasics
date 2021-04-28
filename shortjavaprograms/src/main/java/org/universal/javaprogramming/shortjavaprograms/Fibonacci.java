package org.universal.javaprogramming.shortjavaprograms;

public class Fibonacci {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		int num = 10;
		int t1 = 0;
		int t2 = 1;
		
		
		for(int i=1; i<=num; i++)
		{
			System.out.println(t1);
			int sum = t1 + t2;
			t1= t2;
			t2= sum;
		}
 
		int a[] = new int[num];
		a = getFibonnaci( a.length);
		
		for(int i =0;i<a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	public static int[] getFibonnaci(int length) {
		
	
	
	int series[] = new int[length];
	series[0] = 0;
	series[1] =1;
	
	for(int i =2;i<series.length; i++) {
		series[i] = series[i-1] + series[i-2];
	}
		
	return series;	
	}

}
