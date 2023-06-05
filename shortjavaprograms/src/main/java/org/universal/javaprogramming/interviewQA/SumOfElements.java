package org.universal.javaprogramming.interviewQA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfElements {
	
	public static int sumOfElements(int[] a) {
		
		int sum =0;
		for(int i=0;i<a.length;i++) {
			sum = sum + a[i];
			
		}
		
		return sum;
		
		
	}
	
	public static int printMaxAdjancetIndexDiff(int[] a) 
	{
		int max =0;
		
		int arraySize = a.length;
		for(int i =0; i<arraySize-1;i++)
		{
			
			int diff = a[i+1] - a[i];
			if(max<diff) {
				max= diff;
				
			}
		}
		return max;
		
	}
	
	public static void mutliplicationTableWithoutOp(int a) {
		
		 int tableValue = 1;
		int sum =0;
		
		for(int i =0 ; i<10;i++) {
			sum = sum +a;
			System.out.println(sum);
			
			
		}
		
	}
	
	public static ArrayList<Integer> compareArray(int[]a, int[] b) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i =0; i<a.length; i++) {
			if(a[i]==b[i]) {
				list.add(a[i]);
			}
			
		}
		
		return  list;
		
		

	}
	
public static int[] compareArrayReturnArr(int[]a, int[] b) {
		
	
		int count =0;
		int[]  array = new int[a.length];
		for(int i =0; i<a.length; i++) {
			if(a[i]==b[i]) {
				array[i] = a[i];
				count++;
			}
			
		}
		
		int[] returnArray = new int[count];
		
		int k =0;
		for(int i =0; i<a.length; i++) {
			if(array[i]==0) {
				
			}
		
			else {
				returnArray[k++] = array[i];
				
			}
		}
		
		return returnArray;
	}

