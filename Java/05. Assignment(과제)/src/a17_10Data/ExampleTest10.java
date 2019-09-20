package a17_10Data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class ExampleTest10 {

	public static void main(String[] args, boolean compare) throws IOException {
//		문자열 스트림 열기
		BufferedReader br1 = new BufferedReader(new FileReader("input.txt"));
		BufferedReader br2 = new BufferedReader(new FileReader("plain.txt"));
//		문자열 출력 버퍼스트림
		BufferedWriter bw=new BufferedWriter(new FileWriter("concat.txt"));
//		문자열로 한줄씩 읽어오거나, int로 한글자씩 읽어오거나~
		String c;
		int ch;
		
//		한 글자씩 읽기 실습
		while((ch=br1.read())!=-1) {bw.write(ch);}
//		한줄씩 읽기 실습
		while((c=br2.readLine())!=null) {bw.write(c);}
//		플러쉬로 버퍼를 비운다.
		bw.flush();
		System.out.println("합치기 완료");
	}
}