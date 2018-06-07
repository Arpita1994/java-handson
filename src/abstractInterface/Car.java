package abstractInterface;

public abstract class Car implements Vehicle {

	CarDTO carDto;

	Car(CarDTO aCarDto) {
		this.carDto = aCarDto;
	}

	@Override
	public int getNumberOfWheels() {
		return carDto.getNumberOfWheels();
	}

	@Override
	public boolean isBreakEnabled() {
		return carDto.isBreakEnabled();
	}

	@Override
	public String getChasisNumber() {
		return carDto.getChasisNumber();
	}

	public int getNumberOfAirBags() {
		return carDto.getNumberOfAirBags();
	}

	protected abstract boolean isCrucibleEnabled();
}
