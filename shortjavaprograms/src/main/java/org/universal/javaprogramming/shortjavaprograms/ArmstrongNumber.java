package org.universal.javaprogramming.shortjavaprograms;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 153;//Armstrong no: 1*1*1 + 2*2*2 + 3*3*3
		
		int actualNum= num;
		double result =0;
		while(num!=0) {
			int n = num%10;
			result = result + Math.pow(n, 3);
			num = num/10;
		}
		
		if(result==actualNum) {
			System.out.println("This a Armstrong number "+ actualNum);
		}

	}

}
