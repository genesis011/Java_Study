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
//	1. ������ ���Լ�
	public AppMain1() {
		System.out.println(Thread.currentThread().getName() + "������ AppMain() ������");

	}

//	2. init() ���Լ�
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
		System.out.println(Thread.currentThread().getName() + "������ main()");
		launch(args); // 1�� ��ġ�� �Ѵ�.(�����޼ҵ��̹Ƿ� this�� ������� �ʴ´�.)
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
//		1. ��Ʈ �����̳ʿ� ��Ʈ�ѷ��� �����.
//		VBox vBox = new VBox();
		HBox vBox = new HBox();
		vBox.setPrefHeight(150);
		vBox.setPrefWidth(500);
		vBox.setAlignment(Pos.CENTER);// ��� ����
//		vBox.setAlignment(Pos.CENTER_LEFT);// ���� ����
		vBox.setSpacing(20);

//		2. ��Ʈ�ѷ�
		Label label = new Label();
		label.setText("JAVA FX");
		label.setFont(new Font(50));

		Button button = new Button();
		button.setText("Ȯ��");
		button.setOnAction((args0) -> Platform.exit());

//		3. ��Ʈ ���׳ʿ� ��Ʈ�ѷ��� ����ִ´�.
		ObservableList<Node> list = vBox.getChildren();
		list.add(label);
		list.add(button);

//		4. ��Ʈ �����̳ʸ� scene�� ����ִ´�.
		Scene scene = new Scene(vBox);
//		5. stage�� scene�� ����ִ´�.
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	@Override
	public void stop() throws Exception {
		System.out.println(Thread.currentThread().getName() + "������ Stop()");

	}
}
