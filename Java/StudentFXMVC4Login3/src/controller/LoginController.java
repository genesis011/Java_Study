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

public class LoginController implements Initializable {
	@FXML private TextField txtId;
	@FXML private PasswordField txtPassword;
	@FXML private Button btnLogin;
	@FXML private Button btnCancel;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//1. 버튼을 눌렀을때 이벤트를 처리하는 방식
		btnLogin.setOnAction(e->{ handlerBtnLoginAction(e);});
		btnCancel.setOnAction(e->{handlerBtnCancelAction(e);});
		
	}
	public void handlerBtnLoginAction(ActionEvent e) {
	
		if(txtId.getText().equals("") || txtPassword.getText().equals("")) {
			alertDisplay(1,"로그인 실패","아이디 , 패스워드 재입력하세요","다시 확인해주세요");
		}else if(txtId.getText().equals("a") && txtPassword.getText().equals("1234")) {
		
			Parent mainView=null;
			Parent mainView1=null;
			Stage mainStage=null;
			
			
			try {
				mainView=FXMLLoader.load(getClass().getResource("/view/main.fxml"));
				mainView=FXMLLoader.load(getClass().getResource("/view/view.fxml"));
				Scene scene = new Scene(mainView);
				mainStage = new Stage();
				mainStage.setTitle("Main Window");
				mainStage.setScene(scene);
				mainStage.setResizable(true);
				// 현재 스테이지 닫고 새로운 창을 여는방법.
				((Stage) btnLogin.getScene().getWindow()).close();
				mainStage.show();
			} catch (IOException e1) {
				alertDisplay(1,"메인창 콜실패","메인창 부르기 실패", e.toString());
				e1.printStackTrace();
			}
			
		}else {
			alertDisplay(1,"로그인 실패","아이디, 패스워드 불일치","다시 제대로 입력하시오");
		}
	}
	public void handlerBtnCancelAction(ActionEvent e) {
		((Stage) btnLogin.getScene().getWindow()).close();
	}
	private void alertDisplay(int type, String title, String headerText, String contentText) {
		
		Alert alert = null;
		switch(type){
		case  1:   alert = new Alert(AlertType.WARNING); break;
		case  2:   alert = new Alert(AlertType.CONFIRMATION);break;
		case  3:   alert = new Alert(AlertType.ERROR);break;
		case  4:   alert = new Alert(AlertType.NONE);break;
		case  5:   alert = new Alert(AlertType.INFORMATION);break;
		}
		alert.setTitle(title);
		alert.setHeaderText(headerText);
		alert.setContentText(headerText+"\n"+contentText);
		alert.setResizable(false);
		alert.show();
		
	}
}