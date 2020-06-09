package com.practiceCode;

public class CompareContainsReplaceString {

	public static void main(String[] args) {
		// TO compare 2 strings
		
		String s1 = "Hello";
		String s2 = "Me";
		System.out.println(" Compare s1 to s2 "+s1.compareTo(s2));
		
		
		//contains method
		String name ="what do you know about me";
		System.out.println("Contains s1 "+name.contains("do you know"));
		System.out.println("Contains s2 "+name.contains("Hello"));
		System.out.println("Contains s1 ll " +s1.contains("ll"));
		
		//Replace method
		
		String a = "Sarower";
		System.out.println("Replace a with e "+a.replace("a", "e"));	
		
		String b = "Sarower12345_";
		String ReplaceString11 = b.replace("[a-A-Z_0-9]", "");
		
		System.out.println("Replace String b "+ReplaceString11);
		
		
		

	}

}
