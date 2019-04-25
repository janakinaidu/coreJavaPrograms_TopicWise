package stringExamples;

public class DuplicateElementsInString {

	public static void main(String[] args) {
		String str = "w3schools";
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					System.out.println("Duplicate Elements are:="+str.charAt(i));
				}
			}
		}

	}

}
