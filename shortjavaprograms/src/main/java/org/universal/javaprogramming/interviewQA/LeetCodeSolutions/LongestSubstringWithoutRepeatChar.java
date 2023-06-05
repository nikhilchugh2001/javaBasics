package org.universal.javaprogramming.interviewQA.LeetCodeSolutions;

import java.beans.Visibility;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LongestSubstringWithoutRepeatChar {
	
	//Longest SubString without repeating characters 
	
	public static int lengthOfLongestSubstring(String str) {
        int n = str.length();
        // Result , res stands for resultant string
        int res = 0,left=0, right=0;
        ArrayList < Character > visited = new ArrayList();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (visited.contains((str.charAt(j)))) {
                    visited.clear();
                    break;
                } else {
                    visited.add((str.charAt(j)));
                    if (res < j - i + 1) {
                        res = j - i + 1;
                        left=i;
                        right=j;
                    }

                }
            }

        }
        System.out.println(str.substring(left, right+1));
        return res;
    }
	
	
	//Below method needs work, not working as of now
	public static String getlongestSubString(String s) {
		
		//Set<Map<String, Integer>> setSubString = new HashSet<Map<String, Integer>>();
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		
		StringBuilder sb = new StringBuilder();
		
		int right =0;
		for(char ch: s.toCharArray()) {
			
			while( right <s.length()) {
				
				if(!(sb.toString().indexOf(ch)==-1) ) {
					break;
				}
				
				sb.append(ch);
				map.put(sb.toString(), sb.length());
				right++;
			}
			
		}
		
		Map.Entry<String, Integer> maxEntry = null;
		for(Map.Entry<String, Integer> entry: map.entrySet()) {
			 if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
				    maxEntry = entry;
				  }
		}
		
		String maxString = maxEntry.getKey();
		
		return maxEntry.getKey();
		
	}
	
	public static Map<String, Integer> getLongestPalindromeSubString(String s) 
	{
		int n = s.length();
        // Result
        int res = 0,left=0, right=0, max=1;
       char[] charArray = s.toCharArray();
       Map<String, Integer> subStringMap = new HashMap<String, Integer>();
       String testSubString = "";
        for (int i = 0; i < charArray.length; i++) {
        	testSubString="";
            for (int j = i; j < charArray.length; j++) {
            	//To note here we dont need to ckeck on repeating character, we need to only check palandrome string
            	testSubString= testSubString+charArray[j];
            	if(isPalindrome(testSubString) && testSubString.length()>1) {
            		subStringMap.put(testSubString, testSubString.length());
            		
            	}
            	 
            	
               

                }
            }

        //System.out.println(subStringMap);
        //System.out.println(s.substring(left, right+1));
        return subStringMap;
		
	}
	
	static boolean isPalindrome(String str)
    {
 
        // Pointers pointing to the beginning
        // and the end of the string
        int i = 0, j = str.length() - 1;
 
        // While there are characters to compare
        while (i < j) {
 
            // If there is a mismatch
            if (str.charAt(i) != str.charAt(j))
                return false;
 
            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }
 
        // Given string is a palindrome
        return true;
    }
	
	public static String reverseWords(String s) {
		
		String str[] = s.trim().split("\\s");
		String reverseWordString="";
		for(int i=str.length-1; i>=0;i--) {
			
			reverseWordString = reverseWordString + str[i] + " ";
			
		}
		
		return reverseWordString.trim();
		
		
	}
	
	private static List<String> testStreamMap(Map<String, Integer> mapGroup) {
	    if(mapGroup.isEmpty())
	        return Collections.emptyList();
	    long max = mapGroup.values().stream().max(Comparator.naturalOrder()).get();
	    return mapGroup.entrySet().stream()
	        .filter(e -> e.getValue() == max)
	        .map(Map.Entry::getKey)
	        .collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		String s1= "geeksforgeeks";
		String s2= "ABDEFGABEF";
		String s3 ="baabadaad";
		String s4 = "cbbd";
		StringBuilder sb = new StringBuilder(s3);
		sb.reverse();
		
		//System.out.println(lengthOfLongestSubstring(s1));
		//System.out.println(getLongestPalindromeSubString(s2));
		
		System.out.println(getLongestPalindromeSubString(s4));
		
		 Entry<String, Integer> maxEntry = Collections.max(getLongestPalindromeSubString(s3).entrySet(), (Entry<String, Integer> e1, Entry<String, Integer> e2) -> e1.getValue()
			        .compareTo(e2.getValue()));
		 System.out.println(maxEntry.getKey());
		 
		 
		
			/*
			 * System.out.println( Stream.of(1, 3, 5, 3, 2, 3, 5) .map(a->new Integer[]{a})
			 * .reduce((a,b)-> a[0]==b[0]?
			 * Stream.concat(Stream.of(a),Stream.of(b)).toArray() : a[0]>b[0]? a:b ).get()
			 * );
			 */
		 
		 List<Integer> list = List.of(1, 3, 5, 3, 2, 3, 5);
		  list.stream().filter(i -> i == (list.stream().max(Comparator.comparingInt(i2 -> i2))).get()).forEach(System.out::println);
		  
		  System.out.println(testStreamMap(getLongestPalindromeSubString(s3)));
		  System.out.println(reverseWords("the sky is blue"));
	}

}
