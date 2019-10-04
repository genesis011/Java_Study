package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController extends Object implements Initializable {
	@FXML private TextField txtId;
	@FXML private PasswordField txtPassword;
	@FXML private Button buttonLogin;
	@FXML private Button buttonCancel;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
//		1.��ưȮ�� �̺�Ʈ ó��
		buttonLogin.setOnAction((e)-> {handlerButtonLoginAction(e);});
//		2. ��ư��� �̺�Ʈ ó��
		buttonCancel.setOnAction((e)-> {buttonCancelCancelAction(e);});
//		�ٷ� ������
		txtId.setText("admin");
		txtPassword.setText("1234");
	}
//	1. ��ưȮ�� �̺�Ʈ ó��
	private void handlerButtonLoginAction(ActionEvent e) {
//		1. ���̵�� �н����尡 �Էµ��� �ʾ��� �� ����â�� �ش�.
		if(txtId.getText().equals("") || txtPassword.getText().equals("")) {
			alertDisplay(1,"�α��� ����","���̵�, �н����� ���Է�","�ٽ� ����� �Է��Ͻÿ�");
//			
//			1. ���̵�� �н����尡 �ǹٸ��� �ԷµǾ��� ��
		} else if(txtId.getText().equals("admin") && txtPassword.getText().equals("1234")) {
//			���� �۾��� �ؾ��մϴ�.
//			System.out.println("OK");
//			�α׸��� �Ϸ�Ǿ����� ���� ����â���� �̵��Ѵ�.
			Parent mainView=null;
			Stage mainStage=null;
			try {
//				mainView=FXMLLoader.load(getClass().getResource("/view/main.fxml"));
				mainView=FXMLLoader.load(getClass().getResource("/view/view.fxml"));
				Scene scene = new Scene(mainView);
				mainStage=new Stage();
				mainStage.setScene(scene);
				mainStage.setTitle("Main Window Mercedes-sns & www.kokoboa.com");
				mainStage.setResizable(true);
//				���� ���������� �ݰ� ���ο�â�� ����.
				((Stage) buttonLogin.getScene().getWindow()).close();
				mainStage.show();
			} catch (IOException e1) {
//				System.out.println("����â����"+e);
				alertDisplay(1,"����â �ݽ���","����â �θ��� ����",e1.toString());
			}
			
			
//			3. ����Ƽ�� �н����尡 ��ġ���� �ʾ��� �� ���â�� �ش�.
		} else {
			alertDisplay(1,"�α��� ����","���̵� �Ǵ� �н����� ��ġ���� �ʽ��ϴ�.","�ٽ� ����� �Է��Ͻÿ�");
		}
	}
//	2. ��ư��� �̺�Ʈ ó��
	private void buttonCancelCancelAction(ActionEvent e) {
//		Stage stage=(Stage) buttonLogin.getScene().getWindow();
		((Stage) buttonLogin.getScene().getWindow()).close();
//		stage.close();
	}
//	3. ���â ó���ϴ� �Լ�
	private void alertDisplay(int type, String title, String headerText, String contentTest) {
		Alert alert = null;
		switch(type) {
		case 1: alert = new Alert(AlertType.WARNING); break;
		case 2: alert = new Alert(AlertType.CONFIRMATION); break;
		case 3: alert = new Alert(AlertType.ERROR); break;
		case 4: alert = new Alert(AlertType.NONE); break;
		case 5: alert = new Alert(AlertType.INFORMATION); break;
		}
		alert.setTitle(title);
		alert.setHeaderText(headerText);
		alert.setContentText(headerText+"\n"+contentTest);
		alert.setResizable(false);
		alert.showAndWait();
	}
}
 