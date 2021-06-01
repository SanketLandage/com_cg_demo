package com.cg.demo;

import java.util.Scanner;

public class Excercise8 {
	static void checkNumber(int n) {
		if(n%2 == 0) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter an interger - ");
		int num = sc.nextInt();
		checkNumber(num);
	}
}
