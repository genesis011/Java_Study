package chapter10.Chainge_Window2;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;



public class LoginController extends Object implements Initializable {
	@FXML private Button buttonMain1;
	@FXML private Button buttonMain2;
	@FXML private AnchorPane anchorPaneRoot;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		buttonMain1.setOnAction((e)-> {
			handleButtonMainAction(e);
	});
		buttonMain2.setOnAction((e)-> {
			handleButtonMainAction(e);
	});
	}
	private void handleButtonMainAction(ActionEvent e) {
		StackPane stackPane=(StackPane) buttonMain1.getScene().getRoot();
		StackPane stackPane1=(StackPane) buttonMain2.getScene().getRoot();
		stackPane.getChildren().remove(anchorPaneRoot);
		stackPane1.getChildren().remove(anchorPaneRoot);
	}
}
