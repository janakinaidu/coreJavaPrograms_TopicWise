// Java program to print a given number in words. The 
// program handles numbers from 0 to 9999 
package com.naidu.examples;

class Convert_to_words {
	// A function that prints
	// given number in words
	static void convert_to_words(char[] num) {
		// Get number of digits
		// in given number
		int length = num.length;

		// Base cases
		if (length == 0) {
			System.out.println("empty string");
			return;
		}
		if (length > 4) {
			System.out.println("Length more than 4 is not supported");
			return;
		}

		/*
		 * The first string is not used, it is to make array indexing simple
		 */
		String[] single_digits = new String[] { "zero", "one", "two", "three",
				"four", "five", "six", "seven", "eight", "nine" };

		/*
		 * The first string is not used, it is to make array indexing simple
		 */
		String[] two_digits = new String[] { "", "ten", "eleven", "twelve",
				"thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
				"eighteen", "nineteen" };

		/*
		 * The first two string are not used, they are to make array indexing
		 * simple
		 */
		String[] tens_multiple = new String[] { "", "", "twenty", "thirty",
				"forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

		String[] tens_power = new String[] { "hundred", "thousand" };

		/* Used for debugging purpose only */
		System.out.print(String.valueOf(num) + ": ");

		/* For single digit number */
		if (length == 1) {
			System.out.println(single_digits[num[0] - '0']);
			return;
		}

		/*
		 * Iterate while num is not '\0'
		 */
		int x = 0;
		while (x < num.length) {

			/* Code path for first 2 digits */
			if (length >= 3) {
				if (num[x] - '0' != 0) {
					System.out.print(single_digits[num[x] - '0'] + " ");
					System.out.print(tens_power[length - 3] + " ");
					// here len can be 3 or 4
				}
				--length;
			}

			/* Code path for last 2 digits */
			else {
				/*
				 * Need to explicitly handle 10-19. Sum of the two digits is
				 * used as index of "two_digits" array of strings
				 */
				if (num[x] - '0' == 1) {
					int sum = num[x] - '0' + num[x] - '0';
					System.out.println(two_digits[sum]);
					return;
				}

				/* Need to explicitely handle 20 */
				else if (num[x] - '0' == 2 && num[x + 1] - '0' == 0) {
					System.out.println("twenty");
					return;
				}

				/*
				 * Rest of the two digit numbers i.e., 21 to 99
				 */
				else {
					int i = (num[x] - '0');
					if (i > 0)
						System.out.print(tens_multiple[i] + " ");
					else
						System.out.print("");
					++x;
					if (num[x] - '0' != 0)
						System.out.println(single_digits[num[x] - '0']);
				}
			}
			++x;
		}
	}

	// Driver Code
	public static void main(String[] args) {
		convert_to_words("9923".toCharArray());
		convert_to_words("523".toCharArray());
		convert_to_words("89".toCharArray());
		convert_to_words("8".toCharArray());
		convert_to_words("8989".toCharArray());
	}
}
// This code is contributed
// by Mithun Kumar
