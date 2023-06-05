package org.universal.javaprogramming.oldJavaCode;

public class Tag32AReplace {
	
	public static void main(String[] args) {
		
		String tag32AValue = "rttrtr :32A:20200602AUD344,99";
		
		String c = tag32AValue.replaceAll(":32A:[0-9]{8}", "20200306");
		System.out.println(c);
		
	}

}
