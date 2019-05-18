package com.creational.factory;

/**
 * 
 * @author ashif14
 *
 */
public enum VehicleEnum {
	
	TWO_WHEELER(TwoWheelerVehicle.class),
	THREE_WHEELER(ThreeWheelerVehicle.class),
	FOUR_WHEELER(FourWheelerVehicle.class);
	
	
	private Class<? extends Vehicle> clazz;
	
	/*
	 * Private or default constructor is mandatory for parametrized enums
	 * @param clazz  the type of this parameter is the type of argument of enum constant
	 */
	VehicleEnum(Class<? extends Vehicle> clazz) {
		this.clazz = clazz;
	}
	/**
	 * 
	 * @return Value of enum parameter
	 */
	public Class<? extends Vehicle> getClazz() {
		return this.clazz;
	}
}
