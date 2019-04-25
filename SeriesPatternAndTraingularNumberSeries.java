package com.naidu.interviewprograms;

/*
*@Author:janakinaidu
*/
public class SeriesPatternAndTraingularNumberSeries {

	public static void main(String[] args) {

		int inputArray[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,
				16, 17, 18, 19, 20 };
		// String inputArray[] = { "Apple", "Ball", "cat", "dog", "hat", "girl"};
		 printSeriesPattern(inputArray);
		 System.out.println();
		 System.out.println("===============");
		 printTrainagularSeries(5);
	}
	
	//program to print the series pattern 
	private static void printSeriesPattern(int[] arr) {
		int i, j = 1, k = 0;
		for (i = 1; i <= arr.length; i++) {
			if (k < arr.length) {
				System.out.print(arr[k] + " ");
				j = j + 1; // Increasing j by 1
				k = k + j; // Add value of j into k and update k
			} else {
				break;
			}
		}

	}

	// Program to print triangular number series till n
	private static void printTrainagularSeries(int n) {
		int i, j = 1, k = 1;
		for (i = 1; i <= n; i++) {
			System.out.print(k + " ");
			j = j + 1; // Increasing j by 1
			k = k + j; // Add value of j into k and update k
		}
	}

}
//source:
https://www.geeksforgeeks.org/program-print-triangular-number-series-till-n/
