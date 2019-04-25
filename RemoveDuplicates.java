package arrayExamples;

public class RemoveDuplicates {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 20, 30, 30, 40, 50, 50 };

		int length = arr.length;
		int l = removeDuplicateElements(arr, length);
		for (int i = 0; i < l; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	private static int removeDuplicateElements(int[] arr, int length) {
		if (length == 0 || length == 1) {
			return length;
		}

		int[] temp = new int[length];
		int j = 0;
		for (int i = 0; i < length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[length - 1];

		// Changing original array
		for (int i = 0; i < j; i++) {
			arr[i] = temp[i];

		}
		return j;

	}

}
