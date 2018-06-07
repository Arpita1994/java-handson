package exceptionhandling;

public class UseMyOwnException {

	public static void main(String[] args)  {
	UseMyOwnException u = new UseMyOwnException();
	try{
	u.OwnException();
	System.exit(1);
	}
	catch(MyOwnException e){
		e.getMessage();
	}
	finally{
		System.out.println("arpita");
		
	}
	System.out.println("Rama");
	}

	private void OwnException() throws MyOwnException {
	int a = 10;
	int b = 0;
	if(a<b)
	{
		throw new MyOwnException(); 
	}
	}
	}


