package chapter10.css_dropshadow;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AppMain extends Application {
	public static Stage primarySStage;
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
//		1~3.번까지 root.fxml을 자져온다.
		
//		1. root.fxml(클래스)와 RootController를 로더해서 UI객체와 RootController객체를 만든다(힙영역)
//		2. RootController에 있는 @FXML있는 멤버변수에 UI객체를 연결한다.
//		3. initalize함수에서 UI객체에 이벤트정의 및 처리, 속성감시 이벤트정의및 처리한다.
//		4. UI객체중에 최종컨테이너 객체를 리턴한다.
		
		HBox hBox =(HBox)FXMLLoader.load(getClass().getResource("root.fxml"));
		
		primarySStage = primaryStage;
//		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("root.fxml"));
//		Parent hBox = fxmlLoader.load();
//		RootController rootController = fxmlLoader.getController();
//		rootController.primaryStage = primaryStage;
//		Parent root = FXMLLoader.load(getClass().getResource("root.fxml"));
		
//		4. 루트 컨테이너를 scene에 집어 넣은다.
		Scene scene = new Scene(hBox);
//		5. scene에 외부 스타일을 집어넣는다.
		scene.getStylesheets().add(getClass().getResource("app.css").toString());
		
//		6. stage에 scene를 집어 넣는다.
		primaryStage.setScene(scene);
		primaryStage.setTitle("Mercedes-sns & www.kokoboa.com & 2019/09/30");
//		primaryStage.setResizable(false);
		primaryStage.setResizable(true);
		primaryStage.show();
	}
}
