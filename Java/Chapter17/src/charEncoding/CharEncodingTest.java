package charEncoding;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class CharEncodingTest {
	public static void main(String[] args) throws IOException {
//	입력하는 클래스 선언
		FileInputStream fis = null; InputStreamReader isr = null;
		BufferedReader br = null; File file = null;
//	출력하는 클래스 선언
		FileOutputStream fos = null; OutputStreamWriter osw = null; 
		BufferedOutputStream bos = null; File file2 = null;

//	입력작업진행
		file = new File("input2.txt");
		fis = new FileInputStream(file);
		isr = new InputStreamReader(fis, "UTF-8");
		br = new BufferedReader(isr);
//	출력하는 작업진행
		file2 = new File("output6.txt");
		fos = new FileOutputStream(file2);
		bos = new BufferedOutputStream(fos);

		String data = null;
		while ((data = br.readLine()) != null) {
			System.out.println(data);
			data += "\n";
			byte[] b = data.getBytes();
			bos.write(b);
		}
		System.out.println("저장했습니다.");
		if (br != null) {br.close();}
		if (bos != null)bos.close();}
}
