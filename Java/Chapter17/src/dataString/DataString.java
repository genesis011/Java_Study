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
//	������ �о���� Ŭ���� ����
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		DataInputStream ds = null;
//		���Ͽ� �����ϴ� Ŭ���� ����
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		DataOutputStream dos = null;
		File file2 = null;
//		===���Ͽ� �����ϴ� ���
		file2=new File("data.bin");
		fos=new FileOutputStream(file2);
		bos=new BufferedOutputStream(fos);
		dos=new DataOutputStream(bos);
		dos.writeDouble(3.14);
		dos.writeInt(100);
		dos.writeUTF("�ڽ��� ������ �ٲ��� ���ϴ� ����� ���� ������ �ٲ� �� ����.");
		dos.flush();
		if(dos!=null) {dos.close();}
		System.out.println("�Ϸ��Ͽ����ϴ�.");
//		===������ �о�´�.
		file2=new File("data.bin");
		fis=new FileInputStream(file2);
		bis=new BufferedInputStream(fis);
		ds =new DataInputStream(bis);
//		���� ��... ������ ������� �о�;��Ѵ�.
		System.out.println(ds.readDouble());
		System.out.println(ds.readInt());
		System.out.println(ds.readUTF());
		
		if(bis!=null) {bis.close();}
	}
}
