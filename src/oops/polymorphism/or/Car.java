package oops.polymorphism.or;

public class Car extends Vehicle {

	@Override
	public int getNoOfTyres() {
		return 4;

	}

	@Override
	public String getFuelType() {
		return "diesel";
	}
}
