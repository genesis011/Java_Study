package chapter10.Input_control2;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.binding.Bindings;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;

public class RootController implements Initializable {

   @FXML private TextField title;
   @FXML private PasswordField password;
   @FXML private ComboBox<String> comboBox;
   @FXML private DatePicker datePicker;
   @FXML private TextArea textArea;
   @FXML private Button buttonSave;
   @FXML private Button buttonExit;
   // 콤보 박스가 제네릭인건 들어오는 값이 오브젝트 이라서.
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
            String data=textArea.getText();
            textArea.setText(data+arg2);
         }
      });
      buttonSave.setOnAction((e)-> {
         String titleData=title.getText();
         String passwordData=password.getText();
         String comboBoxData=comboBox.getValue(); // 값을 가져온다.
         LocalDate localDate = datePicker.getValue();
         String localDateDate = localDate.toString(); // 문자열로 출력.
         textArea.setText(titleData+"\n"+passwordData+"\n"+comboBoxData+"\n"+localDateDate);
   });
}
   public void handlerButtonExitAction(ActionEvent e) {
      textArea.setText(null);
      System.exit(0);
      
   }
}