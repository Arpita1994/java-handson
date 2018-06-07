package exceptionhandling;

public class SampleForTryCatch {

	public static void main(String[] args) {
		try
		{
			int a = 10;
		int b = 0;
		System.out.println(a/0);
		}
catch(ArithmeticException e)
		{
	e.getMessage();
		}
	}

}
