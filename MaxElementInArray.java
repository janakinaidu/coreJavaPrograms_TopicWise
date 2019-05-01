package programs;
/*
 * @author janakinaidu
 * */

public class MaxElementInArray {

	public static void main(String[] args) {
		int maxval = getMaxValue();
		System.out.println("Max element in an array is = " + maxval);
	}

	public static int getMaxValue() {
		int arr[] = { 1, 9, 8, 7, 16, 2 };
		int temp = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			if (temp < arr[i]) {
				temp = arr[i];
			}
		}
		return temp;
	}
	
	
	

}
