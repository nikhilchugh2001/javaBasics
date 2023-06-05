package org.universal.javaprogramming.interviewQA;

import java.util.HashMap;
import java.util.Map;

public class countOccurenceMap {
	
	public static void printOccurence(String str) {
		
		
		HashMap<Character, Integer> hashMap = new HashMap();
		str = str.replaceAll("\\s", "");
		char[] charArray = str.toCharArray();
		
		for(char ch: charArray) {
			if(hashMap.containsKey(ch)) {
				
				hashMap.put(ch, hashMap.get(ch)+1);
			}
			
			else
				hashMap.put(ch, 1);
		}
		
		for(Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
			System.out.println(entry.getKey() + " : "+entry.getValue());
		}
	}

public static void printOccurence2(String str) {
		
		
		HashMap<Character, Integer> hashMap = new HashMap();
		str = str.replaceAll("\\s", "");
		char[] charArray = str.toCharArray();
		
		for(char ch: charArray) {
			
				
				hashMap.put(ch, hashMap.getOrDefault(ch,0)+1);
			
			
		}
		
		for(Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
			System.out.println(entry.getKey() + " : "+entry.getValue());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printOccurence("India is great");
		System.out.println("***************");
		printOccurence2("India is great");

	}

}
