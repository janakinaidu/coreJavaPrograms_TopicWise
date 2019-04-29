package programs;

import java.util.Scanner;

public class FancyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String mobilenumber = sc.next();
		String str = String.valueOf(mobilenumber);
		if (isFancy(str)) {
			System.out.println("The given number is Fancy Number");
		} else {
			System.out.println("The given number is not a fancy number");
		}
		sc.close();
	}

	private static boolean isFancy(String str) {
		if (condition1(str) || condition2(str) || condition3(str)) {
			return true;
		}
		return false;
	}
	

	/*Condition1:
	 * A single number occurs three consecutive times. Like 777.
	 * 
	 * Condition2:
	 *  Three consecutive digits are either in increasing or decreasing fashion. Like
	 * 456 or 987.
	 * 
	 * Condition3:
	 *  A single digit occurs four or more times in the number. Like
	 * 9859009976 – here the digit 9 occurs 4 times.
	 */
	
	//777 //888
	private static boolean condition1(String str) {
		System.out.println("in_condition1");
		for (int i = 0; i < str.length() - 2; i++) {
			if (str.charAt(i) == str.charAt(i + 1) &&
					str.charAt(i + 1) == str.charAt(i + 2)) {
				return true;
			}
		}
		return false;
	}

	//456  //987
	private static boolean condition2(String str) {
		System.out.println("in_condition2");
		for (int i = 0; i < str.length()-2; i++) {
			if((str.charAt(i)<str.charAt(i+1) && str.charAt(i+1)<str.charAt(i+2)) ||
					(str.charAt(i)>str.charAt(i+1) && str.charAt(i+1)>str.charAt(i+2))){
				return true;
			}
		}
		return false;
	}
	
	//998888522546
	private static boolean condition3(String str) {
		System.out.println("in_condition3");
		int a[] = new int[10];
		for (int i = 0; i < str.length(); i++) {
			// a[str.charAt(i)-'0']++; // 57-48=9 ASCII codes of 9 and 0; a[9] index position get incremented;
			a[Character.getNumericValue(str.charAt(i))]++;
			
		}
		for (int i = 0; i < str.length(); i++) {
			if(a[i]>=4){
				return true;
			}
		}
		return false;
	}

}
