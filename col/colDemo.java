package com.cg.demo.col;

import java.util.ArrayList;

public class colDemo {
	
	public static void main(String[] args) {
		ArrayList myList = new ArrayList();
		System.out.println(myList.size());
		myList.add(10);
		myList.add("Abc");
		myList.add(20.8);
		System.out.println(myList.size());
	}
}
