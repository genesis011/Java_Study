package ioepception1;

import java.io.IOException;

public class Test {
	public static final int SIZE = 100;

	public static void main(String[] args) {
		try {
			System.out.println(readString());
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public static String readString() throws IOException {
		byte[] buf = new byte[SIZE];
		System.out.print("문자열을 입력하시오: ");
		System.in.read(buf);
		return new String(buf);
	}
}
