package programs;

public class FactorialOfaNumber {
	public static void main(String[] args) {
		long result = getFactorialOfaNumber(5);
		System.out.println("Factorial of a given number is :" + result);
	}

	static int result = 1;

	private static long getFactorialOfaNumber(int n) {
		for (int i = 1; i <= n; i++) {
			result = result * i;
		}
		return result;
	}

}

//output:
//Factorial of a given number is :120