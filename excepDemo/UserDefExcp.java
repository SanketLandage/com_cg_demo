package com.cg.demo.excepDemo;

class InvalidAgeException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	InvalidAgeException(String S) {
		super(S);
	}
}

public class UserDefExcp {
	public static void Validate(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("Not Valid Age");
		} else {
			System.out.println("Welcome to vote ");
		}
	}

	public static void main(String[] args) {
		try {
			Validate(17);
		} catch (InvalidAgeException ex) {
			System.out.println("Exception Occured " + ex);
		}

		System.out.println("Above 18 people can start vote ");
	}

}
