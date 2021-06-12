package com.cg.demo.encap;

interface centralGovt{
	public void paySalary();
}

interface stateGovt{
	public void giveLoan();
}
abstract class RBI{
	public abstract void doKyc();
	public void createAccount() {
		System.out.println("Create Account");
	}
}

class HDFC extends RBI implements centralGovt , stateGovt{
	
	 public void doKyc() {
		System.out.println("Aadhaar Card");
	}
	 
	 public void paySalary() {
		 System.out.println("Pay Salary");
	 }
	 
	 public void giveLoan() {
		 System.out.println("Give Loan..");
	 }
}

public class BankingDemo {
	public static void main(String[] args) {
		HDFC hdfc = new HDFC();
		hdfc.createAccount();
		hdfc.doKyc();
		hdfc.paySalary();
		hdfc.giveLoan();
	}
}
