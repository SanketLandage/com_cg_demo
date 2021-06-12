package com.cg.demo.col;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmpDemo {
	public static void main(String[] args) {
		Employee emp = new Employee(101,"Sanket" , 20.5);
		
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(emp);
		empList.add(new Employee());
		empList.add(new Employee(102,"San" , 25.5));
		
		System.out.println("Iterate using for loop");

		for (int i = 0; i < empList.size(); i++) {
			System.out.println(empList.get(i).toString());
		}

		System.out.println("Iterate using for each loop");

		for (Employee e : empList) {
			System.out.println(e.toString());
		}

		System.out.println("Iterate using Iterator");

		Iterator<Employee> iterator = empList.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}

		// empList.add("Aaa"); // CE
//		empList.add(delete); // CE

//		Stack stack = new Stack();		
//		Vector vector = new Vector(3, 3);
//		System.out.println(stack.size());
//		System.out.println(stack.capacity());


	}
}
