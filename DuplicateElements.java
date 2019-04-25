package arrayExamples;

public class DuplicateElements {

	public static void main(String[] args) {
		
		int[] inputArray = { 1, 2, 3, 2, 3, 4, 5 };
		for (int i = 0; i < inputArray.length; i++) {
			for (int j = i+1; j < inputArray.length; j++) {
				if(inputArray[i]==inputArray[j]){
					System.out.println("Duplicate Elements are:"+inputArray[i]);
				}
			}
		}
	}
	
	//Above code is not having any predefined methods/classes

}
