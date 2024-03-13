package co.edu.javeriana;

public class MotorcycleDriverCreator extends DriverCreator {

	@Override
	Driver createDriver() {
		return new MotorcycleDriver();
	}
}
