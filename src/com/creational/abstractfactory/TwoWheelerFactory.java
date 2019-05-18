package com.creational.abstractfactory;

public class TwoWheelerFactory implements VehicleFactory {
	
	private static TwoWheelerFactory twoWheelerFactory = null;
	
	private TwoWheelerFactory() {}
	
	public static TwoWheelerFactory getInstance() {
		if(twoWheelerFactory == null)
			twoWheelerFactory = new TwoWheelerFactory();
		return twoWheelerFactory;
	}
	
	public Vehicle createVehicle(TwoWheelerTypes type) throws InstantiationException, IllegalAccessException {
		return type.getClazz().newInstance();
	}
	
}
