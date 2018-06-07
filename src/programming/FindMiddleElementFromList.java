package programming;

import java.util.List;
import java.util.ArrayList;

public class FindMiddleElementFromList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(5);
		list.add(8);
		list.add(17);
		list.add(9);

		int i = list.size() / 2;
		System.out.println(list.get(i));

		/*
		 * for (int i = 0; i <= list.size() / 2; i++) {
		 * System.out.println(list.get(i)); if (i == list.size() / 2) {
		 * System.out.println(list.get(i)); }
		 * 
		 * }
		 */
		// ---------------------------------------------------------------------------------
	}

}
