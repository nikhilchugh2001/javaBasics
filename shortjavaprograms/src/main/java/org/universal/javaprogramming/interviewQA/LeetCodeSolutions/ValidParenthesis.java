package org.universal.javaprogramming.interviewQA.LeetCodeSolutions;

import java.util.Stack;

public class ValidParenthesis {
	
	
	public static boolean isValid(String s) {
		if (s == null || s.length() == 0)
			return true;
		s = s.replace(" ", "");
		char[] arr = s.toCharArray();
		
		System.out.println(s);
		Stack<Character> stack = new Stack<>();
		for (char current : arr) {
			if (current == '(' || current == '{' || current == '[') {
				stack.push(current);
			} else if (stack.isEmpty()) {
				return false;
			} else {
				char pop = stack.pop();
				if (pop == '(' && current != ')')
					return false;
				if (pop == '{' && current != '}')
					return false;
				if (pop == '[' && current != ']')
					return false;
			}
		}
		if (!stack.isEmpty())
			return false;
		return true;
	}
	
	
	public static int maxProfit(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;
    }
	
	//Below is when we we ciiuld have multiple transactions
	 public static int  maxProfit2(int[] prices) {
	        int maxprofit = 0;
	        for (int i = 1; i < prices.length; i++) {
	            if (prices[i] > prices[i - 1])
	                maxprofit += prices[i] - prices[i - 1];
	        }
	        return maxprofit;
	    }
	
	public static void main(String[] agrs) {
		
		
		String s="{  {   }}";
		System.out.println(ValidParenthesis.isValid(s));
		System.out.println(Integer.MAX_VALUE);
		int[] a = {100, 180, 260, 310, 40, 535, 695};
		System.out.println(maxProfit(a));
		System.out.println(maxProfit2(a));
		
	}

}
