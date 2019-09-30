package chapter10.menu;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;


public class RootController implements Initializable {
	@FXML private TextArea textArea;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}//end of initialize

	public void handllerMenuFileNewAction(ActionEvent e) {
		textArea.appendText("새로 만들기\n");
	}
	public void handllerMenuFileOpenAction(ActionEvent e) {
		textArea.appendText("열기\n");
	}
	public void handllerMenuFileSaveAction(ActionEvent e) {
		textArea.appendText("저장\n");
	}
	public void handllerMenuFileNxitAction(ActionEvent e) {
		Platform.exit();
	}
}
