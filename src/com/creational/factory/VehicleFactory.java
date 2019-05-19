package com.creational.factory;


/**
 * 
 * @author ashif14
 *
 */
public class VehicleFactory {
	
	private VehicleFactory() {};
	
	public static Vehicle getInstance() throws InstantiationException, IllegalAccessException {
		return createVehicle(null);
	}
	public static Vehicle getInstance(VehicleEnum vehicle) throws InstantiationException, IllegalAccessException {
		return createVehicle(vehicle);
	}
	private static Vehicle createVehicle(VehicleEnum vehicle) throws InstantiationException, IllegalAccessException {
		if(vehicle == null)
			return new TwoWheelerVehicle();
		return vehicle.getClazz().newInstance();
	}
}
