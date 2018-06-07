package programming;

public class ReverseANumber {

	public static void main(String[] args) {

		ReverseANumber rev = new ReverseANumber();

		int n = 1234;

		rev.reverseNumber(n);

		int temp = 0;
		int r = 0;
		while (n > 0) {
			r = n % 10;
			temp = (temp * 10) + r;
			n = n / 10;
		}
		System.out.println(temp);
	}

	private void reverseNumber(int n) {
		if (n < 10) {
			System.out.println(n);
			return;
		} else {
			System.out.print(n % 10);
			// Method is calling itself: recursion
			reverseNumber(n / 10);
		}
	}

}
