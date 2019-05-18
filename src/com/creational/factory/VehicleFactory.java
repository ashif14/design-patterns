package com.creational.factory;

public class VehicleFactory {
	
	public enum VehicleEnum {
		TWO_WHEELER(TwoWheelerVehicle.class),
		THREE_WHEELER(ThreeWheelerVehicle.class),
		FOUR_WHEELER(FourWheelerVehicle.class);
		
		
		private Class<? extends Vehicle> clazz;
		
		VehicleEnum(Class<? extends Vehicle> clazz) {
			this.clazz = clazz;
		}
		public Class<? extends Vehicle> getClazz() {
			return this.clazz;
		}
		
	};
	
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
