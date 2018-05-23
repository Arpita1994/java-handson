package oops.polymorphism.or;

public abstract class Vehicle {
	public void getVehicleNumber() {
		System.out.println("Undefined");
	}

	protected abstract int getNoOfTyres();

	public abstract String getFuelType();
}
