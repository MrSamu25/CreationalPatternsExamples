package co.edu.javeriana;

public class HondaFactory implements VehicleFactory {

	@Override
	public Car createCard() {
		return new HondaCar();
	}

	@Override
	public Motorcycle createMotorcycle() {
		return new HondaMotorcycle();
	}

	@Override
	public Bus createBus() {
		return new HondaBus();
	}

}
