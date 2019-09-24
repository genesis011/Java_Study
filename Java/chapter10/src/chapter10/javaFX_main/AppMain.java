package chapter10.javaFX_main;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javafx.application.Application;
import javafx.stage.Stage;

//자바 라이브러리에 추가한다.
// 자바 애플리케이션을 상속을 받는다
// 메인에 런치를 부른다
// 매개변수 쇼우를 하면 메인 창이 뜬다.
public class AppMain extends Application {
//	1. 생성자 콜함수
	public AppMain() {
		System.out.println(Thread.currentThread().getName() + "스레드 AppMain() 생성자");
//		System.out.println("AppMain() 생성자");
	}

//	2. init() 콜함수
	@Override
	public void init() throws Exception {
		System.out.println(Thread.currentThread().getName() + "스레드 init()");
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
//		System.out.println(Thread.currentThread().getName() + "스레드 init()");
//		System.out.println("init() 콜");
	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + "스레드 main()");
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println(Thread.currentThread().getName() + "스레드 start()");
//		System.out.println("Start()생성");
		primaryStage.setTitle("JavaFX"); // 창 이름
		primaryStage.show();
	}

	@Override
	public void stop() throws Exception {
		System.out.println(Thread.currentThread().getName() + "스레드 Stop()");

	}
}
