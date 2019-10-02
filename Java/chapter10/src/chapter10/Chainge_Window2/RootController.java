package chapter10.Chainge_Window2;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

public class RootController implements Initializable {
	@FXML	private Button buttonLogin1;
	@FXML	private Button buttonLogin2;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		buttonLogin1.setOnAction((e) -> {
			handleButtonLoginAction(e);
		});
		buttonLogin2.setOnAction((e1) -> {
			handleButtonLoginAction1(e1);
		});
	}

	private void handleButtonLoginAction(ActionEvent e) {
		StackPane stackPane = null;
		AnchorPane anchorPane = null;
		try {
			stackPane = (StackPane) buttonLogin1.getScene().getRoot();
			anchorPane = FXMLLoader.load(getClass().getResource("login.fxml"));
			stackPane.getChildren().add(anchorPane);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	private void handleButtonLoginAction1(ActionEvent e) {
		StackPane stackPane = null;
		AnchorPane anchorPane = null;
		try {
			stackPane = (StackPane) buttonLogin2.getScene().getRoot();
			anchorPane = FXMLLoader.load(getClass().getResource("login.fxml"));
			stackPane.getChildren().add(anchorPane);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
