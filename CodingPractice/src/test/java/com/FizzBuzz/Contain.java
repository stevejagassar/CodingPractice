package com.FizzBuzz;

public class Contain {

	public static void main(String[] args) {
		// Find out which #'s contain 3 from 10 to 100
		
		for (int i = 10; i <=100; i++) {
			if(String.valueOf(i).contains("3")) {
				
				System.out.println(i);
			}
			
		}

	}

}
