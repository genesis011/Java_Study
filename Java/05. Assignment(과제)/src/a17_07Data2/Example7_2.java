package a17_07Data2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Example7_2 {

	public static void main(String[] args) throws IOException {
		ArrayList<Double> al = new ArrayList<Double>();
//		1�� ������ �о�´�.
		File file = new File("input2.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String data = null;
		while ((data = br.readLine()) != null) {
			al.add(Double.parseDouble(data));
		} // end of File
		Collections.sort(al);

//		��¼��� ���� Ŭ���� ����
//		2��
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		Iterator<Double> iterator = al.iterator();
		while (iterator.hasNext()) {
			pw.println(iterator.hasNext());
		}
		if (br != null) {br.close();}
		if (pw != null) {pw.close();}
		System.out.println("�� �Ǿ����ϴ�.");
	}
}
//��� ����Ʈ, ��Ƽ�� �Ľ���Ʈ, �÷��� ��Ʈ