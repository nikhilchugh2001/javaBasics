package org.universal.javaprogramming.oldJavaCode.array;

public class ReverseString {

	public static String reverseString(String str) {
		
		char[] charArray = str.toCharArray();
		int j=charArray.length-1;
		
		for(int i=0;i<j;i++, j--) {
			
				
				if(i<j) {
				
				char temp = charArray[i];
				charArray[i] = charArray[j];
				charArray[j] = temp;	
				}
				
			
		}
		
		return new String(charArray);
	}
	
	public static void main(String[] args) {
		
		System.out.println(reverseString("Nikhil"));
		
	}
}

