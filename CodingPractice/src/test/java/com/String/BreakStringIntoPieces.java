package com.String;

import java.util.Arrays;

public class BreakStringIntoPieces {

	public static void main(String[] args) {
		// How to Break String into Pieces
		
		String a = "THE UNITED STATES OF AMERICA";
		System.out.println(a);
		String [] b = a.split(" ");
		System.out.println(Arrays.toString(b));
		
		//Looping String
		
		for(int i = 0; i<a.length(); i++) {
			//System.out.println(a.charAt(i));
			if (a.charAt(i) == 'S') {
				
				System.out.println('S');
				
		
			}
			}
		
		//now reverse the String 
		StringBuffer rev = new StringBuffer(a);
		System.out.println(rev.reverse());		
	}
}

