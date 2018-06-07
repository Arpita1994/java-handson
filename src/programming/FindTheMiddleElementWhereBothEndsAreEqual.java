package programming;

import java.util.ArrayList;
import java.util.List;

public class FindTheMiddleElementWhereBothEndsAreEqual {

	public static void main(String[] args) {

		int a[] = { 1, 3, 5, 3, 2 };
		int number = 0;
		for (int i = ((a.length - 1) / 2) + 1; i <= a.length - 1; i++) {
			number += a[i];
		}
		System.out.println(number);
		int numberleft = 0;
		for (int i = 0; i <= ((a.length) / 2) - 1; i++) {
			numberleft += a[i];
		}

		System.out.println(numberleft);

		if (number == numberleft) {
			System.out.println("Both ends are equal");
		} else {
			System.out.println("Both ends are not equal");
		}
		/*
		 * List<Integer> list = new ArrayList<Integer>();
		 * 
		 * for (Integer i : a) { list.add(i); } int n1 = 0; for (int i =
		 * (list.size() / 2); i >= 0; i--) { n1 += list.get(i);
		 * 
		 * } System.out.println(n1); }
		 */
	}
}
