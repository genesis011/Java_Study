package chapter10.javaFX_main;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class AppMain1 extends Application {
//	1. 생성자 콜함수
	public AppMain1() {
		System.out.println(Thread.currentThread().getName() + "스레드 AppMain() 생성자");

	}

//	2. init() 콜함수
	@Override
	public void init() throws Exception {
		Parameters ps = getParameters();
		Map<String, String> map = ps.getNamed();
		Set<Entry<String, String>> set = map.entrySet();
		for (Entry<String, String> entry : set) {

			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("key=" + key + "value" + value);
		}
	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + "스레드 main()");
		launch(args); // 1번 런치를 한다.(정적메소드이므로 this를 사용하지 않는다.)
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
//		1. 루트 컨테이너와 컨트롤러를 만든다.
//		VBox vBox = new VBox();
		HBox vBox = new HBox();
		vBox.setPrefHeight(150);
		vBox.setPrefWidth(500);
		vBox.setAlignment(Pos.CENTER);// 가운데 정렬
//		vBox.setAlignment(Pos.CENTER_LEFT);// 왼쪽 정렬
		vBox.setSpacing(20);

//		2. 컨트롤러
		Label label = new Label();
		label.setText("JAVA FX");
		label.setFont(new Font(50));

		Button button = new Button();
		button.setText("확인");
		button.setOnAction((args0) -> Platform.exit());

//		3. 루트 컨테너에 컨트롤러를 집어넣는다.
		ObservableList<Node> list = vBox.getChildren();
		list.add(label);
		list.add(button);

//		4. 루트 컨테이너를 scene에 집어넣는다.
		Scene scene = new Scene(vBox);
//		5. stage에 scene을 집어넣는다.
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	@Override
	public void stop() throws Exception {
		System.out.println(Thread.currentThread().getName() + "스레드 Stop()");

	}
}
