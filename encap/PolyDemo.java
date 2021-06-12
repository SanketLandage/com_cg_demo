package com.cg.demo.encap;

//Polymorphism - methods with the same name having different functionalities 

//compile time polymorphism - method overloading - early binding 
//possible with both static and non static methods 
//with static methods, possible only in one class 
//with non static methods, possible one class, or super + sub classes  
//three types 
//1. different number of arguments 
//2. different types of arguments 
//3. different order of arguments 

//run time polymorphism - method overriding - late binding 
//possible only with non static methods 
//possible only in super + sub classes 
//complete method signature is same 

public class PolyDemo {
	public int add(int i , int j) {
		return i +j;
	}
	
	public int add(int i , int j , int k) {
		return i+j+k;
	}
	
	public int add(int i , byte j) {
		return i+j;
	}
	
	public int add(byte i , int j) {
		return i+j;
	}
	
	public static void main(String[] args) {
		
		PolyDemo polyDemo = new PolyDemo();
		byte arg = 10;
		byte arg2 = 20;
		
		polyDemo.add(10,20);
		polyDemo.add(10,20,30);
		polyDemo.add(10,arg);
		polyDemo.add(arg2,20);
	}
}
