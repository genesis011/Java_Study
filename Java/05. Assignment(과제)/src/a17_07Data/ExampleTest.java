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
//		파일을 읽어온다
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
//			문자열을 숫자로 바꾸기
			al.add(Integer.parseInt(data));
		}
		Iterator<Integer>iterator=al.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("=====정렬됨=====");
		Collections.sort(al);
		Collections.reverse(al);//오름차순
		for(Integer integer:al) {
			System.out.println(integer);
		}
//		파일에 저장하는 기능 구현
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
