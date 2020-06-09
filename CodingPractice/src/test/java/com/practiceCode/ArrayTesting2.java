package com.practiceCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayTesting2 {

	public static void main(String[] args) {
		// Declare array & put 2,3,4,5,2,3. Then remove the Duplicates
		Set<Integer> myset =new HashSet<>();//outside the loop
		int [] a = {2,3,4,5,2,2,3};
		System.out.println("This is the Array before Loop "+Arrays.toString(a));
		//remove the duplicate from array
		for(int i = 0; i < a.length ; i++) {
			myset.add(a[i]);//only add inside the loop
			System.out.println("This is Array a looped "+a[i]);
			
		}
		System.out.println("This is my Set "+myset);// outside the loop
		
		//now declare a list with 4,4,3,2,null, null
		//remove duplicates
		
		List <Integer>mylist = new ArrayList<>();
		mylist.add(4);
		mylist.add(4);
		mylist.add(3);
		mylist.add(2);
		mylist.add(null);
		mylist.add(null);
		System.out.println("This is my List "+mylist);
		
		//now to remove the duplicate, use set
		
		Set<Integer> myHset = new HashSet<>(mylist);
		System.out.println("This is my HashSet "+myHset);
		

	}

}
