package a17_07Data;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Data {

	public static void main(String[] args) throws IOException {
		BufferedReader inputStream = null;
		PrintWriter outputStream = null;
		ArrayList aList = new ArrayList();
		int num;
		try {

			inputStream = new BufferedReader(new FileReader("datain.txt"));
			outputStream = new PrintWriter(new FileWriter("dataout.txt"));

			String l;
			int i;
			double double_a;
			while ((l = inputStream.readLine()) != null) {
				try {

					System.out.println(l + "");
					i = Integer.parseInt(l);
					aList.add(i);

				} catch (NumberFormatException e) {}
			}
			Collections.sort(aList);

			System.out.print("총 입력한 문자는 : ");
			for (Object a : aList)
				System.out.print(" " + a);
			System.out.println();

		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지않습니다");
		} finally {
			if (inputStream != null) {
				inputStream.close();
			}
			if (outputStream != null)
				outputStream.close();
		}
	}
}
