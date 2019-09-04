package chapter09.event;

import java.awt.event.ActionListener;

import javax.swing.Timer;

public class MyClassTest {

	public static void main(String[] args) throws InterruptedException {
		ActionListener actionListener = new MyClass();
//		시간 타이머로 이벤트를 자동으로 발생시켜보자.
		Timer t=new Timer(1000, actionListener);
		t.start();
		for(int i=0;i<10;i++) {
			Thread.sleep(1000);
		}
	}
}
