package oops.polymorphism.or;

public class Bike extends Vehicle {

	@Override
	public int getNoOfTyres() {
		return 2;
	}

	@Override
	public String getFuelType() {
		return "Petrol";
	}

}
