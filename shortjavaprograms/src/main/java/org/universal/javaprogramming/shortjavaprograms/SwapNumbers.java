package org.universal.javaprogramming.shortjavaprograms;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a= 10;
		int b= 6;
		int temp = 0;
		
		
		System.out.println("Before Swapping: ");
		System.out.println("a is: "+ a);
		System.out.println("b is: "+ b);
		
		//Solution 1
		/*
		 * temp=a; a=b; b=temp;
		 */
		
		a= a-b; //4
		b= a+b;//10
		a=b-a;//6
		
		System.out.println("After Swapping: ");
		System.out.println("a is: "+ a);
		System.out.println("b is: "+ b);
		
		
	}

}
