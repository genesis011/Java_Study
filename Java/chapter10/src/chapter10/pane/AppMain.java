package chapter10.pane;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
//		1. root container(�ΰ��� : �ڹ����α׷�, fxml, scene Builder)
//		2. scene ����
//		3. ���� �������� ������Ѿ� ��
		Parent kk = FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene scene =new Scene(kk);
		primaryStage.setTitle("���¼�Home");
		primaryStage.setScene(scene);
//		primaryStage.setResizable(false); //â ũ�� ����
		primaryStage.setResizable(true); //â ũ�� ����
		primaryStage.show();

	}
}
