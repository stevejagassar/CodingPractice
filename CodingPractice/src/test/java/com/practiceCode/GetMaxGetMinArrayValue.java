package com.practiceCode;

import java.util.Arrays;

public class GetMaxGetMinArrayValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a = {88,66,55,100,33,44,22,11,99};
		//System.out.println("Max Value " = + Arrays.stream(a).max().getAsInt());
		
		System.out.println(" Max Value= "+Arrays.stream(a).max().getAsInt());//to get the max value
		
		System.out.println(" Min Value= "+Arrays.stream(a).min().getAsInt());//to get the max value
	}

}
