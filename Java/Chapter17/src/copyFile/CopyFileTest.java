package copyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.stream.FileImageInputStream;

@SuppressWarnings("unused")
public class CopyFileTest {

	public static void main(String[] args) throws IOException {
		FileInputStream fi= null;
		FileOutputStream fo=null;
		
		fi=new FileInputStream("input.txt");
		fi=new FileInputStream("cat.jpg");
		fo=new FileOutputStream("output.txt");
		fo=new FileOutputStream("output.jpg");
		
		int data=0;
		while((data=fi.read())!=-1) {//�߻�ȭ �޼ҵ� (�������̵�)
			fo.write(data);
		}
		if(fi!=null) {
			fi.close();
		}
		if(fo!=null) {
			fo.close();
		}
	}
}
