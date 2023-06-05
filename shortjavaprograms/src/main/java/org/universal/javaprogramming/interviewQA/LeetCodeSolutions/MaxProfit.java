package org.universal.javaprogramming.interviewQA.LeetCodeSolutions;

public class MaxProfit {

	
	public static int maxProfit(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        int buyPriceIndex=-1; 
        		int sellPriceIndex =-1;
        for (int i = 0; i < prices.length; i++) {
            if ((prices[i] < minprice) ) {
                minprice = prices[i];
            	buyPriceIndex=i;
            	
            }
            else if (prices[i] - minprice > maxprofit) {
                maxprofit = prices[i] - minprice;
                sellPriceIndex=i;
            }
            
        }
        System.out.println(prices[buyPriceIndex]);
        System.out.println(prices[buyPriceIndex]-prices[sellPriceIndex]);
        return maxprofit;
    }
	
	public static void main(String[] agrs) {
		
		
		String s="{  {   }}";
		System.out.println(ValidParenthesis.isValid(s));
		System.out.println(Integer.MAX_VALUE);
		int[] a = {100, 180, 260, 310, 40, 535, 695};
		System.out.println(maxProfit(a));
		
	}

}
