package myTest2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyTest {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		List<Data> list = new ArrayList<Data>();
		list.add(new Data("서울", "1993", "홍길동"));
		list.add(new Data("경기", "1993", "길동"));
		list.add(new Data("남", "1993", "길"));
		list.add(new Data("서", "1993", "삼"));
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.bin"));
		oos.writeObject(list);
		if (oos != null) {
			oos.close();
		}
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.bin"));
		ArrayList<Data> al = (ArrayList<Data>) ois.readObject();
		Iterator<Data> it = al.iterator();

		Data data = null;
		while (it.hasNext()) {
			data = it.next();
			if (data.name.equals("홍길동")) {
				System.out.println("찾았다." + data);
			}
			System.out.println(data);
		}
	}
}
