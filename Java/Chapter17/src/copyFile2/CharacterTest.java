package copyFile2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException {
		FileReader fr = null;
		FileWriter fw = null;

		try {
			new FileReader("input.txt");
			fw = new FileWriter("output2.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
		}
		int data = 0;

		try {
			while ((data = fr.read()) != -1) {
				try {
					fw.write(data);
				} catch (IOException e) {

					e.printStackTrace();
				}
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println("บนป็");

		if(fr!=null) {
			try {
				fr.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
		if(fw!=null) {
			try {
				fw.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}
}
