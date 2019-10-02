package chapter10.Chainge_Window;

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


public class RootController extends Object implements Initializable {
@FXML private Button buttonLogin;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		buttonLogin.setOnAction((e)-> {
				handleButtonLoginAction(e);			
		});
	}
//로그인 화묜을 보여주는 이벤트 처리함수
	private void handleButtonLoginAction(ActionEvent e) {
//		root.fxml에 있는 제일 바깥쪽(최상위)에 있는 루트 컨테이너 객체값을 가져온다.(StackPane객체)
		StackPane stackPane=null;
		AnchorPane anchorPane=null;
		try {
//		login.fxml 로더(login.fxml 모두 객체화시키고) 최상위의 있는 루트 컨테이너객체값을
		 stackPane=(StackPane) buttonLogin.getScene().getRoot();
		 anchorPane=FXMLLoader.load(getClass().getResource("login.fxml"));
			stackPane.getChildren().add(anchorPane);
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
	}
}
