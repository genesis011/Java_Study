package dataString;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataString {

	public static void main(String[] args) throws IOException {
//	파일을 읽어오는 클래스 정의
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		DataInputStream ds = null;
//		파일에 저장하는 클래스 정의
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		DataOutputStream dos = null;
		File file2 = null;
//		===파일에 저장하는 기능
		file2=new File("data.bin");
		fos=new FileOutputStream(file2);
		bos=new BufferedOutputStream(fos);
		dos=new DataOutputStream(bos);
		dos.writeDouble(3.14);
		dos.writeInt(100);
		dos.writeUTF("자신의 생각을 바꾸지 못하는 사람은 결코 현실을 바꿀 수 없다.");
		dos.flush();
		if(dos!=null) {dos.close();}
		System.out.println("완료하였습니다.");
//		===파일을 읽어온다.
		file2=new File("data.bin");
		fis=new FileInputStream(file2);
		bis=new BufferedInputStream(fis);
		ds =new DataInputStream(bis);
//		주의 꼭... 쓰여진 순서대로 읽어와야한다.
		System.out.println(ds.readDouble());
		System.out.println(ds.readInt());
		System.out.println(ds.readUTF());
		
		if(bis!=null) {bis.close();}
	}
}
