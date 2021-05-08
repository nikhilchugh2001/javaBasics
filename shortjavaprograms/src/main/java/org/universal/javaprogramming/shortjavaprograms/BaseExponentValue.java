package org.universal.javaprogramming.shortjavaprograms;

public class BaseExponentValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int base = 2;
		int exponent = 6;
		
		long result = 1;// This is because power zero should return value as 1
		while(exponent!=0) {
			
			result = result* base;
			--exponent;
		}
		
		System.out.println(result);

	}

}
