package exceptionhandling;

import java.io.IOException;

public class SampleClassToUseThrow {

	public static void main(String[] args)
	{
		someMethod();
		}
	
public static int someMethod()
{
	int a=10;
	int b =0;
	try{
		
		System.out.println(a/b);
		System.out.println("Arpitha");
		return 0;
	}
	
	catch(ArithmeticException e)
	{
		e.printStackTrace();
	}
	
	finally{
		System.out.println("Finally");
	}
	
	return a+b;

}
}