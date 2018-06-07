// Planon Enterprise Edition Source file: classA.java
// Copyright Planon 1997-2018. All Rights Reserved.
package practise;

/**
 * classA
 *
 * @version $Revision: 1.16 $
 */
public interface classA {
	// ~ Methods
	// --------------------------------------------------------------------------------------

	/**
	 * DOCUMENT ME!
	 */
	void someMethod();

	/**
	 * DOCUMENT ME!
	 *
	 * @param aI
	 *            DOCUMENT ME!
	 */
	void someMethod(int aI);

	default void defaultMethod() {
		System.out.println("Arpitha in default method");
	}

	static void staticMethod() {
		System.out.println("In static method");
	}

}
