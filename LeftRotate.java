package com.naidu.saskenquestions;

public class LeftRotate {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		leftRotate(arr, 2, arr.length);
		printArray(arr, arr.length);
	}

	private static void leftRotate(int arr[], int diff, int length) {
		for (int i = 0; i < diff; i++) {
			leftRotateByOne(arr, arr.length);
		}
	}

	private static void leftRotateByOne(int[] arr, int length) {
		int i, temp = 0;
		temp = arr[0];
		for (i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[i] = temp;
	}

	public static void printArray(int arr[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
