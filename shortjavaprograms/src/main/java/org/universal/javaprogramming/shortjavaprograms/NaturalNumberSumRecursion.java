package org.universal.javaprogramming.shortjavaprograms;

public class NaturalNumberSumRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num =5;
		
		int sum = addNum(num);
		System.out.println("sum is: "+ sum);

	}

	
	public static int addNum(int num){	
		
		if(num!=0) {
			return num + addNum(num-1);
		}
		
		else {
			return num;
		}
	}
}
