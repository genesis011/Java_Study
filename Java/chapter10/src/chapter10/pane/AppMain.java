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
//		1. root container(두가지 : 자바프로그램, fxml, scene Builder)
//		2. scene 만듬
//		3. 신을 스테이지 적용시켜야 됨
		Parent kk = FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene scene =new Scene(kk);
		primaryStage.setTitle("이태성Home");
		primaryStage.setScene(scene);
//		primaryStage.setResizable(false); //창 크기 고정
		primaryStage.setResizable(true); //창 크기 고정
		primaryStage.show();

	}
}
