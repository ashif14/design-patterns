package com.creational.abstractfactory;

public class ManufacturerClient {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		Vehicle vehicle = TwoWheelerFactory.getInstance().createVehicle(TwoWheelerTypes.BICYCLE);
		
		vehicle.drive();
	}
}
