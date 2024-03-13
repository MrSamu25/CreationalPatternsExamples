package co.edu.javeriana;

public class VolvoFactory implements VehicleFactory {

	@Override
	public Car createCard() {
		return new VolvoCar();
	}

	@Override
	public Motorcycle createMotorcycle() {
		return new VolvoMotorcycle();
	}

	@Override
	public Bus createBus() {
		return new VolvoBus();
	}

}
