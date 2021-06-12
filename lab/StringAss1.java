package com.cg.demo.lab;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringAss1 {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the line of integers with spcace in between");
		int n = sc.nextInt();
		StringBuffer sb = new StringBuffer(String.valueOf(n));
		String x = sb.toString();
		StringTokenizer st = new StringTokenizer(x, " ");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
	
}