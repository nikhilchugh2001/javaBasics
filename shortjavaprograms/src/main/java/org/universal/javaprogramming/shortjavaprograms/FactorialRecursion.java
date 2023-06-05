package org.universal.javaprogramming.shortjavaprograms;

public class FactorialRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 7;
		
		int factorial = multiplyNum(num);
		
		System.out.println(factorial);
		

	}
	
	public static int multiplyNum(int num) {
		
		if(num>=1) {
			
			//7 * (6*(5*(4*(3*(*2*(1))))
			return num * (multiplyNum(num-1));
			
		}
		
		else {
			return 1;
		}
		
	}

}
