package com.practiceCode;

import java.util.ArrayList;

public class ArrayListWithLoping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrlistobj = new ArrayList<>();
		arrlistobj.add("Alive is awesome ");
		arrlistobj.add("Love Yourself");
		arrlistobj.add("hi");
		
		for (int i = 0; i< arrlistobj.size(); i++) {
		System.out.println(arrlistobj.get(i).toString());
		
		}
		
		for (String a :arrlistobj) {
			System.out.println("This is a "+a);
			
		}
	}

}
