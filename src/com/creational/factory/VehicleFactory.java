package com.creational.factory;


/**
 * 
 * @author ashif14
 *
 */
public class VehicleFactory {
	
	private static final VehicleEnum DEFAULT_VEHICLE = VehicleEnum.TWO_WHEELER;
	
	private VehicleFactory() {};
	
	public static Vehicle getInstance() throws InstantiationException, IllegalAccessException {
		return createVehicle(DEFAULT_VEHICLE);
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
