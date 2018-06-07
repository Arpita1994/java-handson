package programming;

public class ReverseAStringUsingRecursion {

	public static void main(String[] args) {

		ReverseAStringUsingRecursion rec = new ReverseAStringUsingRecursion();
		// --------Normal method----------------

		String s = "Arpitha";

		String reverseStringUsingRecursion = rec.reverseStringUsingRecursion(s);
		System.out.println(reverseStringUsingRecursion);

		/*
		 * StringBuilder builder = new StringBuilder(); for (int i = s.length()
		 * - 1; i >= 0; i--) {
		 * 
		 * builder.append(s.charAt(i)); } System.out.println(builder);
		 */
	}
	// ----------------Recursion--------------------

	private String reverseStringUsingRecursion(String s) {
		String reverse = "";
		if (s.length() == 1) {
			return s;
		}
		return reverse += s.charAt(s.length() - 1) + reverseStringUsingRecursion(s.substring(0, s.length() - 1));
	}

}
