package com.practiceCode;

import java.util.Arrays;

public class TestingArrayLoop {

	public static void main(String[] args) {
		// Create an array of 11, 22, 33, 44, 55,66, 77 & Lopp it
		
		int []  a = {11,22,33,44,55,66,77};
		System.out.println(Arrays.toString(a));
		//Old way
		for (int i=0; i< a.length; i++) {//basic for loop
			System.out.println( a[i]);
			
				
		}
			//new way
			for (int i : a) { //Advance or enhance for loop
				System.out.println(i);
		
		}
		

	}

}
