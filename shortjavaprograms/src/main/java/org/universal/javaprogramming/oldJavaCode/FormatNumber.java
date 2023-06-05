package org.universal.javaprogramming.oldJavaCode;



import org.apache.commons.lang.math.NumberUtils;

import java.text.DecimalFormat;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.util.regex.Pattern;


public class FormatNumber {
	
	public static void main(String args[]) {
	    long[] numbers = new long[]{7, 12, 856, 1000, 5821, 10500, 101800, 2000000, 7800000, 92150000, 123200000, 9999999, 1345678900};
	    for(long number : numbers) {
	        System.out.println(number + " = " + format(number));
	    }
	}

	private static String[] suffix = new String[]{"","k", "m", "b", "t"};
	private static int MAX_LENGTH = 4;

	private static String format(double number) {
	    String r = new DecimalFormat("###E0").format(number);
	    System.out.println(r);
	    System.out.println(Character.getNumericValue(r.charAt(r.length() - 1)) / 3);
	    r = r.replaceAll("E[0-9]", suffix[Character.getNumericValue(r.charAt(r.length() - 1)) / 3]);
	    while(r.length() > MAX_LENGTH || r.matches("[0-9]+\\.[a-z]")){
	        r = r.substring(0, r.length()-2) + r.substring(r.length() - 1);
	    }
	    return r;
	}
}
