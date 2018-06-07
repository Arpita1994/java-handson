package programming;

public class SampleForSingleTon {
	private static SampleForSingleTon instance;

	private SampleForSingleTon() {

	}

	public static SampleForSingleTon getInstance() {
		if (instance == null) {
			return instance = new SampleForSingleTon();
		}
		return instance;

	}
}
