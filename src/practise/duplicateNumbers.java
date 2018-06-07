package practise;

import java.util.HashMap;

public class duplicateNumbers {

	public static void main(String[] args) {
		int a[] = { 1, 15, 15, 17, 18, 5, 5, 1 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					// System.out.println("duplicate number is " + a[i]);
				}
			}
		}

		// ----------------------------------------------------------------

		int a1[] = { 1, 15, 15, 17, 18, 5, 5, 1 };

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (Integer i : a1) {
			if (map.containsKey(map.get(i))) {
				map.put(i, map.get(i) + 1);
				System.out.println("Duplicate number" + i);
			} else {
				map.put(i, i);
			}
		}
	}

}
