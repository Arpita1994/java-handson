package oops.polymorphism.ol;

public class TestAddition {

	public static void main(String[] args) {
		Addition a = new Addition();
		int add1 = a.add(10, 20);
		System.out.println(add1);
		long add2 = Addition.add((long) 793483467, 949083477);
		System.out.println(add2);
		int add3 = a.add(1, 2, 3);
		System.out.println(add3);
		// --------------------------------------------------------------------
		Addition constructorOL1 = new Addition(10, 20);
		System.out.println(constructorOL1.x + " " + constructorOL1.y);
		// -----------------------------------------------------------------------
		Addition constructorOL2 = new Addition();
		System.out.println(constructorOL2.x + " " + constructorOL2.y);
	}

}
