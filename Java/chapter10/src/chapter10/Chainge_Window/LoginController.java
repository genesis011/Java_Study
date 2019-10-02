package chapter10.Chainge_Window;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;



public class LoginController extends Object implements Initializable {
	@FXML private Button buttonMain;
	@FXML private AnchorPane anchorPaneRoot;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		buttonMain.setOnAction((e)-> {
			handleButtonMainAction(e);
		
	});
	}
	private void handleButtonMainAction(ActionEvent e) {
		StackPane stackPane=(StackPane) buttonMain.getScene().getRoot();
		stackPane.getChildren().remove(anchorPaneRoot);
	}
}
