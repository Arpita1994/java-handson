package practise;

public class duplicateNumbers {

	public static void main(String[] args) {
		int a[]={1,15,15,17,18,5,5,1};
		for (int i = 0; i < a.length; i++) {
	        for(int j=i+1;j<a.length;j++)
	        {
	        	if(a[i]==a[j])
	        	{
	        		System.out.println("duplicate number is "+a[i]);
	        	}
	        }
		}
	        }
	}


