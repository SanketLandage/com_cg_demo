package com.cg.demo;

import java.util.Scanner;

public class Array2D {
	
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the size of row1");
		int row = Sc.nextInt();
		System.out.println("Enter the size of col1");
		int col = Sc.nextInt();
		
		int[][] arr = new int[row][col];
		
		for(int i=0 ; i < row ; i++) {
			for(int j = 0 ; j < col ; j++) {
				System.out.println("Enter elements  ");
				arr[i][j] = Sc.nextInt();
			}
		}
		
//		for(int i=0 ; i < row ; i++) {
//			
//			for(int j = 0 ; j < col ; j++) {
//				System.out.print(" ");
//				System.out.print(arr[i][j]);
//			}
//			System.out.println("");
//		}
		
		System.out.println("Enter the size of row2");
		int row2 = Sc.nextInt();
		System.out.println("Enter the size of col2");
		int col2 = Sc.nextInt();
		int[][] arr2 = new int[row2][col2];
		
		for(int i=0 ; i < row2 ; i++) {
			for(int j = 0 ; j < col2 ; j++) {
				System.out.println("Enter elements  ");
				arr2[i][j] = Sc.nextInt();
			}
		}
		
//		for(int i=0 ; i < row2 ; i++) {
//			
//			for(int j = 0 ; j < col2 ; j++) {
//				System.out.print(" ");
//				System.out.print(arr2[i][j]);
//			}
//			System.out.println("");
//		}
		
		int[][] arr3 = new int[row][col];
		
		for(int i=0 ; i < row ; i++) {
			for(int j = 0 ; j < col ; j++) {
				arr3[i][j] = arr[i][j] + arr2[i][j];
				System.out.print(" ");
				System.out.print(arr3[i][j]);
			}
			System.out.println("");
		}
	}
}
