package com.creational.factory;

public class ClientApplication {
	public static void main(String[] args) {
		VehicleFactory vehicleFactory = VehicleFactory.getInstance();
		
		vehicleFactory.getVehicle(VehicleFactory.VehicleEnum.TWO_WHEELER).drive();
		vehicleFactory.getVehicle(VehicleFactory.VehicleEnum.THREE_WHEELER).drive();
		vehicleFactory.getVehicle(VehicleFactory.VehicleEnum.FOUR_WHEELER).drive();
	}
}
