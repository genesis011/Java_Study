package chapter10.TextArea_Test3;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

public class RootController implements Initializable {
	@FXML private TextArea txtOne;
	@FXML private TextArea txtTow;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Bindings.bindBidirectional(txtOne.textProperty(), txtTow.textProperty());
	}
}
