package org.universal.javaprogramming.shortjavaprograms;

public class OctalToDecimalViceVersa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(convertDecimalToOctal(109));
		
		System.out.println(convertOctalToDecimal(155));
	}
	
	public static int convertDecimalToOctal(int decimal){
		
		int octalNumber = 0;
		int i =0;
		
		while(decimal!=0) {
			octalNumber= (int) (octalNumber + (decimal%8)*Math.pow(10, i));
			decimal= decimal/8;
			i++;
			
		}
		
		return octalNumber;
		
		
		
	}

	
	public static int convertOctalToDecimal(int octal){
		
		int decimalNumber = 0;
		int i =0;
		
		while(octal!=0) {
			decimalNumber= (int) (decimalNumber + (octal%10)*Math.pow(8, i));
			octal= octal/10;
			i++;
			
		}
		
		return decimalNumber;
		
		
	}
}
