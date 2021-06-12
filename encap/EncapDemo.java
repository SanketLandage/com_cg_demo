package com.cg.demo.encap;

public class EncapDemo {

	public static void main(String[] args) {
//		BankCustomer obj = new BankCustomer();
//		//obj.balance = 10000;
//		System.out.println(obj.checkbalance());
//		System.out.println(obj.deposit(25000));
//		System.out.println(obj.withdraw(5000));
		
		Demo demo = new Demo();
		System.out.println(demo.getNum());
		demo.setNum(10);
		System.out.println(demo.getNum());
	}
}
