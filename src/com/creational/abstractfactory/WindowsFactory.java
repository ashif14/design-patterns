package com.creational.abstractfactory;

public class WindowsFactory extends GUIFactory{
	@Override
	public Button createButton() {
		return new WindowsButton();
	}
	@Override
	public Dropdown createDropdown() {
		return new WindowsDropdown();
	}
}
