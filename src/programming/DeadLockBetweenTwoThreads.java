package programming;

import org.omg.Messaging.SyncScopeHelper;

public class DeadLockBetweenTwoThreads {

	public static String str1 = "Arpitha";
	public static String str2 = "Arpitha kulkarni";

	public static void main(String[] args) {

		DeadLockBetweenTwoThreads d = new DeadLockBetweenTwoThreads();
		d.th1.start();
		d.th2.start();

	}

	Thread th1 = new Thread("My Thread1") {
		@Override
		public void run() {
			while (true) {
				synchronized (str1) {
					synchronized (str2) {
						System.out.println(str1 + " " + str2);
					}
				}
			}
		}
	};
	Thread th2 = new Thread("My Thread 2 ") {
		@Override
		public void run() {
			while (true) {
				synchronized (str2) {
					synchronized (str1) {
						System.out.println(str2 + " " + str1);
					}
				}
			}
		}
	};
}
