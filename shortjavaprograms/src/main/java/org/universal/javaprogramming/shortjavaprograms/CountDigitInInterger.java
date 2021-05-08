package org.universal.javaprogramming.shortjavaprograms;

public class CountDigitInInterger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		long num = 0;
		
		int count = 0;
		while(num!=0) {
			
			num=num/10;
			count++;
			
		}
		
		System.out.println(count);
	}

}
