package co.edu.javeriana;

public class Main {

	public static void main(String[] args) {

		DriverCreator driverCreator = new CarDriverCreator();
		System.out.println(driverCreator.createDriver().toDrive());
	}

}
