package abstractInterface;

public class BenzCar extends Car {

	BenzCar(CarDTO aCarDto) {
		super(aCarDto);
	}

	@Override
	public int getNumberOfAirBags() {
		return carDto.getNumberOfAirBags() + 2;
	}

	@Override
	public boolean isCrucibleEnabled() {
		return false;
	}

	public void displayBrandName() {
		System.out.println("Benz");
	}
}
