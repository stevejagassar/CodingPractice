package com.String;

public class StringForLoopAndPallindrome {

	public static void main(String[] args) {
		// Print United State of America forward & reverse
				//Find out how many E letter is there inside UNITED STATE OF AMERICA
				//find out the word MOM is a palindrome or not.
				//10, 442.75$ remove , & $
				
				String s = "UNITED STATES OF AMERICA";
				
				for (int i=0; i < s.length(); i++) {
				
				System.out.println(s.charAt(i));
				
				}
				
				for (int i=0; i < s.length(); i++)
				if (s.charAt(i)== 'E' ) {
				System.out.println(s.charAt(i));
				}
									
				String a = "MOM";
					
				StringBuilder Builder = new StringBuilder("MOM");
					
				Builder.reverse();
					if (a.equals(Builder.reverse().toString())) {
						System.out.println("Is a Pallindrome " +a);	
					}
					else {
							System.out.println("Not a Pallindrome "+a);
					}

}

}
