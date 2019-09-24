package chapter10.Hbox;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AppMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// 1.루트 컨테이너와 컨트롤러를 만든다. 여러가지가있다.
		HBox hBox = new HBox();
		hBox.setPrefHeight(150); // 세로
		hBox.setPrefWidth(350); // 가로
		hBox.setAlignment(Pos.CENTER); // 가운데 정렬
		hBox.setSpacing(30); // 여백 공간

		// 2.컨트롤러
		TextField textField = new TextField();
		textField.setPrefWidth(200);

		Button button = new Button(); // 버튼 만듬
		button.setText("확인"); // 확인이라는 텍스트 출력
		button.setOnAction((e) -> Platform.exit()); // 이벤트처리

		// 3.루트컨테이너에 컨트롤러 집어넣는다.
		// 옵저버블 리스트와 똑같이 생각하면 된다.
		// Node는 들어가는 컨트롤러

		ObservableList<Node> list = hBox.getChildren();
		list.add(textField);
		list.add(button);

//		1~3번까지 진행한 root.fxml을 가져온다.

		// 4.루트 컨테이너를 scene에 집어넣는다.
		Scene scene = new Scene(hBox);
		// 5.stage에 scene를 집어넣는다.
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
