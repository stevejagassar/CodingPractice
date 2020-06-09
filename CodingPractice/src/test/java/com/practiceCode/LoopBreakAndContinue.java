package com.practiceCode;

public class LoopBreakAndContinue {

	public static void main(String[] args) {
		
		int i;
		
		for(i=0; i<5;i++) {
			if (i>=3) {
				System.out.println("Yuhu ");
				break;
			}
			
			if (i >=1) {
				System.out.println("Tata");
				continue;
			}
		}
		System.out.println(i);

	}

}
