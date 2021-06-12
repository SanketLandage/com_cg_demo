package com.cg.demo.encap;

public class BankCustomer {
	private double balance;
	
	double checkbalance(){
		return balance;
	}
	
	double withdraw(double amount) {
		balance -= amount;
		return balance;
	}
	
	double deposit(double amount) {
		balance += amount; 
		return balance;
	}
}

