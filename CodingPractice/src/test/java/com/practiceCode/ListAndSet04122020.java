package com.practiceCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListAndSet04122020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <String> mylist = new ArrayList<>();
		mylist.add("sarower ");
		mylist.add("sarower ");
		mylist.add("ahmmed ");
		mylist.add("null ");
		mylist.add("null ");
		System.out.println("List Value "+mylist);
		
		
		Set <String> myset = new HashSet<>();
		myset.add("sarower");
		myset.add("sarower");
		myset.add("ahmmed");
		myset.add("null");
		myset.add("null");
		System.out.println("Set Value "+myset);
		
		
		Set <String> myLinkedset = new LinkedHashSet<>();
		myLinkedset.add("sarower");
		myLinkedset.add("sarower");
		myLinkedset.add("ahmmed");
		myLinkedset.add("null");
		myLinkedset.add("null");
		System.out.println("Linked HashSet Value "+myLinkedset);
		
		Set <String> myTreeset = new TreeSet<>();
		myTreeset.add("sarower");
		myTreeset.add("sarower");
		myTreeset.add("ahmmed");
		myTreeset.add("null");
		myTreeset.add("null");
		System.out.println("Linked HashSet Value "+myTreeset);
	}

}
