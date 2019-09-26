package chapter10.Input_control;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class RootController implements Initializable {
	@FXML private TextField textTitle;
	@FXML private PasswordField textPassword;
	@FXML private ComboBox<String> comboBox;
	@FXML private DatePicker datePicker;
	@FXML private TextArea dateArea;
	@FXML private Button buttonSave;
	@FXML private Button buttonExit;
	
	
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		 //1. 콤보박스에 항목 입력하기.
	      ObservableList<String> list =FXCollections.observableArrayList();
	      list.add("공개");
	      list.add("비공개");
	      comboBox.setItems(list);

	      comboBox.getSelectionModel().selectedItemProperty().addListener(
	              new ChangeListener<String>() {
	           @Override
	           public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
	              String data=dateArea.getText();
	              dateArea.setText(data+arg2);
	           }
	        });
	        buttonSave.setOnAction((e)-> {
	           String titleData=textTitle.getText();
	           String passwordData=textPassword.getText();
	           String comboBoxData=comboBox.getValue(); // 값을 가져온다.
	           LocalDate localDate = datePicker.getValue();
	           String localDateDate = localDate.toString(); // 문자열로 출력.
	           dateArea.setText(titleData+"\n"+passwordData+"\n"+comboBoxData+"\n"+localDateDate);
	     });
	  }
	     public void handlerButtonExitAction(ActionEvent e) {
	    	 dateArea.setText(null);
	        System.exit(0);

	}
}