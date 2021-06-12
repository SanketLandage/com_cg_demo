package com.cg.demo.method;

public class Employee {
	int id;
	String name;
	double salary;
	
	public Employee() {
		System.out.println("Default Contructor");
	}
	
	Employee(int id , String name){
		this.id = id;
		this.name = name;
		
		System.out.println(" two Parameterized Contructor");
	}
	
	Employee(int id , String name , double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
		System.out.println("Parameterized Contructor");
	}
	
	@Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
}
