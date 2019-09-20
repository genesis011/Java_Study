package a17_11Data;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Example11 {
	private static boolean compare;

	public static void main(String[] args) throws IOException {
		File file1 = new File("input.txt");
		File file2 = new File("input3.txt");
		FileInputStream fis1 = new FileInputStream(file1);
		FileInputStream fis2 = new FileInputStream(file2);
		while (true) {
			int data1 = fis1.read(); int data2 = fis2.read();
			if (data1 == -1 && data2 == -1) {
				compare = false; break;
			} else if (data1 != data2) {
				compare = false; break;}
		} // end while
		if (compare) {
			System.out.println("같다.");
		} else {
			System.out.println("다르다.");
		}
	}
}
