package practise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CountNumbersFromArray {
public static void main(String[] args)
{
int a[]={1,15,15,17,18,5,1};
    
    for (int i = 0; i < a.length; i++) {
        int count=0;
        for(int j=0;j<a.length;j++)
        {
            if(a[i]==a[j])
            {
                System.out.println("count  "+ a[i]+" is "+ ++count);
            }
        }
    }

int[] a1={1,15,15,17,18,5,1};
Map <Integer, Integer> map = new HashMap<Integer, Integer>();
for (int i :a1) {
	if(map.containsKey(i))
	{
		map.put(i, map.get(i)+1);
	}
	else
	{
		map.put(i,1);
	}
}
for(int j: map.keySet())
{
	System.out.println(j+" "+map.get(j));
}

}
}
