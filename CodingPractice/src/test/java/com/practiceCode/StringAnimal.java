package com.practiceCode;

public class StringAnimal {
	
	static String a="sarower";
	static String obj = new String();
	
	public static void main(String[] args) {
		System.out.println(a.concat(" Ahmmed"));
		
		System.out.println(obj.concat(" Ahmmed"));
		
		System.out.println(a.concat(" Ahmmed"));
		System.out.println(obj.concat(" Ahmmed"));
		System.out.println(a);
		System.out.println(obj); //immutable = change not possible===> Store in inside the HEAP==>String pool
		
		StringBuffer bufferObj = new StringBuffer(" Sarower ");
		
		System.out.println(bufferObj);
		System.out.println(bufferObj.append("Ahmmed"));
		System.out.println(bufferObj);// mutable = change possible==> Heap
		
		StringBuilder builderObj = new StringBuilder("Sarower ");
		System.out.println(builderObj);
		System.out.println(builderObj.append("Hossain"));
		System.out.println(builderObj);//mutable==> Heap
		
	}
			
	
	

}
