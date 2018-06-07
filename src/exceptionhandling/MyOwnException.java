package exceptionhandling;

public class MyOwnException extends Exception {

	public MyOwnException()
	{
		super();
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Divide by zero error";
	}
}
