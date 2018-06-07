package collections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SampleForArrayList {

	public static void main(String[] args) {
		Hashtable<String, String> hm = new Hashtable<String, String>();

		List<Integer> list = new CopyOnWriteArrayList<Integer>();
		list.add(5);
		list.add(4);
		list.add(7);
		list.add(3);

		Iterator<Integer> it = list.iterator();

		while (it.hasNext()) {
			if (it.next() == 5) {
				list.add(6);
			}
		}
		System.out.println(list);
	}

}
