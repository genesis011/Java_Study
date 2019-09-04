package ioepception;

import java.io.IOException;

public class Test {
	public static final int SIZE = 100;

	public static void main(String[] args) throws IOException {

		System.out.println(readString());
	}

	public static String readString() throws IOException {
		byte[] buf = new byte[SIZE];
		System.out.print("문자열을 입력하시오: ");
//		System.in.read(buf); //1번
		throw new IOException(); //2번
//		return new String(buf); // 1번
	}
}
