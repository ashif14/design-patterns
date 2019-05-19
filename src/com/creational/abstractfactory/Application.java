package com.creational.abstractfactory;

public class Application {
	public static void main(String[] args) {
		String platform = "MAC";
		
		GUIFactory factory;
		Button b;
		Dropdown d;
		
		if(platform.equals("Windows")) {
			factory = new WindowsFactory();
			b = factory.createButton();
			d = factory.createDropdown();
		} else {
			factory = new MacOSFactory();
			b = factory.createButton();
			d = factory.createDropdown();
		}
		
		b.paint();
		d.paint();
	}
}
