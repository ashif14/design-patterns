package com.creational.factory;

/**
 * 
 * @author ashif14
 *
 */
public class VehicleFactory {
		
	private static VehicleFactory vehicleFactory = null;
	
	private VehicleFactory() {};
	
	public static VehicleFactory getInstance() {
		if(vehicleFactory == null)
			vehicleFactory = new VehicleFactory();
		return vehicleFactory;
	}
	public Vehicle getVehicle(VehicleEnum vehicle) {
			try {
				return vehicle.getClazz().newInstance();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
			return null;
	}
}
