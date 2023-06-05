package org.universal.javaprogramming.interviewQA.LeetCodeSolutions;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.universal.javaprogramming.interviewQA.SumOfElements;

public class ThirdLargestElementArray {
	
	
	/*
	 * Assuming distinct elements
	 */
	public static int getNthlargestnumber(int[] a, int n) {
		
		int[] sortedArray = SumOfElements.bubbleSort2(a);
		return sortedArray[n-1];
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1, 14, 2, 16, 10, 20, 10};
		   Integer[] sourceArray = { 0, 1, 2, 3, 4, 5 };
		    List<Integer> targetList = Arrays.asList(sourceArray);
		//Set<String> set = new HashSet<>(Arrays.stream(arr).collect(Collectors.toSet()));
		    
		    //boxed() will return a Stream consisting of the elements of this stream, each boxed to an Integer
		    Set<Integer> set = Arrays.stream(arr).filter(p->p<20).boxed().collect(Collectors.toSet());
		    
		    /*
		     * return IntStream.range(0, 10)
    .filter(i -> compare(z, f(i)))
    .mapToObj(Integer::valueOf)
    .collect(Collectors.toCollection(ArrayList::new));
		     */
		
		System.out.println(getNthlargestnumber(arr, 4));
		System.out.println(set.toString());

	}

}
