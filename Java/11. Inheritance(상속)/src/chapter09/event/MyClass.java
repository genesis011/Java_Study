package chapter09.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyClass implements ActionListener {
	private int count = 0;

//.이벤트가 발생하면 불러지는 콜백 함수다.
//	매개변수는 이벤트가 발생이되면 발생될때 모든 정보를 객체로 만들어서 
//	ActionEvent a=객체 
	@Override
	public void actionPerformed(ActionEvent e) {
//이벤트가 발생이 되었을 떄 해야될 일 적으면된다
		System.out.println((count++) + "deep");
	}

}
