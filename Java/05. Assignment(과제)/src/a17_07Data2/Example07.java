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

public class Example07 {

	public static void main(String[] args) throws IOException {
		ArrayList<Integer> al = new ArrayList<Integer>();
//		1번 파일을 읽어온다.
		File file = new File("input.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String data = null;
		while ((data = br.readLine()) != null) {
			al.add(Integer.parseInt(data));
		} // end of File
		Collections.sort(al);

//		출력선택 로직 클래스 선정
//		2번
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		Iterator<Integer> iterator = al.iterator();
		while (iterator.hasNext()) {
			pw.println(iterator.hasNext());
		}
		if (br != null) {br.close();}
		if (pw != null) {pw.close();}
		System.out.println("잘 되었습니다.");
	}
}
//어레이 리스트, 인티져 파스인트, 컬렉션 숄트