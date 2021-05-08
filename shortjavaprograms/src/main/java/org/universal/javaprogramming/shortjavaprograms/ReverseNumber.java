package org.universal.javaprogramming.shortjavaprograms;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 7890;
		
		int rev = 0;
		
		while(num!=0) {
			int n  = num%10;
			rev= rev*10 + n;
			num = num/10;
		}

		System.out.println(rev);
	}

}
