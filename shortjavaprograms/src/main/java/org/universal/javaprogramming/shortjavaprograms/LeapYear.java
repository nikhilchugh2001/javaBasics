package org.universal.javaprogramming.shortjavaprograms;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Divisible by 4
		//Century year divisible by 400
		
		int year = 2000;
		boolean leap;
		
		if(year % 4 ==0) {
			if(year% 100 ==0) {
				if(year%400 ==0) {
					leap = true;
				}
				else leap = false;
			}
			else leap = true;
		}
		else leap = false;
		
		if (leap)
		      System.out.println(year + " is a leap year.");
		    else
		      System.out.println(year + " is not a leap year.");
		
		
		int year2;
		 
        // Taking input from user using Scanner Class
        // scn is an object made of Scanner Class
        Scanner scn = new Scanner(System.in);
        year2 = scn.nextInt();
 
        // 1st condition check- It is century leap year
        // 2nd condition check- It is leap year and not
        // century year
        if ((year2 % 400 == 0)
            || ((year2 % 4 == 0) && (year2 % 100 != 0))) {
           
            // Both conditions true- Print leap year
            System.out.println(year2 + " : Leap Year");
        }
 
        else {
            // Any condition fails- Print Non-leap year
            System.out.println(year2 + " : Non - Leap Year");
        }

	}

}
