package com.practiceCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListPractice04122020 {

	public static void main(String[] args) {
		// Declare a list with 10, 20, 30, 40
		//Print the list
		//Loop it
		//Find out the Max #, and Min #
		
		
		List <Integer> a = new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		
		System.out.println(a);
		
		for(int i =0; i <a.size(); i++) {
			
		
		System.out.println(a.get(i));
	}	
		System.out.println(" Max # "+Collections.max(a));
		System.out.println("Max # "+Collections.min(a));
		
		// Declare a list with 22,55,33,77,44,99
				//Print the list
				//Loop it
				//Find out the Ascending & Descrending
				
				
				List <Integer> b = new ArrayList<>();
				b.add(22);
				b.add(55);
				b.add(33);
				b.add(77);
				b.add(44);
				b.add(99);
				
				System.out.println("This is List b "+b);
				
				for(int i =0; i <b.size(); i++) {
					
				
				System.out.println("List B is "+b.get(i));
			}	
				Collections.sort(b);
				System.out.println("Ascending Order of b  "+b);
				
				Collections.reverse(b);
				System.out.println("Descending Order of b  "+b);
	}

}
