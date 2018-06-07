package multithreading;

public class ThreadSampleUsingRunnable implements Runnable {
	public static void main(String[] args) {
		Thread thread1 = new Thread(new ThreadSampleUsingRunnable());
		thread1.start();

		Thread thread2 = new Thread(new ThreadSampleUsingRunnable());
		thread2.start();
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		synchronized (this) {

			for (int i = 0; i < 10; i++) {
				System.out.println(name + " " + i);
			}
		}
	}
}
