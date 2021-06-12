package com.cg.demo.StrLab;

import java.util.Scanner;

public class Lab2 {
	public  void getImage (String str) {
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println(str+"|"+sb);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String str = sc.next();
		Lab2 lb = new Lab2();
		lb.getImage(str);
	}
}
