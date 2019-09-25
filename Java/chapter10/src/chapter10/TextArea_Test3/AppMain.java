package chapter10.TextArea_Test3;

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
		Parent root=FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene scene=new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("¿Ã∫•∆Æ");
//		primaryStage.setResizable(false);
		primaryStage.setResizable(true);
		primaryStage.show();
	}
}
