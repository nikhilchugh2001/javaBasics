package org.universal.javaprogramming.shortjavaprograms.stringPractice;

//Java implementation to
//print the characters and
//frequencies in order
//of its occurrence
import java.util.*;
class Gfg{
	public static void prCharWithFreq(String s)
	{
	
		// Store all characters and
		// their frequencies in dictionary
		Map<Character, Integer> d = new HashMap<Character, Integer>();
		
		
		for(int i = 0; i < s.length(); i++)
		{
			if(d.containsKey(s.charAt(i)))
			{
				d.put(s.charAt(i), d.get(s.charAt(i)) + 1);
			}
			else
			{
				d.put(s.charAt(i), 1);
			}
		}
		
		// Print characters and their
		// frequencies in same order
		// of their appearance
		for(int i = 0; i < s.length(); i++)
		{
		
			// Print only if this
			// character is not printed
			// before
			if(d.get(s.charAt(i)) != 0)
			{
				System.out.print(s.charAt(i));
				System.out.print(d.get(s.charAt(i)) + " ");
				d.put(s.charAt(i), 0);
			}		
		}
	}

	// Driver code
	public static void main(String []args)
	{
	String S = "geeksforgeeks";
	prCharWithFreq(S);
	}
}

//This code is contributed by avanitrachhadiya2155
