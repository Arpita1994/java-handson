package practise;

import java.util.Arrays;
import java.util.Comparator;


public class SortArrayUsingCompartor {
  
	public static void main(String[] args)
	{
		String a1 ="Arpitha";
	String valueOf = String.valueOf(a1);
	System.out.println(valueOf);
	
		Integer a[] = {1,4,6,2,3};
	
	Arrays.sort(a, new Comparator<Integer>(){

		@Override
		public int compare(Integer arg0, Integer arg1) {
			
				return arg0.compareTo(arg1);
			
		}
		
	});
	for(Integer i : a)
	{
		System.out.println(i);
	}
}
}