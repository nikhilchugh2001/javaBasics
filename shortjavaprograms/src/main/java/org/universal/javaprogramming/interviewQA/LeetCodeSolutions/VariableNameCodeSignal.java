package org.universal.javaprogramming.interviewQA.LeetCodeSolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VariableNameCodeSignal {
	
	public static String[] getWordsFromVariableName(String a) {
		
		String[] strArray = a.split("(?=\\p{Lu})");
		System.out.println(Arrays.toString(strArray));
		return strArray;
		
		
	}
	
	public static List<String> findWordsInMixedCase(String text, Pattern WORD_FINDER) {
	    Matcher matcher = WORD_FINDER.matcher(text);
	    List<String> words = new ArrayList<>();
	    while (matcher.find()) {
	        words.add(matcher.group(0));
	    }
	    return words;
	}
	
	public static boolean isVariableNameCamelCased(String[] words, String variableName ) {
		
		String[] variableNameCamelCase = getWordsFromVariableName(variableName);
		for(String var : variableNameCamelCase) {
			if(!Arrays.asList(words).contains(var.toLowerCase())) {
				return false;
			}
		}
		return true;
	}
	
	
	/*
	 * For words = ["is", "valid", "right"] and variableName = "isValid", the output should be solution(words, variableName) = true.

As variableName consists of words "is" and "valid", and both of them are in words.

For words = ["is", "valid", "right"] and variableName = "IsValid", the output should be solution(words, variableName) = true.

Note that both variants: "IsValid" and "isValid" are valid in CamelCase.

For words = ["is", "valid", "right"] and variableName = "isValId", the output should be solution(words, variableName) = false.

variableName is separated to words "is", "val", "id", and not all words are in words.
	 */
	public static void main(String[] args) {
	//System.out.println(getWordsFromVariableName("isValidName"));
	
	String[] words = {"is", "valid", "right"}; String  variableName = "isValid";
	String[] words2 = {"is", "valid", "right"}; String variableName2 = "IsValid";
	String[] words3 = {"is", "valid", "right"}; String variableName3 = "isValId";
	
	Pattern WORD_FINDER = Pattern.compile("(([A-Z]?[a-z]+)|([A-Z]))");
	System.out.println("************FindWords using*********************");
	System.out.println(findWordsInMixedCase(variableName3, WORD_FINDER).toString());
	System.out.println("************FindWords end*********************");
	System.out.println(isVariableNameCamelCased(words, variableName));
	System.out.println(isVariableNameCamelCased(words2, variableName2));
	System.out.println(isVariableNameCamelCased(words3, variableName3));
	
	
	}

}
