package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SampleUsingIterator {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Banana");
		List<String> asList = Arrays.asList("Apple", "Banana");
		Iterator<String> it = asList.iterator();

		while (it.hasNext()) {
			if (it.next().equals("Apple")) {
				it.remove();
			}
			System.out.println(it.next());
		}
	}

}
