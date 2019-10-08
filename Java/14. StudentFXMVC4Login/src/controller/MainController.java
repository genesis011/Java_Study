package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class MainController extends Object implements Initializable {
	@FXML private TextField txtName;
	@FXML private Button buttonInsert;
	@FXML private Button buttonDelete;
	@FXML private Button buttonEnd;
	@FXML private Button buttonOk;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		buttonInsert.setOnAction((e)-> {handlerButtonInsertAction(e);});
		buttonDelete.setOnAction((e)-> {handlerButtonDeleteAction(e);});
		buttonEnd.setOnAction((e)-> {handlerButtonEndAction(e);});
		buttonOk.setOnAction((e)-> {handlerButtonOkAction(e);});
		
	}
//	1.
	public void handlerButtonInsertAction(ActionEvent e) {
		alertDisplay(5,"삽입정보","삽입정보",txtName.getText() +"님 반갑습니다.");	
	}
//	2.
	public void handlerButtonEndAction(ActionEvent e) {
		alertDisplay(5,"종료","종료",txtName.getText() +"님 안녕");
	}
//	3.
	public void handlerButtonDeleteAction(ActionEvent e) {
		alertDisplay(5,"삭제","삭제",txtName.getText() +"님 제거했습니다.");
	}
//	4.
	public void handlerButtonOkAction(ActionEvent e) {
		alertDisplay(5,"확인","확인",txtName.getText() +"님 확인했습니다.");
	}
	
//	<. 경고창 처리하는 함수
	public void alertDisplay(int type, String title, String headerText, String contentTest) {
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
 