package exceptionhandling;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SampleForThrowsAndThrow  {

	public static void main(String[] args) {

		SampleForThrowsAndThrow s = new SampleForThrowsAndThrow();
		int sample = s.sample();
	}
	private int sample() {
			int temp = 0;
		
		int[] A = {1,2,3 };
		List<Integer> list = new ArrayList<>();
		for (int a : A) {
			list.add(a);
		}
		for (int i = 0; i < list.size(); i++) {
			if (!list.contains(i + 1) ) {
				temp= (i + 1);
				System.out.println(temp);
				break;
			}
		}
		return temp;


	}

}
