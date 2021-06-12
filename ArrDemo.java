package com.cg.demo;
import java.util.Scanner;

public class ArrDemo {
	
	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = Sc.nextInt();
		
		int[] arr = new int[size];
		
		for(int i=0 ; i < arr.length ; i++) {
			System.out.println("Please Enter elements of array ");
			arr[i] = Sc.nextInt();
		}
		
		for(int i=0 ; i<arr.length ; i++) {
			System.out.print(arr[i]);
		}
		
	}
}
