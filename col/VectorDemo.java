package com.cg.demo.col;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<Comparable> vector = new Vector<>();
		vector.add(10);
		vector.add("abc");
		vector.add(20);
		vector.add("xyz");
		System.out.println(vector);
		System.out.println(vector.size());
		System.out.println(vector.firstElement());
		System.out.println(vector.isEmpty());
		System.out.println(vector.removeAll(vector));
		System.out.println(vector);
	}
}
