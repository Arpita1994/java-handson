package programming;

public class SwapWithOutTemp {

	public static void main(String[] args) {

		int a = 6;
		int b = 8;

		Swap(a, b);
	}

	private static void Swap(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a + " " + b);
	}

}
