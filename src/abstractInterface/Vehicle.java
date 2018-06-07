package abstractInterface;

public interface Vehicle {

	int getNumberOfWheels();

	boolean isBreakEnabled();

	String getChasisNumber();

	default boolean isAutoTransmission() {
		return false;
	}

}
