package com.cg.demo.excepDemo;

class MyException extends Exception{
	public MyException(String S) {
		super(S);
	}
}

public class UserDefExcep {
	
	public static void main(String[] args) {
		try{
			throw new MyException("Sanket");
		}
		catch(MyException me){
			System.out.println("Exception caught");
			
			System.out.println(me.getMessage());
		}
	}
}
