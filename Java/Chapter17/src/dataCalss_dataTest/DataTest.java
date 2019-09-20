package dataCalss_dataTest;

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

		list.add(new Data("new yark1", "1989", "john"));
		list.add(new Data("new yark2", "1989", "tony"));
		list.add(new Data("new yark3", "1989", "S.M"));
		list.add(new Data("new yark4", "1989", "Lee"));
		list.add(new Data("new yark5", "1989", "Joy"));
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.bin"));
		oos.writeObject(list);
		if (oos != null) {oos.close();}
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.bin"));
		ArrayList<Data>al=(ArrayList<Data>)ois.readObject();
		Iterator<Data>it=al.iterator();
		
		Data data=null;
		while(it.hasNext()) {
			data=it.next();
			if(data.name.equals("john")) {
				System.out.println("찾았다 : "+data);
			}
			System.out.println(data);
		}
		for(int i=0;i<al.size();i++) {
			if(al.get(i).name.equals("john")) {
				System.out.println("찾았다.!!! : "+al.get(i));break;
			}
			for(Data d : al) {
				if(d.name.equals("john")) {
					System.out.println("찾았다. : "+d);
				}
			}
		}
	}
}
