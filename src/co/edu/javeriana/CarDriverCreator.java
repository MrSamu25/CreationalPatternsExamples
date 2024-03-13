package co.edu.javeriana;

public class CarDriverCreator extends DriverCreator{

	@Override
	Driver createDriver() {
		return new CarDriver();
	}
}
