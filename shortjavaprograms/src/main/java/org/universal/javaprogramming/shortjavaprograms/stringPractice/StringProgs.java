package org.universal.javaprogramming.shortjavaprograms.stringPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringProgs {
	
	public static boolean isEmpty(String s) {
        return s == null || s.length() == 0;
    }
	
	public static HashMap printOccurence(String str) {


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
		
		return hashMap;
	}
	
	/*
	 * Removes white charateres from String
	 * 			
	 */
 
	
	public static String removeWhiteSpaces(String str) {

		str = str.replaceAll("\\s", "");

		return str;

	}
	
	/*
	 * Remove trailing and leading whiteSpaces
	 */
	public static String stripSpaces(String str) {

		str = str.strip();

		return str;

	}
	
	/**
	 * 
	 * @param text
	 * @param str
	 * @return
	 */
    /* Counts how many times the substring appears in the larger string. */
    public static int countMatches(String text, String str)
    {
        if (isEmpty(text) || isEmpty(str)) {
            return 0;
        }
 
        int index = 0, count = 0;
        while (true)
        {
            index = text.indexOf(str, index);
            System.out.println(index);
            if (index != -1)
            {
                count ++;
                index += str.length();
                System.out.println("in if loop"+index);
            }
            else {
                break;
            }
        }
 
        return count;
    }
	

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
	
	private static String reverseEachWord(String str) {
		String newString="";
		
		String[] words = str.split("\\s");
		
		for(String word : words) {
			StringBuilder sb = new StringBuilder(word);
			sb.reverse();
			newString+=sb.toString() + " ";
			
			
			
			
		}
	
		
		
		return newString;
	}

	public static String reverseWordInStringAtPos(String str, int word) {


		String[] stringArray = str.split(" ");

		stringArray[word-1] = reversString(stringArray[word-1]);


		String finalString ="";

		for(String s: stringArray) {
			finalString = finalString +s + " ";
		}

		return finalString.trim();


	}


	public static String reverseWordInString(String str, String word) {
		String[] strArray  = str.strip().split("\\s");
		String finalString ="";
		for(String wordInString : strArray) {
			
			
			if(wordInString.equals(word)) {
				wordInString = reversString(word);
				//System.out.println(word);
				finalString = finalString + wordInString + " ";
			}
			
			else
			finalString = finalString + wordInString + " ";
			
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
	
	static boolean isLetter(char ch)
    {
        if (!Character.isLetter(ch))
            return false;
 
        return true;
    }
 
    // Function to check if a string
    // contains all the letters from
    // a to z
    static boolean allLetter(String str,
                             int len)
    {
        // Convert the given string
        // into lowercase
        str = str.toLowerCase();
        int size = 26;
        // Create a frequency array to
        // mark the present letters
        boolean[] present = new boolean[size];
 
        // Traverse for each character
        // of the string
        for (int i = 0; i < len; i++) {
 
            // If the current character
            // is a letter
            if (isLetter(str.charAt(i))) {
 
                // Mark current letter as present
                int letter = str.charAt(i) - 'a';
                present[letter] = true;
            }
        }
 
        // Traverse for every letter
        // from a to z
        for (int i = 0; i < size; i++) {
 
            // If the current character
            // is not present in string
            // then return false,
            // otherwise return true
            if (!present[i])
                return false;
        }
        return true;
    }
    
    
    /*
     * Count each word in a string it's frequency
     */
    public static HashMap<String, Integer> countWordsInString(String str) {
    	
    	String[] strArray = str.strip().split(" ");
    	
    	HashMap<String, Integer>  map = new HashMap<String, Integer>();
    	
    	
    	for(String s : strArray) {
    		
    		if(map.containsKey(s)) {
    			int count = map.get(s);
    			map.put(s, count +1);
    			
    			
    		}
    		else {
    			map.put(s, 1);
    		}
    		
    	}
    	
    	return map;
    	
    }
    
    
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Random input string
        String gfg = "Welcome, to, GFG";
 
        // Split the above input string
        // using split() method and
        // store the input string elements as an array
         String[] str = gfg.split("(?!^)");
 
        // Print all the elements of an array
        System.out.println(Arrays.toString(str));
        
        //CallRemoveWhite Space
        System.out.println(removeWhiteSpaces(" India is great "));
        
        
        //Strip Spaces
        System.out.println(stripSpaces(" India is great "));
        
        
        //Reverse each word
        System.out.println(reverseWordInString(" India is great but bharat is great too  ","great"));
        
        
        //Print occurrence of character
       System.out.println( printOccurence(" India is great but bharat is great too  "));
       
     //Count occurrence of word
       System.out.println( countWordsInString(" India is great but bharat is great too  "));
       
       //Count occurrence of word
       prCharWithFreq(" India is great but bharat is great too  ");

	}

}
