package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class SampleHashSet {

	public static void main(String[] args) {

		double d = 129.00;
		long l = (new Double(d)).longValue();

		String str = "GeeksforGeeks";
		System.out.println("The size of the String is " + str.length());

		Set<String> hs = new HashSet<>();
		hs.add("first");
		hs.add("second");
		hs.add("third");

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 1);
		map.put(4, 3);
		map.put(3, 4);
		map.put(2, 6);
		map.put(5, 8);
		System.out.println(map);

		Map map1 = new HashMap();

	}

}
