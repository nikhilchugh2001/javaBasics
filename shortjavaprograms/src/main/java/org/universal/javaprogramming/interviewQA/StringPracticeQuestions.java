package org.universal.javaprogramming.interviewQA;

public class StringPracticeQuestions {

	
	@SuppressWarnings("unused")
	private static String capitalizeEachWord(String str) {
		
		//str="this is india", output="This Is India"
		/**
		 * Use String split() method
		 * This would return array
		 * 
		 *
		 */
		
		//s is used for blank space
		
		String words[] = str.split("\\s");
		String capitalizedStr="";
		for(String word : words ) {
			capitalizedStr = capitalizedStr + word.substring(0,1).toUpperCase() + word.substring(1)+ " ";
		}
		
		return capitalizedStr.trim();
		
	}
	
	private static String reverseWord(String str) {
		String newString="";
		
		String[] words = str.split("\\s");
		
		for(String word : words) {
			StringBuilder sb = new StringBuilder(word);
			sb.reverse();
			newString+=sb.toString() + " ";
			
			
			
			
		}
	
		
		
		return newString;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "this is india";
		
		System.out.println(capitalizeEachWord(str));
		System.out.println(reverseWord(str));
		
		//System.out.println("India\rBest");

	}

}
