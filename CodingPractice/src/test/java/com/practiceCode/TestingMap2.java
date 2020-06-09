package com.practiceCode;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestingMap2 {

	public static void main(String[] args) {
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
		
		//to print the value for Tree
		System.out.println("This is the avalue for Tree "+mymap1.get("Tree"));
		
		//Now Create/Declare a Map with Values Milk Price 3.99, Egg Price 1.99, Meat 7.99, Fish 4.99
		
		Map <String, Double> Price = new TreeMap<>();
		Price.put("Milk", 3.99);
		Price.put("Egg", 1.99);
		Price.put("Meat", 7.99);
		Price.put("Fish", 4.99);
		
		System.out.println("This is the Map "+Price);
		
		System.out.println("These are my Keys "+Price.keySet());
		System.out.println("These are my Values "+Price.values());
		System.out.println("Thes is the price for Egg "+Price.get("Egg"));
		
		//for each loop is the latest & fastest Loop in Java
		
		Price.forEach((k,v)-> {
			System.out.println("This is the Map in For Each Loop "+ k + v);
			
			
		});
		
		Price.entrySet().forEach(item->{
			
			System.out.println("Items = "+item );
			System.out.println("These are Item Keys "+item.getKey());
			System.out.println("These are Item Values "+item.getValue());
			
		});
	}

}
