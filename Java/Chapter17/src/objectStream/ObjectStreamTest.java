package objectStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		1. 파일 저장
		File file =new File("object.dat");
		FileOutputStream fos=new FileOutputStream(file);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		Student student=new Student(10, "정민지");
		oos.writeObject(student);
		if(oos!=null) {oos.close();}
		
		System.out.println("저장되었습니다.");
//		가져오는 방법
//		2번
		FileInputStream fis=new FileInputStream(file);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Student student1=(Student)ois.readObject();
		System.out.println(student1);
	}
}
