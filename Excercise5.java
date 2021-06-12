package com.cg.demo;

import java.util.Scanner;

public class Excercise5 {
	
	static int calculateSum(int n) {
		int sum = 0;
		for(int i=0 ; i<=n ; i++) {
			if( ( i % 3 ) == 0 || ( i % 5 ) ==0) {
				sum = sum + i;
			}
		}

		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter an interger - ");
		int num = sc.nextInt();
		System.out.println(calculateSum(num)); 
	}
}
