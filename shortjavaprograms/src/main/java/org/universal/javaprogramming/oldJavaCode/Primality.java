package org.universal.javaprogramming.oldJavaCode;

import java.util.Scanner;

/**
 * @author 
 *
 */
public class Primality {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int p = in.nextInt();
		boolean found = false;
		for (int a0 = 0; a0 < p; a0++) {
			int n = in.nextInt();
			if (n == 1) {
				System.out.println("Not prime");
			} else {
				for (int i = 2; i <= Math.sqrt(n); i++) {
					if (n % i == 0) {
						found = true;
						break;
					}
				}
				System.out.println(found ? "Not prime" : "Prime");
				found = false;
			}
		}
		in.close();
	}
}