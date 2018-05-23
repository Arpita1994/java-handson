package practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortMapByValue {

	public static void main(String[] args) {

		Map<Integer,Integer> map = new HashMap<>();
		map.put(1,1);
		map.put(2,4);
		map.put(7,6);
		map.put(8,7);
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		List<Entry<Integer, Integer>> list = new ArrayList<Entry<Integer, Integer>>(entrySet);
		Collections.sort(list,new Comparator<Map.Entry<Integer, Integer>>() {

			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				return -o2.getValue().compareTo(o1.getValue());
			}
		});
		
	
		System.out.println(list);
	
	}

}
