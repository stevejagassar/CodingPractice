package com.practiceCode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayAndForLoop {

	public static void main(String[] args) {
		// 
				
		int [] b = {100,200,300};
		for (int i = 0; i <  b.length; i ++) {
			System.out.println(b[i]);
			//System.out.println(b[b.length] -1);		
		}
		System.out.println(" Array Max Value= "+Arrays.stream(b).max().getAsInt());//to get the max value
		
		System.out.println(" Array Min Value= "+Arrays.stream(b).min().getAsInt());//to get the max value
		
		List<Integer> obj = new ArrayList<>();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		for (int i = 0; i <  b.length; i ++) {
			System.out.println(b[i]);
		
		
		
		}
		//Collections.max(obj)
		System.out.println("This is List Max " +Collections.max(obj));
		System.out.println("This is List Max " +Collections.min(obj));
		System.out.println("List value 0= "+obj.get(0));	
		System.out.println("List last value= "+obj.get(obj.size()-1));
		}

}
