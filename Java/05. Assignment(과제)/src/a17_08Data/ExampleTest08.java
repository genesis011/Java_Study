package a17_08Data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ExampleTest08 {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File file = new File("study.dat");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		ArrayList<Student> list = new ArrayList<Student>();
		int no = 1;
		while (true) {
			System.out.println(no + "이름입력");
			String name = scan.nextLine();
			list.add(new Student(no, name));
			no++;
			System.out.print("계속진행하시겠어요?(Y/N)");
			String go=scan.nextLine();
			if(go.equals("N")|| go.equals("n")) {break;}
		}
		oos.writeObject(list);
		if(oos!=null) {oos.close();}
//		역직렬화
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		ArrayList<Student>list2=(ArrayList<Student>)ois.readObject();
		
		Iterator<Student>iterator=list2.iterator();
		Boolean find=false;
		while(iterator.hasNext()) {
			Student stu=iterator.next();
			if(stu.no==2) {
				System.out.println(stu);break;}
		}//end of while
		if(find==false) {System.out.println("없어요");}
		if(ois!=null) {ois.close();}
	}
}
