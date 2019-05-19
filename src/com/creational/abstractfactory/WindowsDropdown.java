package com.creational.abstractfactory;

public class WindowsDropdown implements Dropdown{
	@Override
	public void paint() {
		System.out.println("Painting Windows Dropdown");	
	}
}
