package chapter10.propertys;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.text.Font;

public class RootController implements Initializable {
	@FXML	private Label lbText;
	@FXML	private Slider lblSize;
	
	private int count = 0;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		lblSize.setOnMouseDragged(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				double value = lblSize.getValue();
				lbText.setFont(new Font(value));
//				count++;
//				System.out.println(count+" ");

			}
		});

//		lblSize.valueProperty().addListener(new ChangeListener<Number>() {

//			@Override
//			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
//				lbText.setFont(new Font(newValue.doubleValue()));
////				count++;
////				System.out.print(count+" ");
//			}
//		});
	}
}
