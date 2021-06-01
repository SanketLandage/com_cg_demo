package com.cg.demo;

public class App2 {
	public static void main(String[] args) {
		
		int salary=12;
		int expectedSalary = 10;
		int leaves = 10;
		int expectedLeaves =15;
		
		if(salary > expectedSalary && leaves > expectedLeaves) {
			System.out.println("Join the compony");
		}else {
			System.out.println("Do Not join the company");
		}
		
		if(salary > expectedSalary || leaves > expectedLeaves) {
			System.out.println("Join the compony");
		}else {
			System.out.println("Do Not join the company");
		}
		
		
	}
}
