package programs;
/*
 * @author janakinaidu
 * */
public class JavaJ2ee {
	public static void main(String[] args) {
		String str = "JANAKINAIDU";
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(ch[j] + " ");
			}
			System.out.println();
		}
	}

}
//output
/*
J 
J A 
J A N 
J A N A 
J A N A K 
J A N A K I 
J A N A K I N 
J A N A K I N A 
J A N A K I N A I 
J A N A K I N A I D 
J A N A K I N A I D U */

