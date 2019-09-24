package chapter10.EventTest;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class RootContlloer implements Initializable {
//	멤버변수 선언한다. 화면에서 설계한 모든 객체 여기서 선언됨
	@FXML private Label label;
	@FXML private Button button1;
	@FXML private Button button2;
	@FXML private Button button3;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
//		1번 방식으로 이벤트 처리한다. 임시 객체
		button1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				String data=button1.getText();
				label.setText(data);				
			}
		});
//		2.번 방식으로 이벤트처리한다. 람다식
		button2.setOnAction((e)-> {String data=button2.getText();label.setText(data);	});

	}
//	3.번 방식으로 핸들로함수 직접 콜해서 처리한다.
	public void handlerButton3Action(ActionEvent e) {
		String data=button3.getText();
		label.setText(data);	
	}
}
