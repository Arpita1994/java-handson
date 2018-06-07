package programming;

public class FindMinAndMaxNumberInArray {

	public static void main(String[] args) {
		int a[] = new int[] { 1, 7, 9, 8, 5 };

		int min = a[0];
		int max = a[0];
		int max1 = max;
		for (int i = 1; i < a.length; i++) {

			if (a[i] > max) {
				max = a[i];
			}
			if (max > a[i]) {
				max1 = max;
			}
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println(min + " " + max + " " + max1);
	}

}
