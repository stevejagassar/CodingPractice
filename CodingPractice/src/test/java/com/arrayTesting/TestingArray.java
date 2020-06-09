package com.arrayTesting;

import java.util.Arrays;

public class TestingArray {

	public static void main(String[] args) {
		// Declare an array of 10,20,30,40 then print it and loop it
		//10,20,30,40

		 int [] c = {10,20,30,40};
		 
		 System.out.println("This is the Array "+Arrays.toString(c));

		 for(int i = 0; i< c.length;i++) {
			 
			 System.out.println("This is Array loop " +c[i]);
		 }
	}

}
