package abstractInterface;

public class VehicleDTO {
	private int numberOfWheels;
	private boolean isBreakEnabled;
	private String chasisNumber;

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public boolean isBreakEnabled() {
		return isBreakEnabled;
	}

	public void setBreakEnabled(boolean isBreakEnabled) {
		this.isBreakEnabled = isBreakEnabled;
	}

	public String getChasisNumber() {
		return chasisNumber;
	}

	public void setChasisNumber(String chasisNumber) {
		this.chasisNumber = chasisNumber;
	}

}