public static int[] bubbleSort(int[] a) {
	
	for(int i=0; i<a.length-1;i++) {
		for(int j=0;j<a.length-i-1;j++) {
			if(a[j]>a[j+1]) {
				int temp = a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
		
	}
	
	
	
	return a;
	
}

public static int[] bubbleSort2(int[] a) {
	for(int i =0; i<a.length;i++) {
		for(int j=i+1; j<a.length;j++) {
			if(a[i]>a[j]) {
				int temp = a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	
	return a;
}


public static void pyramidPatternRight() {
	
	int i, j,  row = 6;
	
	System.out.println("==============Pyramid Pattern Right==============");
	for(i=1;i<=row;i++) {
		for(j=1; j<=i;j++) {
			System.out.print("* ");
		}
		System.out.println("");
	}
	
}
public static void pyramidPatternLeft() {
	
	
	//Left pattern
	//i for rows and j for columns      
	//row denotes the number of rows you want to print  
	
	System.out.println("==============Pyramid Pattern left==============");
	int i, j, row = 6;       
	//Outer loop work for rows  
	for (i=1; i<=row; i++)   
	{  
		/*
		 * //inner loop work for space for (j=2*(row-i); j>=0; j--) { //prints space
		 * between two stars System.out.print(" "); } //inner loop for columns for (j=0;
		 * j<=i; j++ ) { //prints star System.out.print("* "); } //throws the cursor in
		 * a new line after printing each line System.out.println();
		 */  
		
		for(j=1;j<=row;j++) {
			
			if((i+j)<=row) {
				System.out.print(" ");
			}
			
			else {
				System.out.print("*");
			}
			
		}
		System.out.println("");
	}   
}

public static void diamondPyramid() {
	
	int i, j, space, row = 6;  
	
	for (i=1; i<=row; i++)   
	{  
		for(space=1;space<=row-i;space++) {
			System.out.print(" ");
		}
		
		for(j=1;j<=i;j++) {
			
		
				System.out.print("* ");
			
			
		}
		System.out.println("");
	}
		
	
}

public static void fullDiamondPyramid() {
	int i, j, space, row = 6;  
	for (i=1; i<=row; i++)   
	{  
		for(space=1;space<=row-i;space++) {
			System.out.print(" ");
		}
		
		for(j=1;j<=2*i -1;j++) {
			
		
				System.out.print("*");
			
			
		}
		System.out.println("");
	}
	
}


public static void getFibanocciUsingArray(int length) {
	
	int a[] = new int[length];
	
	a[0] =0;
	a[1]= 1;
	
	for(int i =2;i<a.length;i++) {
		
		a[i]= a[i-1] + a[i-2];
		
	}
	
	System.out.println(Arrays.toString(a));
	
	
}

public static void getFibanocciUsinSwap(int len) {
	
	int a=0;
	int b=1;
	int sum;
	
	for(int i=1;i<=len;i++) {
		
		System.out.println(a);
		
		sum= a+b;
		a=b;
		b=sum;
		
		
	}
	
	
}

public static boolean isPrime(int a) {
	
	boolean check = true;
	
	for(int i=2;i<=(a/2);i++) {
		
		if(a%i==0) {
			check = false;
			
		}
	}
	
	return  check;
	
	
}

public static int getMaxTwoDimensionArray(int[][] a) {
	
	int max =0;
	for(int i =0; i<a.length;i++) {
		for(int j =0; j<a.length;j++) {
			if(max<a[i][j]) {
				max= a[i][j];
			}
			
		}
	}
	
	return max;
}


public static String reverseString(String str) {
	
	
	
	String reverse="";
	
	char[] stringArray= str.toCharArray();
	for(int i =str.length()-1; i >= 0; i--) {
		reverse = reverse + stringArray[i];
		
		
	}
	
	
	
	return reverse;
	
}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 int[] a = {1,5,4,3,8,9};
		 int[] b = {1,5,2,5,4,7};
		
		 System.out.println("********************************");
		 System.out.println();
		 a = bubbleSort(a);
		 b= bubbleSort2(b);
		 System.out.println(Arrays.toString(a));
		 System.out.println(Arrays.toString(b));
		 
		 System.out.println("********************************");
		 System.out.println();
		 System.out.println(sumOfElements(a));
		 //mutliplicationTableWithoutOp(5);
		 
		 System.out.println("********************************");
		 System.out.println();
		 System.out.println(printMaxAdjancetIndexDiff(a));
		 
		 int[] c = compareArrayReturnArr(a, b);
		 System.out.println("********************************");
		 System.out.println();
		 System.out.println(Arrays.toString(c));
		 
		 System.out.println("********************************");
		 System.out.println();
		 System.out.println("********************************");
		 System.out.println();
		 System.out.println("Compare Array");
		 System.out.println(compareArray(a, b).toString());
		 
		 int d=5, e =4, f =88, g=31;
		 
		 d = d + e;
		 d= d - e;
		 e = d- e;
		 
		 System.out.println(d);
		 
		 System.out.println("********************************");
		 System.out.println("Left Pattern");
		 
		 pyramidPatternLeft();
		 
		 System.out.println("********************************");
		 System.out.println();
		 
		 
		 System.out.println("********************************");
		 System.out.println("Right Pattern");
		 pyramidPatternRight();
		 System.out.println("********************************");
		 System.out.println();
		 
		 diamondPyramid();
		 System.out.println("********************************");
		 System.out.println();
		 
		 fullDiamondPyramid();
		 System.out.println("********************************");
		 System.out.println();
		 
		 getFibanocciUsingArray(10);
		 System.out.println("********************************");
		 System.out.println();
		 
		 getFibanocciUsinSwap(10);
		 System.out.println("********************************");
		 System.out.println();
		 
		 System.out.println(isPrime(f));
		 
		 System.out.println("********************************");
		 System.out.println();
		 
		 int[][] twoDa = {{1,2,3},{6,90,88},{5,900,67}};
		 System.out.println(getMaxTwoDimensionArray(twoDa));	
		 
		 System.out.println("********************************");
		 System.out.println();
		 
		 System.out.println(reverseString("madam"));
		 
		 
	}
	
	

}
