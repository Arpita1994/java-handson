package practise;

import javax.management.InstanceAlreadyExistsException;

public class SingleTon {
public static SingleTon instance;

private SingleTon(){
	
}

public static SingleTon getInstance(){
	if(instance==null)
	{
	return instance= new SingleTon();
	}
	return instance;
	
}
}
