package multithreading;

class ThreadB extends Thread {
	int total;

	@Override
	public void run() {
		synchronized (this) {
			for (int i = 0; i < 10000; i++) {
				total += i;
			}
			System.out.println(total);
			/* notify(); */
		}
	}
}