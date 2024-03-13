package co.edu.javeriana;

public class BusDriverCreator extends DriverCreator {

	@Override
	Driver createDriver() {
		return new BusDriver();
	}
}
