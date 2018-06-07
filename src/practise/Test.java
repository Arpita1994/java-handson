package practise;

public class Test {

	public static void main(String[] args) {

		Balloon red = new Balloon("Red"); // memory reference 50
		Balloon blue = new Balloon("Blue"); // memory reference 100

		System.out.println(red.hashCode() + " " + blue.hashCode());
		swap(red, blue);
		System.out.println("red color=" + red.getColor());
		System.out.println("blue color=" + blue.getColor());

		foo(blue);
		System.out.println("blue color=" + blue.getColor());

	}

	private static void foo(Balloon balloon) { // baloon=100
		balloon.setColor("Red"); // baloon=100
		balloon = new Balloon("Green"); // baloon=200
		balloon.setColor("Blue"); // baloon = 200
	}

	// Generic swap method
	public static void swap(Balloon o1, Balloon o2) {

		System.out.println(o1.hashCode() + " " + o2.hashCode());
		Object temp = o1;
		o1.color = "green";

	}
}