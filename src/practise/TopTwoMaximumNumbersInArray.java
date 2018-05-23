package practise;

import java.util.ArrayList;
import java.util.List;

public class TopTwoMaximumNumbersInArray {

	public static void main(String[] args) {
	
		int a[]= {5,2,6};
		List<Integer> list = new ArrayList<>();
		for(int i = 0;i<a.length-1;i++)
		{
			for(int j=i+1;i<a.length-1;i++)
			{
				if(a[i]>a[j])
				{
					list.add(a[i]);
				}
			}
		}
System.out.println(list);
		
	}

}
