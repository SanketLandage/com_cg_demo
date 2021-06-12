package com.cg.demo.method;

public class App {
	public static void main(String[] args) {
		
		Employee obj = new Employee();
		obj.id = 101;
		obj.name = "Sanket";
		obj.salary = 21000;
		System.out.println(obj.toString());
		
		Employee obj1 = new Employee();
		obj1.id = 102;
		obj1.name = "sasa";
		obj1.salary = 21000.135;
		System.out.println(obj1.toString());
		
		
		Employee obj2 = new Employee(104 , "xyz");
		System.out.println(obj2.toString());
		
		
		
		Employee obj3 = new Employee(103 , "lan" , 15000);
		System.out.println(obj3.toString());
		
//		
		
		
		
	}
}
