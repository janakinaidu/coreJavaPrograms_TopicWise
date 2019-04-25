package arrayExamples;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsUsingHashSet {

	public static void main(String[] args) {

		int[] inputArray = { 1, 2, 3, 4, 5, 4, 3, 3, 2 };

		findDuplicateElements(inputArray);
	}

	private static void findDuplicateElements(int[] inputArray) {
		
		Set<Integer> set = new HashSet<>();
		for(int element:inputArray){
			
			if(!set.add(element)){
				System.out.println("DuplicateElements are:"+element);
			}
			
			/*if(set.add(element)){
				
			}else{
				System.out.println();
			}*/
		}
		System.out.println("******");
		System.out.println(set);
	}

}
