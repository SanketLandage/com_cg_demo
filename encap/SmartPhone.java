package com.cg.demo.encap;

public class SmartPhone extends FeaturePhone {
	public void camera() {
		System.out.println("Click Snaps...");
	}
	
	@Override
	public void playMusic() {
		System.out.println("Play some loud Music");
	}

}
