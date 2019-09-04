package FileError1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileError {
//	1. 멤버변수 상수, int[]
	private static final int SIZE = 10;// 명시적 초기값.
//private static final int SIZE = 10; static {SIZE=10;}// 정적블록 초기값
	private int[] list;

// 2. 생성자
	public FileError() {
		super();
		this.list = new int[SIZE];
		for (int i = 0; i < list.length; i++) {
			list[i] = i;
		}
		try {
			writeList();
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void writeList() throws ArrayIndexOutOfBoundsException, IOException {
// 자신이 만든 파일을 열어서 쓰겠다는 참조 변수이다.
		PrintWriter pw = null;

		pw = new PrintWriter(new FileWriter("outfile.txt"));
		for (int i = 0; i < list.length; i++) {
			// System.out.println("배열원소"+ i + "=" + list[i]);
			pw.println("배열원소" + i + "=" + list[i]);
		}

		if (pw != null) {
			pw.close();
		}
		System.out.println("잘 마무리 되었습니다.");
	}
}
