package com.cg.demo.oop;


public class MedthodDemo {
	
	static void Add(int a, int b) {
		System.out.println(a+b);
	}
	
	///DRY DOnt repeat
	
	static void DontRep() {
		System.out.println("Start");
		System.out.println("Boil milk");
		System.out.println("Add coffee and Sugar");
		System.out.println("Serve hot");
	}
	public static void main(String[] args) {
		System.out.println("Addiction Methods O/P");
		Add(10,20);
		System.out.println(" ");
		System.out.println("DRY just use Methods");
		System.out.println(" ");
		DontRep();
		System.out.println(" ");
		DontRep();
		System.out.println(" ");
		
		
	}
}
