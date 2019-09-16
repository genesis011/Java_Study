package a17_05Data;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Data {

	public static void main(String[] args) throws IOException, InterruptedException {
//		파일을 읽어오는 클래스
		FileInputStream fis = null; BufferedInputStream bis = null;
		DataInputStream dis = null;
//		파일을에  저장하는 클래스 정의
		FileOutputStream fos = null; BufferedOutputStream bos = null;
		DataOutputStream dos = null; File file = null;
//		파일에 저장하는 기능
		file = new File("data.bin");
		fos = new FileOutputStream(file);
		bos = new BufferedOutputStream(fos);
		dos = new DataOutputStream(bos);
		dos.writeInt(100);
		dos.writeShort(42597);
		dos.writeLong(3537657L);
		dos.writeFloat(131334.245f);
		dos.writeDouble(1544.5645);
		if (dos != null) {dos.close();}
		file=new File("data.bin");
		fis=new FileInputStream(file);
		bis=new BufferedInputStream(fis);
		dis=new DataInputStream(bis);
		
		System.out.println(dis.readInt());
		System.out.println(dis.readShort());
		System.out.println(dis.readLong());
		System.out.println(dis.readFloat());
		System.out.println(dis.readDouble());
		
		if(bis!=null) {bis.close();}
	}
}
