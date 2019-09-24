package chapter10.JavaFXTest;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javafx.application.Application;
import javafx.stage.Stage;

public class AppMain extends Application {
	public AppMain() {
		System.out.println(Thread.currentThread().getName() + " 1 ������ AppMain()");
	}

	@Override
	public void init() throws Exception {
		System.out.println(Thread.currentThread().getName() + " 5 ������ init()");
		Parameters ps = getParameters();
		Map<String, String> map = ps.getNamed();
		Set<Entry<String, String>> set = map.entrySet();
		for (Entry<String, String> entry : set) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("key" + key + "value" + value);
		
		
		}
	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + " 2 ������ main()");
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println(Thread.currentThread().getName() + " 3 ������ start()");
		primaryStage.setTitle("�ڹ� �̸� â");
		primaryStage.show();
	}

	@Override
	public void stop() throws Exception {
		System.out.println(Thread.currentThread().getName() + " 4 ������ start()");
	}
}
