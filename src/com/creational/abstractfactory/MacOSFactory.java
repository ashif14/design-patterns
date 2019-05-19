package com.creational.abstractfactory;

public class MacOSFactory extends GUIFactory{
	@Override
	public Button createButton() {
		return new MacOSButton();
	}
	@Override
	public Dropdown createDropdown() {
		return new MacOSDropdown();
	}
}
