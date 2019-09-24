package chapter10.javaFX_main;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javafx.application.Application;
import javafx.stage.Stage;

//�ڹ� ���̺귯���� �߰��Ѵ�.
// �ڹ� ���ø����̼��� ����� �޴´�
// ���ο� ��ġ�� �θ���
// �Ű����� ��츦 �ϸ� ���� â�� ���.
public class AppMain extends Application {
//	1. ������ ���Լ�
	public AppMain() {
		System.out.println(Thread.currentThread().getName() + "������ AppMain() ������");
//		System.out.println("AppMain() ������");
	}

//	2. init() ���Լ�
	@Override
	public void init() throws Exception {
		System.out.println(Thread.currentThread().getName() + "������ init()");
		Parameters ps = getParameters();
		Map<String, String> map = ps.getNamed();
		Set<Entry<String, String>> set = map.entrySet();
		for (Entry<String, String> entry : set) {

			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("key=" + key + "value" + value);
		}
//		List<String>list=ps.getRaw();
//		for(String value:list) {
//			System.out.println(value);
//		}
//		System.out.println(Thread.currentThread().getName() + "������ init()");
//		System.out.println("init() ��");
	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + "������ main()");
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println(Thread.currentThread().getName() + "������ start()");
//		System.out.println("Start()����");
		primaryStage.setTitle("JavaFX"); // â �̸�
		primaryStage.show();
	}

	@Override
	public void stop() throws Exception {
		System.out.println(Thread.currentThread().getName() + "������ Stop()");

	}
}
