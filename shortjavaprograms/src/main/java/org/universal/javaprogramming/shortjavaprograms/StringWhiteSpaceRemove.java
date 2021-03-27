package org.universal.javaprogramming.shortjavaprograms;

public class StringWhiteSpaceRemove {

	public static void main(String[] args) {
		String s = "  abc  def\t";
		
		s = s.strip();
				
		System.out.println(s);
		
		s = s.trim();
		System.out.println(s);
	}
}
