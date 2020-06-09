package com.FizzBuzz;

public class OddNumber {

	public static void main(String[] args) {
		// Find out Odd #'s from 5 to 29
		
		for (int i = 5; i <30; i++) {
			
			if (i%2 !=0) {
				System.out.println("This Is An Odd # "+i);
			}
		}
		
		//now find even #'s 
		
		for(int i = 5; i <=30; i++) {
			
			if (i%2 ==0) {
				
				System.out.println("This is an Even # "+i);
			}
		}

	}

}
