package com.creational.factory;

/**
 * 
 * @author ashif14
 *
 */
public class ClientApplication {
	public static void main(String[] args) {
		VehicleFactory vehicleFactory = VehicleFactory.getInstance();
		
		vehicleFactory.getVehicle(VehicleEnum.TWO_WHEELER).drive();
		vehicleFactory.getVehicle(VehicleEnum.THREE_WHEELER).drive();
		vehicleFactory.getVehicle(VehicleEnum.FOUR_WHEELER).drive();
	}
}
