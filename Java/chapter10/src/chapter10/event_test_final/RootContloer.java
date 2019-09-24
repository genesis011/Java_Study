package chapter10.event_test_final;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class RootContloer implements Initializable {
	
	@FXML private Label label;
	@FXML private Button button1;
	@FXML private Button button2;
	@FXML private Button button3;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		button1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				String data=button1.getText();
				label.setText(data);				
			}
		});
		button2.setOnAction((e)-> {
				String data=button1.getText();
			
			
		});
		
	}
	
	
	public void handlerButton3Action(ActionEvent e) {
		String data=button3.getText();
		label.setText(data);	
	}
}
