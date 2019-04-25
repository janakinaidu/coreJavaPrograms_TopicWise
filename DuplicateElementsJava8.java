package arrayExamples;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElementsJava8 {

	public static void main(String[] args) {
		
		Set<Integer> uniqueElements = new HashSet<Integer>();
		int[] inputArray = { 1, 2, 3, 4, 5, 4, 3, 3, 2 };
		
		Set<Integer> duplicateElements = Arrays.stream(inputArray)
										.filter(i -> !uniqueElements.add(i)).boxed()
										.collect(Collectors.toSet());
		System.out.println("DuplicateElements are:"+duplicateElements);

	}

}
