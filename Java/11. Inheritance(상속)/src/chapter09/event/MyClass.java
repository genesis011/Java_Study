package chapter09.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyClass implements ActionListener {
	private int count = 0;

//.�̺�Ʈ�� �߻��ϸ� �ҷ����� �ݹ� �Լ���.
//	�Ű������� �̺�Ʈ�� �߻��̵Ǹ� �߻��ɶ� ��� ������ ��ü�� ���� 
//	ActionEvent a=��ü 
	@Override
	public void actionPerformed(ActionEvent e) {
//�̺�Ʈ�� �߻��� �Ǿ��� �� �ؾߵ� �� ������ȴ�
		System.out.println((count++) + "deep");
	}

}
