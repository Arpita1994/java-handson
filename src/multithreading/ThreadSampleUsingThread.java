package multithreading;

public class ThreadSampleUsingThread extends Thread {

	public static long time = System.currentTimeMillis();

	public static void main(String[] args) {
		Thread thread1 = new Thread(new ThreadSampleUsingThread());
		thread1.run();

		Thread thread2 = new Thread(new ThreadSampleUsingThread());
		thread2.run();

		System.out.println("completed in " + (System.currentTimeMillis() - time));
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		for (int i = 0; i < 10000; i++) {
			System.out.println(name + " " + i);
		}
		System.out.println("completed in " + (System.currentTimeMillis() - time));
	}

}
