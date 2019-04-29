package corejavaprograms;

/*
 * @author janakinaidu
 * */
public class FibNoicSeriesAndPalindrome {

	public static void main(String[] args) {
		getFibnociSeries(10);
		isPalindrome("PUP");
	}

	private static void isPalindrome(String original) {
		String reverse = "";

		for (int i = original.length() - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}
		if (original.equals(reverse)) {
			System.out.println("given string is a palendrome");
		} else {
			System.out.println("given string is not a palendrome");
		}

	}

	private static void getFibnociSeries(int n) {
		int f1 = 0;
		int f2 = 0;
		int f3 = 1;
		for (int i = 0; i < n; i++) {
			f1 = f2;
			f2 = f3;
			f3 = f1 + f2;
			System.out.print(f1 + " ");
		}
		System.out.println();
	}

}
