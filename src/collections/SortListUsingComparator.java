package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListUsingComparator {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(4);
		list.add(7);
		list.add(3);
		list.add(6);

		System.out.println(list);

		Collections.reverse(list);

		System.out.println(list);

		Collections.shuffle(list);

		System.out.println(list);

		Collections.sort(list, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return -o1.compareTo(o2);
			}

		});

		System.out.println(list);
	}

}
