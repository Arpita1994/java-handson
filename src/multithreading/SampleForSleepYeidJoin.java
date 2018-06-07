package multithreading;

public class SampleForSleepYeidJoin implements Runnable {

	public static void main(String[] args) {
		Thread th1 = new Thread(new SampleForSleepYeidJoin());
		th1.start();
		try {
			th1.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Thread th2 = new Thread(new SampleForSleepYeidJoin());
		th2.start();

	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}

	}

}
