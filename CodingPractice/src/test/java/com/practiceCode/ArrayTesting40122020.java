package com.practiceCode;

import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

public class ArrayTesting40122020 {

	public static void main(String[] args) {
		// Declare an Array with 2,3,4,5,6,7,8,9
		//Print it
		//Loop it
		//Max #
		//Min #

		int []a = {2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(a));
		
		for (int i = 0; i <a.length; i++) {
			
			
			System.out.println(a[i]);
			
		}
		System.out.println(" This is the Max Value "+Arrays.stream(a).max().getAsInt());
		System.out.println(" This is the Min Value "+Arrays.stream(a).min().getAsInt());
		
		// Declare an Array with 55,22,77,33,99
				//Print it
				//Sort it in Ascending
				//Sort it in Ascending
		
		int [] b = {55,22,77,33,99};
		System.out.println(Arrays.toString(b));
		Arrays.parallelSort(b);
		System.out.println("Array B sorted in Ascending "+Arrays.toString(b));
		
		ArrayUtils.reverse(b);
		System.out.println("Array B sorted in Descending "+Arrays.toString(b));
		
		
	}

}
