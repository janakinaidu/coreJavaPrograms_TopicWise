package com.naidu.examples;

public class PermutationExample {

	public static void main(String[] args) {
		String str = "abb";
		printPermutations(str, "");
	}

	static void printPermutations(String str, String ans) {

		if (str.length() == 0) {
			System.out.println(ans + " ");
			return;
		}
		
		// Make a boolean array of size '26' which 
        // stores false by default and make true  
        // at the position which alphabet is being 
        // used 
		boolean alpha[] = new boolean[26]; 
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			String ros = str.substring(0, i) + str.substring(i + 1);

			// Recursove call;
//			printPermutations(ros, ans + ch);
			
			// If the character has not been used  
            // then recursive call will take place.  
            // Otherwise, there will be no recursive 
            // call 
			 if (alpha[ch - 'a'] == false) 
				 printPermutations(ros, ans + ch); 
	            alpha[ch - 'a'] = true; 
		}
	}

}
