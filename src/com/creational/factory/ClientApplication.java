package com.creational.factory;

/**
 * 
 * @author ashif14
 *
 */
public class ClientApplication {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
		VehicleFactory.getInstance(VehicleEnum.TWO_WHEELER).drive();
		VehicleFactory.getInstance(VehicleEnum.THREE_WHEELER).drive();
		VehicleFactory.getInstance(VehicleEnum.FOUR_WHEELER).drive();
		VehicleFactory.getInstance().drive();
	}
}
