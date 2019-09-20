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
		list.add(new Data("����", "1993", "ȫ�浿"));
		list.add(new Data("���", "1993", "�浿"));
		list.add(new Data("��", "1993", "��"));
		list.add(new Data("��", "1993", "��"));
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
			if (data.name.equals("ȫ�浿")) {
				System.out.println("ã�Ҵ�." + data);
			}
			System.out.println(data);
		}
	}
}
