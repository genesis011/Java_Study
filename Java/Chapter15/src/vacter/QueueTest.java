package vacter;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
	public static final int SIZE = 10;

	public static void main(String[] args) throws InterruptedException {
		Queue<Integer> queue = new LinkedList<Integer>();
		for (int i = SIZE; i >= 0; i--) {
			queue.add(new Integer(i));
		}
		while (!queue.isEmpty()) {
			System.out.println(queue.remove() + " ");
			Thread.sleep(1000);// 1초간 대기상태
		}
	}
}
