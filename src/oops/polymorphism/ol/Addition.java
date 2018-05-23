package oops.polymorphism.ol;

public class Addition {
	public int x;
	public int y;

	public Addition() {

	}

	public Addition(int a, int b) {
		this.x = a;
		this.y = b;
	}

	public int add(int a, int b) {
		System.out.println("int");
		return a + b;
	}

	public static long add(long a, long b) {
		System.out.println("long");
		return a + b;
	}

	protected int add(int a, int b, int c) {
		return a + b + c;

	}

}
