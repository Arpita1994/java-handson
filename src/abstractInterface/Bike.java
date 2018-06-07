package abstractInterface;

public class Bike implements Vehicle {
	BikeDTO bikeDTO;

	Bike(BikeDTO aBikeDTO) {
		this.bikeDTO = aBikeDTO;
	}

	@Override
	public int getNumberOfWheels() {
		return bikeDTO.getNumberOfWheels();
	}

	@Override
	public boolean isBreakEnabled() {
		return bikeDTO.isBreakEnabled();
	}

	@Override
	public String getChasisNumber() {
		return bikeDTO.getChasisNumber();
	}

	public void applyBreak(int aSpeed) {
		if (bikeDTO.getSpeed() <= 50) {
			System.out.println(controlSpeed("BACKBREAK"));
		} else {
			System.out.println(controlSpeed("FRONTBREAK", "BACKBREAK"));
		}
	}

	public String controlSpeed(String aBackBreak) {
		return aBackBreak + " applied";

	}

	public String controlSpeed(String aFrontBreak, String aBackBreak) {
		return aFrontBreak + " and " + aBackBreak + " Applied";
	}

}
