package practise;

import java.util.HashMap;
import java.util.Map;

public class ReverseOfStringExample {
	public static void main(String[] args) {
		/*
		 * String s = "Arpitha"; char[] charArray = s.toCharArray(); String
		 * reverse; reverse = reverse(s);
		 */
		// System.out.println(reverse);
		/*
		 * char[] charArray = s.toCharArray(); for(int i =charArray.length-1;
		 * i>=0;i--) { char c = charArray[i]; System.out.println(c); }
		 */
		ClassX a = new ClassX();

		Map<ClassX, String> map = new HashMap<>();
		map.put(a, "a");
		map.put(a, "4");
		System.out.println(map);

	}

	/*
	 * private static String reverse(String s) {
	 * 
	 * return reverse(s.substring(0,s.length()-1));
	 * 
	 * 
	 * 
	 * }
	 */
}
