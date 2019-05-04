package programs;

import java.io.IOException;

public class NotePad {
	public static void main(String[] args) {
		try {
			Runtime.getRuntime().exec("notepad.exe");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
//output:
//After executing this program notepad file will open automatically;