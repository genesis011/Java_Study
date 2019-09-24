package chapter10.JavaFX_HBox_Test;

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

public class HBoxTest extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox hBox = new HBox();
		hBox.setPrefHeight(150);
		hBox.setPrefWidth(350);
		hBox.setAlignment(Pos.CENTER);
		hBox.setSpacing(30);
		
		TextField testField = new TextField();
		testField.setPrefWidth(200);
		
		Button button = new Button();
		button.setText("È®ÀÎ");
		button.setOnAction((e)->Platform.exit());
		
		ObservableList<Node>list =hBox.getChildren();
		list.add(testField);
		list.add(button);	
		
		Scene scene = new Scene(hBox);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
