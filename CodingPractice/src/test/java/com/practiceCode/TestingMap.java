package com.practiceCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TestingMap {

	public static void main(String[] args) {
		// Comparison with List & Map
		
		List <String> mylist = new ArrayList<>();
		mylist.add("Name = Rajon");
		mylist.add("Age = 30");
		mylist.add("Join Date = 6/10/2019");
		mylist.add("Phone Number = 7456394141");
		
		System.out.println("This is my list "+mylist);
		
		
		//to create or declare a Map with the same info
		Map <String,String> mymap = new HashMap<> ();//HashMap has no order
		mymap.put("Name", "Rajon");
		mymap.put("Age", "30");
		mymap.put("Join Date", "6/10/2020");
		mymap.put("Phone Number", "7456394141");
		
		//To print the entire Map
		System.out.println("This is my Map "+mymap);
		
		//to print only the keys
		System.out.println("These are the keys Only "+mymap.keySet());
		
		//to print the Values
		System.out.println("These are the values Only "+mymap.values());
		
		//to get specific info, like "Age", "Phone Number", "Name"
		System.out.println("This is the Age Value Only "+mymap.get("Age"));
		System.out.println("This is the Phone Number Only "+mymap.get("Phone Number"));
		System.out.println("This is the Name Only "+mymap.get("Name"));
		
		
		Map <String,String> mytmap = new TreeMap<> ();//TreeMap has ascending order
		mytmap.put("Name", "Rajon");
		mytmap.put("Age", "30");
		mytmap.put("Join Date", "6/10/2020");
		mytmap.put("Phone Number", "7456394141");
		
		//To print the entire Map
		System.out.println("This is my Tree Map "+mymap);
		//now create a may with Sky = Blue, Sun = Red, Tree = Green .. & print it
		
		Map <String,String> mymap1 = new HashMap<> ();
		mymap1.put("Sky", "Blue");
		mymap1.put("Sun", "Red");
		mymap1.put("Tree", "Green");
		
		//Print out the entire Map
		System.out.println("This is my Map1 "+mymap1);
		
		
		//print out the keys Only
		System.out.println("These are the Key Onlly from My Map1 "+mymap1.keySet());
		
		//print out the Values Only
		System.out.println("These are my Values Only from My Map1 "+mymap1.values());
		
	}

}
