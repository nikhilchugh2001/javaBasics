package org.universal.javaprogramming.oldJavaCode;

public class AverageValueArray {

	public static void main(String[] args) {
		double a[] = {1,9,6,17,2,9};
		double sum =0;
		for (int i=0; i<a.length;i++) {
			sum = sum + a[i];
		}
		double average = (sum)/a.length;
		System.out.println(average);
	}
}
