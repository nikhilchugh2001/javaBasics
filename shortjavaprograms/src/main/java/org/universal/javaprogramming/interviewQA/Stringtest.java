package org.universal.javaprogramming.interviewQA;

public class Stringtest {
	
	
	public static String reverseWordInString(String str, int word) {
		
		
		String[] stringArray = str.split(" ");
		
		stringArray[word-1] = reversString(stringArray[word-1]);
		
		
		String finalString ="";
		
		for(String s: stringArray) {
			finalString = finalString +s + " ";
		}
		
		return finalString.trim();
		
		
	}
	
	public static String reversString(String str) {
		
		String reverse = "";
		
		char[] charArray = str.toCharArray();
		
		for(int i = charArray.length-1;i>=0; i--) {
			
			reverse = reverse + charArray[i];
			
			
		}
			
		
		return reverse;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder name = new StringBuilder("Nikhil Chugh");
		
		String s = "My Name is Nikhil Chugh";
		
		int x =4;
		
		
		
		//char[] ch = s.toCharArray();
		
		//11 12 13
		//21 22 23
		//31 32 33
		
		//31 21 11
		//32 22 12
		//33 23 13
		
		
		//int[][] a = [{11,12,13},{21,22,23}];
		
		System.out.println(reverseWordInString(s, x));
		
		
		}
		
		
		
		
		
		
		
		

	

}

