package copyLine2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

@SuppressWarnings("unused")
public class CopyLine {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader= null; FileWriter fileWriter=null;
		FileReader fileReader=null; PrintWriter printWriter=null;
		BufferedWriter bufferedWriter=null;
		
//		 ===����Ÿ�� �о���� ��ɰ�ü����
		File file1=new File("input.txt");
		fileReader=new FileReader("output.txt");//2����Ʈ�� ����
		bufferedReader=new BufferedReader(fileReader);//1����Ʈ�� �о
//		 ===����Ÿ�� �����ϴ� ��ɰ�ü����
		fileWriter=new FileWriter("output5.txt");
		bufferedWriter=new BufferedWriter(fileWriter);
		printWriter=new PrintWriter(bufferedWriter);
		
		String data=null;
		while((data=bufferedReader.readLine())!=null) {//�߻�ȭ �޼ҵ� (�������̵�)
			printWriter.println(data);
		}
//		System.out.println("���� �Ϸ�");
	
		if(bufferedReader!=null) {bufferedReader.close();}
		if(printWriter!=null) {printWriter.close();}
	}
}