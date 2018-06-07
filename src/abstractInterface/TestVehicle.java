package abstractInterface;

public class TestVehicle {

	public static void main(String[] args) {

		BikeDTO bikeDTO = new BikeDTO();
		bikeDTO.setNumberOfWheels(2);
		bikeDTO.setChasisNumber("A1255");
		bikeDTO.setBreakEnabled(true);

		Bike bike = new Bike(bikeDTO);
		int numberOfWheels = bike.getNumberOfWheels();
		System.out.println("Number of wheels " + numberOfWheels);

		// ---------------------------------------------------------------

		CarDTO car = new CarDTO();
		car.setNumberOfAirBags(2);

		BMWCar bmw = new BMWCar(car);
		int numberOfAirBags = bmw.getNumberOfAirBags();
		System.out.println("Number of Air bags in BMW " + numberOfAirBags);

		// ---------------------------------------------------------------------
		bikeDTO.setSpeed(100);
		bike.applyBreak(bikeDTO.getSpeed());
		// --------------------------------------------------------------------------

		Vehicle vehicle = new BMWCar(car);
		System.out.println(vehicle.isAutoTransmission());

		// ------------------------------------------------------------------
		Vehicle vehicle1 = new BenzCar(car);
		System.out.println(vehicle1.isAutoTransmission());

		// --------------------------------------------------------------
		Car vehicleBMW = new BMWCar(car);
		System.out.println(vehicleBMW.isCrucibleEnabled());

		// --------------------------------------------------------------
		Car vehicleBenz = new BenzCar(car);
		System.out.println(vehicleBenz.isCrucibleEnabled());

	}

}
