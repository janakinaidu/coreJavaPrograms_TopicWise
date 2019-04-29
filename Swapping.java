package corejavaprograms;

/*
 * @author janakinaidu
 * */

public class Swapping {
	public static void main(String[] args) {
		swappingWithTwoVaribles(10, 20);
		swappingWithThreeVaribales(10, 20);
	}

	private static void swappingWithThreeVaribales(int x, int y) {
		int temp;
		temp = x;
		x = y;
		y = temp;

	}

	private static void swappingWithTwoVaribles(int x, int y) {
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("after swapping x=" + x + " y=" + y);
	}
}
