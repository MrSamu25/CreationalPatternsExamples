package co.edu.javeriana;

public class Main {

	public static void main(String[] args) {

		// Factory Method
		DriverCreator driverCreator = new CarDriverCreator();
		System.out.println(driverCreator.createDriver().toDrive());
		
		driverCreator = new MotorcycleDriverCreator();
		System.out.println(driverCreator.createDriver().toDrive());
		
		driverCreator = new BusDriverCreator();
		System.out.println(driverCreator.createDriver().toDrive());
		
		
		// Abstract Factory
		VehicleFactory vehicleFactory = new VolvoFactory();
		
	}

}
