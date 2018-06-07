package multithreading;

public class ThreadA {

	public static void main(String[] args) {
		int total = 0;
		ThreadB b = new ThreadB();
		b.start();

		synchronized (b) {
			/* try { */
			System.out.println("Waiting for b to complete...");
			// b.wait();
			for (int i = 0; i < 10; i++) {
				total += i;
			}
			System.out.println(total);
			/*
			 * //} /*catch (InterruptedException e) { e.printStackTrace(); }
			 */

			System.out.println("Total is: " + b.total);
		}
		System.out.println("Not in synchronized block " + b.total);
	}
}