package org.universal.javaprogramming.oldJavaCode;

import java.util.StringTokenizer;

public class RemoveExtraSpaces {
	
    public static void main(String args[]){
    	
        String input = "Try    to    remove   extra   spaces.";
        StringTokenizer substr = new StringTokenizer(input, " ");
        StringBuffer sb = new StringBuffer();
        
        System.out.println(substr.toString());
        while(substr.hasMoreElements()){
            sb.append(substr.nextElement()).append(" ");
        }
        
        System.out.println("Actual string: " + input);
        System.out.println("Processed string: " + sb.toString().trim());
    }
}