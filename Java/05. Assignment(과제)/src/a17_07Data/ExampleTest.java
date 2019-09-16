package a17_07Data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ExampleTest {

	public static void main(String[] args) throws IOException {
//		������ �о�´�
		ArrayList<Integer> al = new ArrayList<Integer>();
		File file = null;
		FileReader fr = null;
		BufferedReader br = null;
		file = new File("input.txt");
		fr = new FileReader(file);
		br = new BufferedReader(fr);
		String data = null;
		while ((data = br.readLine()) != null) {
			System.out.println(data);
//			���ڿ��� ���ڷ� �ٲٱ�
			al.add(Integer.parseInt(data));
		}
		Iterator<Integer>iterator=al.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("=====���ĵ�=====");
		Collections.sort(al);
		Collections.reverse(al);//��������
		for(Integer integer:al) {
			System.out.println(integer);
		}
//		���Ͽ� �����ϴ� ��� ����
		File file2=null; FileOutputStream fos=null; PrintWriter pw=null;
		file2=new File("output.txt");
		fos=new FileOutputStream(file2);
		pw=new PrintWriter(fos);
		
		for(Integer integer:al) {
			pw.print(integer);
			pw.println();
		}
		
		if (br != null) {br.close();}
		if (pw != null) {pw.close();}
	}
}
