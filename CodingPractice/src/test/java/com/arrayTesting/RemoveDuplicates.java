package com.arrayTesting;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// How to remove duplicate from Array by using Set
				//How to remove duplicate from a list by using Set
				//Use Tree Set to get values in ascending order
				
				
				List<Integer> mylist = new ArrayList<>();
				mylist.add(10);
				mylist.add(20);
				mylist.add(30);
				mylist.add(10);
				mylist.add(20);
				mylist.add(30);
				System.out.println(" Set Value "+mylist);
				
				Set <Integer> myset = new HashSet<>(mylist);
				System.out.println("List Value without Duplicate " +myset);
				
				
				Set <Integer> myTreeset = new TreeSet<>(mylist);
				System.out.println("Ascending Order " +myTreeset);
			}


}
