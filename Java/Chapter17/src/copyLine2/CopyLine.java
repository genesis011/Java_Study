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
		
//		 ===데이타를 읽어오는 기능객체선언
		File file1=new File("input.txt");
		fileReader=new FileReader("output.txt");//2바이트로 저장
		bufferedReader=new BufferedReader(fileReader);//1바이트로 읽어서
//		 ===데니타를 저장하는 기능객체선언
		fileWriter=new FileWriter("output5.txt");
		bufferedWriter=new BufferedWriter(fileWriter);
		printWriter=new PrintWriter(bufferedWriter);
		
		String data=null;
		while((data=bufferedReader.readLine())!=null) {//추상화 메소드 (오버라이드)
			printWriter.println(data);
		}
//		System.out.println("복사 완료");
	
		if(bufferedReader!=null) {bufferedReader.close();}
		if(printWriter!=null) {printWriter.close();}
	}
}