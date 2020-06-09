package com.String;

public class HowToFindLetterInString {

	public static void main(String[] args) {
		// How to find out how many T in SMARTTECH
		
		String a = "SMARTTECH";
		System.out.println(a);
		
		for (int i =0; i <a.length(); i++) {
			//System.out.println(a.charAt(i));
			
			if (a.charAt(i) == 'T') {
				System.out.println("T");
			}
			
		}

		String b = "Steve";
		System.out.println(b);
		
		for(int i = 0; i < b.length(); i ++) {
			if (b.charAt(i) == 'e') {
				System.out.println("e");
				
				
			}
			
			
		}
	}
}

