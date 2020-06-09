package com.practiceCode;

import java.util.stream.IntStream;

public class SumFromLoop {

	public static void main(String[] args) {
		// Sum Value from Loop in Java 8
		
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
		sum = i + sum;
		//or sum + i;
		}
		System.out.println(sum);
		
		int sum1 = IntStream.rangeClosed(0, 100).sum();
		System.out.println( sum1);
		
	}

}
