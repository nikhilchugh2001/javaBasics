package org.universal.javaprogramming.shortjavaprograms;

public class DecimalToBinaryNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 156;
		
		System.out.println(convertDeimalToBinaryNumber(num));

	}
	
	public static long convertDeimalToBinaryNumber(int num) {
		
		int remainder =1, i =1;
		
		long binaryNumber =0;
		
		while(num!=0) {
			remainder = num%2;
			num=num/2;
			binaryNumber = binaryNumber + remainder*i;
			i=i*10;
		}
		
		return binaryNumber;
	}

}
