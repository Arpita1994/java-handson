package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorUsingIterator {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Banana");

		Vector<String> v = new Vector<>();
		v.add("Arpitha");
		v.add("Banana");
		v.add("Mango");

		v.addAll(list);
		// v.removeAllElements();
		List<String> subList = v.subList(0, 1);
		Iterator<String> it = subList.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());
		}
	}

}
