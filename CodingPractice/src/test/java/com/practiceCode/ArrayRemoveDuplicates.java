package com.practiceCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ArrayRemoveDuplicates {

	public static void main(String[] args) {
		// How to remove duplicate from Array by using Set
				//How to remove duplicate from a list by using Set
				//Use Tree Set to get values in ascending order

		int [] a = {40,10,20,30,10,20};
		
		System.out.println(" Array Value "+Arrays.toString(a));
		
		Set<Integer> myset = new HashSet<>();
		Set<Integer> myTreeset = new TreeSet<>();
		for (int i =0; i<a.length; i++) {
			
			myset.add(a[i]);
			myTreeset.add(a[i]);
		}
		System.out.println("List Value without Duplicates "+myset);
		System.out.println("Ascending Order "+myTreeset);
		
}
}