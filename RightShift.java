package com.naidu.saskenquestions;

public class RightShift {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		rotateRight(arr, 2, arr.length);
		printRightShift(arr, arr.length);
	}

	private static void printRightShift(int arr[], int length) {
		for (int i = 0; i < length; i++) {
			System.out.print(arr[i] + "");
		}

	}

	private static void rotateRight(int[] arr, int d, int length) {

		for (int j = 0; j < d; j++) {
			rotateRightShift(arr, length);
		}
	}

	private static void rotateRightShift(int[] arr, int length) {
		int i, temp;
		temp = arr[length - 1];
		for (i = length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[i] = temp;
	}

}
