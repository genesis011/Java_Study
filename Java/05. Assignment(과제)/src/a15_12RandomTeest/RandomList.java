package a15_12RandomTeest;

import java.util.ArrayList;
import java.util.Iterator;

public class RandomList <T>{

		private ArrayList<T> list;
		
		public RandomList() {
			super();
			this.list=new ArrayList<T>();
		}
		public void add(T item) { 
			list.add(item);
//			-����Ʈ�� �����ۿ��Ҹ� �޾Ƽ� �߰��Ѵ�.
	 }

		public T getObj(){
//			int size=list.size()-1;
			int index=(int)(Math.random()*(list.size()));
			return list.get(index);
		 }
		public void iteratorPrint() {
			Iterator<T>iterator=list.iterator();
			while(iterator.hasNext()) {
				System.out.println(iterator.next());
			}
		}
	}

