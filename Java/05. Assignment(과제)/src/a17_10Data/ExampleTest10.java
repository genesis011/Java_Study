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
//		���ڿ� ��Ʈ�� ����
		BufferedReader br1 = new BufferedReader(new FileReader("input.txt"));
		BufferedReader br2 = new BufferedReader(new FileReader("plain.txt"));
//		���ڿ� ��� ���۽�Ʈ��
		BufferedWriter bw=new BufferedWriter(new FileWriter("concat.txt"));
//		���ڿ��� ���پ� �о���ų�, int�� �ѱ��ھ� �о���ų�~
		String c;
		int ch;
		
//		�� ���ھ� �б� �ǽ�
		while((ch=br1.read())!=-1) {bw.write(ch);}
//		���پ� �б� �ǽ�
		while((c=br2.readLine())!=null) {bw.write(c);}
//		�÷����� ���۸� ����.
		bw.flush();
		System.out.println("��ġ�� �Ϸ�");
	}
}