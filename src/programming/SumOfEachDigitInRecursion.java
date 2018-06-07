package programming;

public class SumOfEachDigitInRecursion {

	public static void main(String[] args) {
		int n = 561;

		int sumOfNumbers = sumOfNumbers(n);
		System.out.println(sumOfNumbers);
	}

	private static int sumOfNumbers(int n) {
		int temp = 0;
		int result = 0;
		if (n == 1) {
			return n;

		}
		temp += n % 10;
		sumOfNumbers(n / 10);
		return temp;
	}

}
