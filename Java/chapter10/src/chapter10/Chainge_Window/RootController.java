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
//�α��� ȭ���� �����ִ� �̺�Ʈ ó���Լ�
	private void handleButtonLoginAction(ActionEvent e) {
//		root.fxml�� �ִ� ���� �ٱ���(�ֻ���)�� �ִ� ��Ʈ �����̳� ��ü���� �����´�.(StackPane��ü)
		StackPane stackPane=null;
		AnchorPane anchorPane=null;
		try {
//		login.fxml �δ�(login.fxml ��� ��üȭ��Ű��) �ֻ����� �ִ� ��Ʈ �����̳ʰ�ü����
		 stackPane=(StackPane) buttonLogin.getScene().getRoot();
		 anchorPane=FXMLLoader.load(getClass().getResource("login.fxml"));
			stackPane.getChildren().add(anchorPane);
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
	}
}
