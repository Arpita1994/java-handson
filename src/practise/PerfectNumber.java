package practise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PerfectNumber {

	// example: 6 . factors of 6 are 1,2 3. If i add them then the result will be 6. Hence it is perfect number
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
		
		List<Integer> list = new ArrayList<>();
	for(int i=1;i<=n;i++)
		{
			
			if(n%i==0)
			{
				list.add(i);
			
				
			}
		
		}

int result = 0;
for(int i=0;i<list.size()-1;i++)
{
	
	result += list.get(i); 

}
		if(result==n)
		{
			System.out.println("It is a perfect number");
		}
		else
		{
		System.out.println("It is not a perfect number");
		}
		
	}

}
