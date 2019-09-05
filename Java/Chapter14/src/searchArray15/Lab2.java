package searchArray15;

import java.util.Scanner;

class NotFoundException extends Exception {
	public NotFoundException() {
		super("배열에서 찾을 수 없습니다.");
	}
}
