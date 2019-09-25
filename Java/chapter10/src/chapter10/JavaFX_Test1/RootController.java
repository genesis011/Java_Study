package chapter10.JavaFX_Test1;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.text.Font;

public class RootController implements Initializable {
	@FXML private Label lbSize;
	@FXML private Slider lblSize;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		lblSize.setOnMouseDragged(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				double value=lblSize.getValue();
				lbSize.setFont(new Font(value));
				
			}
			
		});
	}
}
