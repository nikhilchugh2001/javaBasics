package org.universal.javaprogramming.interviewQA.LeetCodeSolutions;

import java.util.HashMap;

public class LeetCodeString {
	
	
	
	
	/*
	 * 
	 * Given a string s, find the first non-repeating character in it and return its index. 
	 * If it does not exist, return -1.

 

Example 1:

Input: s = "leetcode"
Output: 0
Example 2:

Input: s = "loveleetcode"
Output: 2
Example 3:

Input: s = "aabb"
Output: -1
	 * 
	 * 
	 */
	
	//Below not coded fully
	public static void FirstNonRepeat(String s)
	  {
	 
	    for (int i = 0; i < s.length(); i++) {
	 
	      if (s.indexOf(s.charAt(i), s.indexOf(s.charAt(i)) + 1) == -1) {
	        System.out.println("First non-repeating character is "+ s.charAt(i));
	        break;
	      }
	    }
	    return;
	  }
	
	
	/**
	 * 
	 * @author Nikhil
	 * @param s
	 * @return
	 */
	 public static int firstUniqChar(String s) {
	        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
	        int n = s.length();
	        // build hash map : character and how often it appears
	        for (int i = 0; i < n; i++) {
	            char c = s.charAt(i);
	            count.put(c, count.getOrDefault(c, 0) + 1);
	        }
	        
	        // find the index
	        for (int i = 0; i < n; i++) {
	            if (count.get(s.charAt(i)) == 1) 
	                return i;
	        }
	        return -1;
	    }
	  public static void main (String[] args) {
	    String s = "geeksforgeeks";
	    FirstNonRepeat(s);
	    System.out.println(firstUniqChar(s));
	    int index = firstUniqChar(s);
	   char nonRepeatingChar = s.toCharArray()[index];
	    System.out.println(nonRepeatingChar);
	    System.out.println(s.toCharArray()[firstUniqChar(s)]);
	  }

}
