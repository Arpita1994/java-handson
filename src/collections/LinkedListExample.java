package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {

		// read all elements of a linkedlist using iterator

		LinkedList<String> list = new LinkedList<String>();
		list.add("Apple");
		list.add("Banana");

		System.out.println(list.size());
		Iterator<String> it = list.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// copy or clone a linkedlist
		LinkedList<String> list1 = new LinkedList<String>();
		list.add("Apple");
		list.add("Banana");

		list1.clear();
		System.out.println("list1 " + list1);

	}

}
