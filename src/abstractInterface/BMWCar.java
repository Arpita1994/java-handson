package abstractInterface;

public class BMWCar extends Car {

	BMWCar(CarDTO aCarDto) {
		super(aCarDto);
	}

	@Override
	public int getNumberOfAirBags() {
		return carDto.getNumberOfAirBags() + 2;
	}

	@Override
	public boolean isAutoTransmission() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCrucibleEnabled() {
		return true;
	}
}
