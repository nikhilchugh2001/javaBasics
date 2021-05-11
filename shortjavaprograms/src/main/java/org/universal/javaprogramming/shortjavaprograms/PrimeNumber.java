package org.universal.javaprogramming.shortjavaprograms;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 37;
		
		boolean flag= false;
		
		for(int i =2;i<=num/2;i++) {
			if(num%i==0) {
				flag = true;
				
				break;
			}
		}
		

		if(!flag) {
			System.out.println(num +" is a prime Numner");
		}
		else
			System.out.println(num+" is not a prime number");

	}

}
