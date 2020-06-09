package com.String;

public class StringReplace {

	public static void main(String[] args) {
		
			
			String c = "10, 442.75$";
			
			c.replace("$", "");
			
			System.out.println(c.replace(",", "").replace("$", ""));
			}
		
	}
