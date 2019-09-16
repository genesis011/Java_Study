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
		
		fi=new FileInputStream("input.txt");//1����Ʈ�� �о
		isr=new InputStreamReader(fi);
		fw=new FileWriter("output.txt");//2����Ʈ�� ����

		
		int data=0;
		while((data=isr.read())!=-1) {//�߻�ȭ �޼ҵ� (�������̵�)
			fw.write(data);
		}
		System.out.println("���� �Ϸ�");

		if(fi!=null) {
			fi.close();
		}
		if(fw!=null) {
			fw.close();
		}
	}
}