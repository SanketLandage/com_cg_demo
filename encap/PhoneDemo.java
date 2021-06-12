package com.cg.demo.encap;

public class PhoneDemo {

	public static void main(String[] args) {

		System.out.println("");
		Phone phone = new Phone();
		phone.call();
		phone.Sms();

		System.out.println("");
		FeaturePhone fPhone = new FeaturePhone();
		fPhone.call();
		fPhone.Sms();
		fPhone.playMusic();

	}
}
