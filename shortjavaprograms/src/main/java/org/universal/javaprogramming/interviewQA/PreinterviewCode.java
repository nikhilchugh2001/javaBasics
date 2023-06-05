package org.universal.javaprogramming.interviewQA;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Vector;

import org.apache.commons.lang3.concurrent.ConcurrentException;

interface PowerCalcuator{
	public double pCalc(int number);
}
public class PreinterviewCode {
	
	
	public static Object[] isArmstrong(int num, PowerCalcuator cube) {
		
		Object[] obj = new Object[2];
		int actualnum = num;
		double result = 0;
		while(num!=0) {
			
			int n = num%10;
			result = result + cube.pCalc(n);
			num=num/10;
		}
		
		if(result==actualnum) {
			obj[0] = actualnum;
			obj[1] = true;
			
			return obj;
		}
		else 
			obj[0] = actualnum;
			obj[1] = false;
			
			return obj;
		
	}
	
	
	public static int[] getFibinnaci(int n) {
		
		int[] series = new int[n];
		series[0] = 0;
		series[1] = 1;
		
		for(int i=2; i<series.length;i++) {
			series[i]= series[i-1] + series[i-2];
		}
		return series;
		
	}
	
	public static int[] bubbleSort(int[] array) {
		
		for(int i =0 ; i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]>array[j]) {
					int temp= array[i];
					array[i]= array[j];
					array[j]= temp;
					
				}
			}
		}
		
		return array;
	}
	
	public static int fetchAsciiValue(char chr) {
		
		return (int)chr;
	}
	
	 static void printLargest(Vector<String> arr)
	    {
	 
	        Collections.sort(arr, new Comparator<String>()
	        {
	            // A comparison function which is used by
	            // sort() in printLargest()
	            @Override public int compare(String X, String Y)
	            {
	 
	                // first append Y at the end of X
	                String XY = X + Y;
	 
	                // then append X at the end of Y
	                String YX = Y + X;
	 
	                // Now see which of the two
	                // formed numbers
	                // is greater
	                return XY.compareTo(YX) > 0 ? -1 : 1;
	            }
	        });
	 
	        Iterator it = arr.iterator();
	 
	        while (it.hasNext())
	            System.out.print(it.next());
	    }
	 
	 public static String[] convertToStringArray(int[] a) {
		 
		 String[] str= new String[a.length];
		
		for(int i = 0 ; i<a.length ; i++) {
			str[i] = String.valueOf(a[i]);
			}
		
		return str;
		 
	 }
	 
	 public static void printArray(String[] array) {
		 for(String s: array) {
			 System.out.print(s+", ");
		 }
	 }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PowerCalcuator cube = (int x) ->{
			return x*x*x;
		};
		
		System.out.println(Arrays.toString(isArmstrong(153, cube)));
		
		System.out.println("Fibonnaci is "+ Arrays.toString(getFibinnaci(5)));
		
		int arr[] = {1,9,3,2,5};
		System.out.println("Bubble sort is: "+ Arrays.toString(bubbleSort(arr)));
		
		System.out.println(fetchAsciiValue('A'));
		
		String array[] = {"45", "93", "9", "76"};
		
		System.out.println("In to String array: "+Arrays.toString(convertToStringArray(arr)));
		//printArray(convertToStringArray(arr));
		System.out.println("");
		
		printLargest(new Vector(Arrays.asList(convertToStringArray(arr))));

	}

}
