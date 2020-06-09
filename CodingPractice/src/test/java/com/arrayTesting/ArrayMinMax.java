package com.arrayTesting;

import java.util.Arrays;

public class ArrayMinMax {

	public static void main(String[] args) {
		// Create an Array with 10, 25, 52, 40, 75, 20 & find the Min & Max #'s
		
		int []a = {10,25,52,40,75,20,8};
		System.out.println("Max in Array a "+Arrays.stream(a).max().getAsInt());//Will print the Max #
		
		System.out.println("Max in Array a "+Arrays.stream(a).min().getAsInt());//Will print the Min #

	}

}
