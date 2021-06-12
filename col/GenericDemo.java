package com.cg.demo.col;

import java.util.ArrayList;
import java.util.List;

class Delete{
	
}
public class GenericDemo {
	public static void main(String[] args) {
		///Generics do not allows to add data other than mentioned type
		List<Integer> markList = new ArrayList<>();
		Delete delete = new Delete();
		
	//	markList.add("abc");
		markList.add(10);
		markList.add(20);
	}
}
