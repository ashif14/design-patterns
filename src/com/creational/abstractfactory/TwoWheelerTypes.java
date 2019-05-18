package com.creational.abstractfactory;

public enum TwoWheelerTypes {

	MOTOR_BIKE(MotorBike.class),
	BICYCLE(Bicycle.class);
	
	private Class<? extends TwoWheelerVehicle> clazz;
	
	TwoWheelerTypes(Class<? extends TwoWheelerVehicle> clazz) {
		this.clazz = clazz;
	}
	public Class<? extends TwoWheelerVehicle> getClazz() {
		return this.clazz;
	}
}
