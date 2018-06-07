// Planon Enterprise Edition Source file: PassByValue.java
// Copyright Planon 1997-2018. All Rights Reserved.
package practise;

/**
 * PassByValue
 */
public class PassByValue {
	// ~ Methods
	// --------------------------------------------------------------------------------------

	/**
	 * DOCUMENT ME!
	 *
	 * @param args
	 *            DOCUMENT ME!
	 */
	public static void main(String[] args) {
		Integer i = new Integer(10);

		// ------------------------------------------
		Integer i1 = 10;
		System.out.println("i1" + i1.hashCode());
		// i2 creates a new object
		Integer i2 = i1 + 10;
		System.out.println("i2" + i2.hashCode());

		// -------------------------------------------

		System.out.println(i.hashCode());
		someMethod(i);
		System.out.println("i(2) " + i);
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param aI
	 *            DOCUMENT ME!
	 */
	private static void someMethod(Integer aI) {
		System.out.println(aI.hashCode());
		aI = 20;
		System.out.println("i(1) " + aI);
	}
}
