package com.practiceCode;

public class ReverseStringAndStringBuilderAppends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "RABO BANK";
		String newobj = new StringBuffer(s).reverse().toString();
		System.out.println("RABO BANK Reverse String " +newobj);
		
		//StringBUilder
		
		StringBuilder sb = new StringBuilder("Java");
		sb.append(" Rules");
		System.out.println(" String Builder Appends "+sb.toString());

	}

}
