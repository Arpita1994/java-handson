package oops;

public class TestHashCodeEquals {

	
	public static void main(String[] args)
	{
		Integer a = new Integer(10);
		Integer b =new Integer(10);
		System.out.println(a==b);
		System.out.println(a.equals(b));
		System.out.println(a.hashCode()+" "+ b.hashCode());
	}
}
