package com.arrayTesting;

import java.util.Arrays;

public class ArrayTesting1 {

	public static void main(String[] args) {
		// Testing the Array Length 
		
		int [] a = new int [5];
		a[0]= 10;
		a[1] =20;
		a[2] =30;
		a[3] =40;
		a[4] =50;
		
	
		System.out.println("This is Array A "+Arrays.toString(a));
		System.out.println("This is the lenght of Array A "+a.length);
		for(int i=0;i<a.length;i++) {
			
			System.out.println("This the for loop values "+a[i]);
			
			
	}
		
		//New Way to write an Array
		
		int [] b = {10,201,330,460,50, 160, 90};
		for(int i= b.length -1;i>=0;i--) {
			
			System.out.println("This is the reverse Loop "+b[i]);
		}
		
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));

	}

}
