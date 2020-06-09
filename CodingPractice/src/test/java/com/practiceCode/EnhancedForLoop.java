package com.practiceCode;

public class EnhancedForLoop {

	public static void main(String[] args) {
		// Enhanced for Loop
		
		String array[]= {"Ron ","Harry","Hermoine"};
		
		for (String x:array) {
			
			System.out.println(x);
		}
		//for loop for the same function
		
		for (int i =0; i <array.length;i++) {
			System.out.println(array[i]);
		}
	}

}
