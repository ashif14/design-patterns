package com.creational.abstractfactory;

public class MacOSButton implements Button{
	@Override
	public void paint() {
		System.out.println("Painting MacOS Button");
	}
}
