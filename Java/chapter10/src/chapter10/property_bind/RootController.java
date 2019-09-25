package chapter10.property_bind;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.text.Font;

public class RootController implements Initializable {
	@FXML TextArea txtAA;
	@FXML TextArea txtAB;
	@FXML Button btnBind;
	@FXML Button btnUnbind;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		btnBind.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				Bindings.bindBidirectional(txtAA.textProperty(), txtAB.textProperty()); //동시에 위 아래 입력가능2
						
			}
		});
		btnUnbind.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				Bindings.unbindBidirectional(txtAA.textProperty(), txtAB.textProperty());
			}		
		});
			
//		txtAB.textProperty().bindBidirectional(txtAA.textProperty()); //동시에 위 또는 아래 입력가능1
		
//		txtAA.setOnKeyReleased(new EventHandler<Event>() {
//
//			@Override
//			public void handle(Event event) {
//				String data=txtAA.getText();
//				int count=txtAA.getLength();
//				String data=txtAA.getText(count-1, count);
//				String targetData=txtAB.getText();
//				txtAB.setText(targetData+data);
//			}
//		});
		
//		lblSize.valueProperty().addListener(new ChangeListener<Number>() {

//			@Override
//			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
//				lbText.setFont(new Font(newValue.doubleValue()));
//				count++;
//				System.out.print(count+" ");
//			}
//		});
	}
}
