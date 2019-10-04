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
//		1.버튼확인 이벤트 처리
		buttonLogin.setOnAction((e)-> {handlerButtonLoginAction(e);});
//		2. 버튼취소 이벤트 처리
		buttonCancel.setOnAction((e)-> {buttonCancelCancelAction(e);});
//		바로 적어줌
		txtId.setText("admin");
		txtPassword.setText("1234");
	}
//	1. 번튼확인 이벤트 처리
	private void handlerButtonLoginAction(ActionEvent e) {
//		1. 아이디와 패스워드가 입력되지 않았을 때 경코창을 준다.
		if(txtId.getText().equals("") || txtPassword.getText().equals("")) {
			alertDisplay(1,"로그인 실패","아이디, 패스워드 미입력","다시 제대로 입력하시오");
//			
//			1. 아이디와 패스워드가 옳바르게 입력되었을 때
		} else if(txtId.getText().equals("admin") && txtPassword.getText().equals("1234")) {
//			뭔가 작업을 해야합니다.
//			System.out.println("OK");
//			로그린이 완료되었으면 다음 메인창으로 이동한다.
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
//				현재 스테이지를 닫고 새로운창을 연다.
				((Stage) buttonLogin.getScene().getWindow()).close();
				mainStage.show();
			} catch (IOException e1) {
//				System.out.println("메인창오류"+e);
				alertDisplay(1,"메인창 콜실패","메인창 부르기 실패",e1.toString());
			}
			
			
//			3. 아이티와 패스워드가 일치하지 않았을 때 경고창을 준다.
		} else {
			alertDisplay(1,"로그인 실패","아이디 또는 패스워드 일치하지 않습니다.","다시 제대로 입력하시오");
		}
	}
//	2. 버튼취소 이벤트 처리
	private void buttonCancelCancelAction(ActionEvent e) {
//		Stage stage=(Stage) buttonLogin.getScene().getWindow();
		((Stage) buttonLogin.getScene().getWindow()).close();
//		stage.close();
	}
//	3. 경고창 처리하는 함수
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
 