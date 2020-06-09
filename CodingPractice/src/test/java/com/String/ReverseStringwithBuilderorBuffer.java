package com.String;

public class ReverseStringwithBuilderorBuffer {

	public static void main(String[] args) {
		// Reverse String THE UNITED STATES OF AMERICA using StringBuffer or StringBuilder
		
		String a = "THE UNITED STATES OF AMERICA";
		
		StringBuilder a1 = new StringBuilder(a);
		System.out.println("StringBuilder Reverse "+a1.reverse());
		
		StringBuffer a2 = new StringBuffer(a);
		System.out.println("String Buffer Reverse "+a2.reverse());
		
		//now do it with loop
		
		for (int i =a.length()-1; i >=0; i--) {
			
			System.out.println(a.charAt(i));
		}

	}

}
