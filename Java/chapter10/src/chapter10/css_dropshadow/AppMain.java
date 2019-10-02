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
//		1~3.������ root.fxml�� �����´�.
		
//		1. root.fxml(Ŭ����)�� RootController�� �δ��ؼ� UI��ü�� RootController��ü�� �����(������)
//		2. RootController�� �ִ� @FXML�ִ� ��������� UI��ü�� �����Ѵ�.
//		3. initalize�Լ����� UI��ü�� �̺�Ʈ���� �� ó��, �Ӽ����� �̺�Ʈ���ǹ� ó���Ѵ�.
//		4. UI��ü�߿� ���������̳� ��ü�� �����Ѵ�.
		
		HBox hBox =(HBox)FXMLLoader.load(getClass().getResource("root.fxml"));
		
		primarySStage = primaryStage;
//		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("root.fxml"));
//		Parent hBox = fxmlLoader.load();
//		RootController rootController = fxmlLoader.getController();
//		rootController.primaryStage = primaryStage;
//		Parent root = FXMLLoader.load(getClass().getResource("root.fxml"));
		
//		4. ��Ʈ �����̳ʸ� scene�� ���� ������.
		Scene scene = new Scene(hBox);
//		5. scene�� �ܺ� ��Ÿ���� ����ִ´�.
		scene.getStylesheets().add(getClass().getResource("app.css").toString());
		
//		6. stage�� scene�� ���� �ִ´�.
		primaryStage.setScene(scene);
		primaryStage.setTitle("Mercedes-sns & www.kokoboa.com & 2019/09/30");
//		primaryStage.setResizable(false);
		primaryStage.setResizable(true);
		primaryStage.show();
	}
}
