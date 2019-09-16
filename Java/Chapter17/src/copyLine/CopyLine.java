package copyLine;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.imageio.stream.FileImageInputStream;

@SuppressWarnings("unused")
public class CopyLine {

	public static void main(String[] args) throws IOException {
		FileInputStream fi= null;
		FileWriter fw=null;
		InputStreamReader isr=null;
		
		fi=new FileInputStream("input.txt");//1바이트로 읽어서
		isr=new InputStreamReader(fi);
		fw=new FileWriter("output.txt");//2바이트로 저장

		
		int data=0;
		while((data=isr.read())!=-1) {//추상화 메소드 (오버라이드)
			fw.write(data);
		}
		System.out.println("복사 완료");

		if(fi!=null) {
			fi.close();
		}
		if(fw!=null) {
			fw.close();
		}
	}
}