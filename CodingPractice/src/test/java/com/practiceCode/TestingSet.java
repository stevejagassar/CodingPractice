package com.practiceCode;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestingSet {

	
	public static void main(String[] args) {
		// Declare a HashSet
		//Hash set = Class
		//Set = Interface
		//Object .... Creation 
		
		//Basic
		
		
		//TestingSet obj = new TestingSet();//1 ==> basic
		
		
		//inetrface obj = new interface(); //2==> not possible.....xxxxxxxxx
		
		//OOPs ==> upcasting Polymorphism
		
		//interface obj = new class();==> possible
		
		//Set obj = new HashSet();//upcasting Polymorphism combination of Interface & class
		
		// now e want to handle values of 2,3,4,5 int can be handled by Variable & Array. Integer (Wrapper Class) handled by List/Set/Map
		
		
		//no null ==>TreeSet & TreeMap
		//One Null ==> HashSet & LinkedHashSet
		//As many null ==> list & Array
		
		
		//no order ==> HashSet & HashMap
		//Insertion Order ==> List & LinkedHashSet
		//Ascending order ==> TreeSe5et & TreeMap
		//Desending Order ==> No one
		
		//No Duplicate ==> Set(HashSet, LinkedHashSet & TreeSet)
		//As many duplicate ==> Array & List
		
		//Thread safe & Syncronize ++ Vector, HashTable, String & StringBuffer
		//Slowest collection ==>Vector, HadshTable, String, StringBuffer
		
		//When anything fast==> 1)Not Thread Safe & not Syncronize 2) very fast.... HashSet, HashMap & StringBuilder
		
				
		Set <Integer>obj1 = new HashSet<>();//no order, no duplicate, one null
		obj1.add(2);
		obj1.add(3);
		obj1.add(4);
		obj1.add(5);obj1.add(2);
		
		System.out.println("This is HashSet for obj1 "+obj1);
		
		
		Set <Integer>obj2 = new HashSet<>();//no order, no duplicate, one null
		obj2.add(4);
		obj2.add(2);
		obj2.add(2);
		obj2.add(3);
		obj2.add(null);
		obj2.add(null);
		
		System.out.println("This is obj2"+obj2);
		
		
		Set <Integer>obj3 = new LinkedHashSet<>();//Insertion order, no duplicate, one null
		obj3.add(4);
		obj3.add(2);
		obj3.add(2);
		obj3.add(3);
		obj3.add(null);
		obj3.add(null);
		
		System.out.println("This is LinkedSet"+obj3);
		
		
		Set <Integer>obj4 = new TreeSet<>();//Insertion order, no duplicate, one null
		obj4.add(4);
		obj4.add(2);
		obj4.add(2);
		obj4.add(3);
		//obj4.add(null);
		//obj4.add(null);
		
		System.out.println("This is TreeSet"+obj4);//No null,Ascending order, no duplicate
		
		//int a= 10;
		//double b = 20.59;
		
		
		
	}

}
