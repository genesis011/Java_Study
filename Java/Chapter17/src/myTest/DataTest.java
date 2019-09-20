package myTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataTest {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		List<Data> list = new ArrayList<Data>();
		list.add(new Data("", "", ""));
		list.add(new Data("", "", ""));
		list.add(new Data("", "", ""));
		list.add(new Data("", "", ""));
		list.add(new Data("", "", ""));
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.bin"));
		oos.writeObject(list);
		if (oos != null) {
			oos.close();
		}
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.bin"));
		ArrayList<Data> al = (ArrayList<Data>) ois.readObject();
		Iterator<Data> itt = al.iterator();

		Data data = null;
		while (itt.hasNext()) {
			if (data.name.equals("")) {
				System.out.println("찾았다. : " + data);
			}
			System.out.println(data);
		}
		for (int i = 0; i < al.size(); i++) {
			if (al.get(i).name.equals("john")) {
				System.out.println("찾았다.!!! : " + al.get(i));
				break;
			}
			for (Data d : al) {
				if (d.name.equals("")) {
					System.out.println("찾았다. : " + d);
				}
			}
		}
	}
}
