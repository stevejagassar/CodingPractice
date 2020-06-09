package com.practiceCode;

public class Group2Testing {

	

	public int getsalary() {
		return 5000;
		
	}
	
	public String getname() {
		return "Shumon";
		
	}
	
	public double getdouble() {
		return 20.99;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Group2Testing obj = new Group2Testing();
		
		//Group2Testing name = new Group2Testing();
				
		int c =	obj.getsalary();
				
		String a = obj.getname();
		
		double b = obj.getdouble();
		
		System.out.println(c);
		System.out.println(a);
		System.out.println(b);
	}

}
