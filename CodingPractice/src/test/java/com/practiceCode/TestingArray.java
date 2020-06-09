package com.practiceCode;

import java.util.Arrays;

public class TestingArray {

	public static void main(String[] args) {
		// Testing Array
		

		// New way to write Array
		int [] a = {10,20}; //Single Dimensional Array
		int [] [] b = {{10,20}, {30,40}}; // Two Dimensional Array 
		
		System.out.println(Arrays.toString(a));
		
		String [] name = {"Sarower ", "Val"};
		
		//The Old way
		
		int [] c =new int[3];
		c[0] = 10;
		c[1] = 20;
		c[2] = 30;
		
		//How to print the array? 1- Declare the Array, 2- use the Arrays.deepToString(c)
		System.out.println(Arrays.toString(c));
		
		//how to loop the Array? 1- declare the Array, 2- use the for loop as shown below
		
		for (int i=0; i<= b.length; i++) {
			}
		System.out.println(Arrays.toString(name));
		}

	}


