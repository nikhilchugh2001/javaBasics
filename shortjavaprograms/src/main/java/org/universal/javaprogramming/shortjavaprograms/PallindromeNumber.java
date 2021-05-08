package org.universal.javaprogramming.shortjavaprograms;

public class PallindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 121;
		int rev =0;
		
		int actualNum = num;
		
		while(num!=0) {
			
			int n= num %10;
			rev = rev*10 +n;
			num= num/10;
		}

		if(actualNum == rev) {
			System.out.println("This is a pallindrome number " + rev);
			
		}
		
		else 
			System.out.println("This is not a pallindrome number");
	}

}
