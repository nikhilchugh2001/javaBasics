package org.universal.javaprogramming.oldJavaCode;

import java.util.Scanner;

public class MakingAnagrams {
	
	public static int numberNeeded(String first, String second) {
        int m=0;
     int c[]=new int[26];
      for(char i: first.toCharArray())
          c[i-97]++;
          for(char i:second.toCharArray())
          c[i-97]--;
      for(int i:c)
        m=m+Math.abs(i); 
        return m;     
  }

  public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      String a = in.next();
      String b = in.next();
      System.out.println(numberNeeded(a, b));
  }

}
