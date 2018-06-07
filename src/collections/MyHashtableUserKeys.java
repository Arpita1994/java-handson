package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class MyHashtableUserKeys {

	public static void main(String a[]) {

		HashMap<Emp, String> tm1 = new HashMap<>();
		Emp e1 = new Emp(1, "a", 123);
		Emp e2 = new Emp(2, "b", 345);

		tm1.put(e1, "RAM");
		tm1.put(e2, "Laxman");

		Set<Entry<Emp, String>> entrySet = tm1.entrySet();
		System.out.println(entrySet);

		Collection<String> values = tm1.values();

		System.out.println(values);

		Hashtable<Emp, String> tm = new Hashtable<Emp, String>();
		tm.put(new Emp(134, "Ram", 3000), "RAM");
		tm.put(new Emp(235, "John", 6000), "JOHN");
		tm.put(new Emp(876, "Crish", 2000), "CRISH");
		tm.put(new Emp(512, "Tom", 2400), "TOM");
		tm.put(new Emp(512, "Tom", 2400), "TOM");
		// System.out.println("Fecthing value by creating new key:");

		Emp e = new Emp(512, "Tom", 2400);
		System.out.println(e + " ==> " + tm.get(e));
		// System.out.println(tm + "\n");
	}
}