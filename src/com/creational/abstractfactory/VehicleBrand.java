package com.creational.abstractfactory;

public enum VehicleBrand {
	HERO("Hero"),
	HONDA("Honda"),
	HYUNDAI("Hyundai"),
	MARUTI("Maruti Suzuki"),
	VOLSWAGON("Volswagon");
	
	private String brandName;
	
	VehicleBrand(String brandName) {
		this.brandName = brandName;
	}
	public String getBrandName() {
		return this.brandName;
	}
	
}
