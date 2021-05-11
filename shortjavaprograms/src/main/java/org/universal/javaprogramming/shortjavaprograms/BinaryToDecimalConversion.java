package org.universal.javaprogramming.shortjavaprograms;


public class BinaryToDecimalConversion {
	
	public static void main(String[] args) {
		
		long num = 10011011;
		double decimal = convertBinaryToDecimal(num);
		
		System.out.println(decimal);
		
		
		
	}
	
	public static double convertBinaryToDecimal(long num) {
		
		double decimalNumber= 0;
		int i =0;
		long remainder;
		
		while(num!=0) {
			remainder = num%10;
			num= num/10;
			decimalNumber = decimalNumber + remainder*Math.pow(2,i);
			i++;
			
		}
		
		return decimalNumber;
		
	}
}
