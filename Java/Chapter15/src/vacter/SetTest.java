package vacter;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		HashSet<String> hs2 = new HashSet<String>();
		hs.add("aaa");
		hs.add("bbb");
		hs.add("ccc");
		hs2.add("ccc");
		hs2.add("ddd");
		
		iteratorPrint(hs);
		iteratorPrint(hs2);
		hs.addAll(hs2);//교집합
		iteratorPrint(hs);//합집합
		
		HashSet<String> retain = new HashSet<String>(hs);
		retain.retainAll(hs2);//차집합
		System.out.println("교집합");
		retain.retainAll(retain);//차집합
			
//		for (String str : hs) {
//			System.out.println(str);
//		}
//		System.out.println("==============>");	
	}//end of main

	private static void iteratorPrint(HashSet<String> hs) {
		// 출력방법
		Iterator<String> iter = hs.iterator();
		while (iter.hasNext()) {
			String str = iter.next();
			System.out.println(str);
		}
		System.out.println("==============>"+hs.getClass().getName());
	}
}//end of class
