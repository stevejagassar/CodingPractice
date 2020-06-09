package com.FizzBuzz;

public class FixxBuzz {

	public static void main(String[] args) {
		// FizzBuzz ever # /3 & /5 = Fizzbuzz. Every # /3 is Fizz, amnd Every # /5 is Buzz

		
		for(int i= 0; i<=100; i++) {
			
			if (i%3==0 && i%5==0) {
				
				System.out.println("This is a FizzBuzz Number " +i);
			}
			if (i%3 == 0) {
				System.out.println("This is a Fizz Number "+i);
				
			}
			
			if (i%5 ==0) {
				System.out.println("This is a Buzz Number "+i);
			}
		}
		
	}

}
