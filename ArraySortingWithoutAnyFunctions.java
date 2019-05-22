import java.util.Arrays;

/*
 * @author janakinaidu
 * */
public class ArraySortingWithoutAnyFunctions {

	public static void main(String[] args) {
		arraySortingWithoutAnyPredefinedFunctions();
		System.out.println("========Method-2=============");
		arraySortingWithAnyPredefinedFunctions();
	}

	private static void arraySortingWithAnyPredefinedFunctions() {
		int arr[] = { 2, 3, 4, 7, 1 };
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	private static void arraySortingWithoutAnyPredefinedFunctions() {
		int arr[] = { 2, 3, 4, 7, 1 };

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length - i - 1; j++) {

				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];  // [2, 3, 4, 1, 1]  first step;
					arr[j] = arr[j + 1]; // [2, 3, 4, 1, 7]  first step;
					arr[j + 1] = temp;
				}

			}
		}

//		System.out.println(arr[0]);
		// test the updated array;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		// output: 1 2 3 4 7
	}
}
//2nd step:
// [2, 3, 1 1, 7]  first step;
// [2, 3, 1, 4, 7]  first step;
