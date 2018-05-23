package oops;


 
public class MainClass
{
	int a;
	int b ;
    public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public static void main(String[] args)
    {
    	
    	MainClass m = new MainClass();
    	m.setA(10);
    	m.setB(30);
    	m.someMethod(m);
    	System.out.println("Iam in main method"+m.getA() + +m.getB());
    }

	private void someMethod(MainClass m) {
		m.setA(40);
		m.setB(50);
		System.out.println("Iam in main method"+m.getA() + +m.getB());
	}

	
}