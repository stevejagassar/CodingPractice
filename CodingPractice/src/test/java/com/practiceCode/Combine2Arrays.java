package com.practiceCode;

import java.util.Arrays;

public class Combine2Arrays {

	public static void main(String[] args) {
		// TO combine 2 Arrays 1- Declare 2 Arrays, 2- 
		
		int [] a = {88,66,55,100,33,44,22,11,99};
		int [] b = {333,666,555,1000,333,444,222,111,222};
		
		//now create a new Array that will be the total length of the 2 arrays
		
		int [] c = new int [a.length + b.length];
		
		//now print the new Array c
		
		System.out.println(Arrays.toString(c));
		
		//loop 1st array ==> a
		
		for (int i = 0; i < a.length; i++) {
			
			c[i] = a[i];
			}
		
		System.out.println(Arrays.toString(c));
		
		//Now Loop 2nd Array ==> b
		
		for (int i = 0; i < b.length; i++) {
			c[a.length + i] = b [i];
			
		}
		System.out.println( Arrays.toString(c));
	}

}
