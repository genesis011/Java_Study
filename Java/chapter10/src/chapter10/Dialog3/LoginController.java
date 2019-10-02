package chapter10.Dialog3;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;



public class LoginController extends Object implements Initializable {
	@FXML private Button buttonDis1;
	@FXML private AnchorPane anchorPaneRoot;
	@FXML private Button buttonok;
	@FXML private Button buttonclose;
	@FXML private TextField textFildKOR;
	@FXML private TextField textFildMUS;
	@FXML private TextField textFildENG;
	@FXML private TextField textFildTotal;
	@FXML private TextField textFildAverage;
	@FXML private Button buttonAverage;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		buttonDis1.setOnAction((e)-> {
			handleButtonMainAction(e);
	});
		buttonok.setOnAction((e1)->{
			int sum=Integer.parseInt(textFildENG.getText())+Integer.parseInt(textFildKOR.getText())+Integer.parseInt(textFildMUS.getText());	
			textFildTotal.setText(String.valueOf(sum));
			
			
		});
		
		buttonclose.setOnAction((e1)->{
			textFildENG.setText("0");
			textFildKOR.setText("0");
			textFildMUS.setText("0");		
			textFildTotal.setText("0");		
			textFildAverage.setText("0");		
		});
		
		buttonAverage.setOnAction((e1)->{
			int sum=Integer.parseInt(textFildENG.getText())+Integer.parseInt(textFildKOR.getText())+Integer.parseInt(textFildMUS.getText());	
			textFildAverage.setText(String.valueOf(sum/3));
		});
	
		
	}

	private void handleButtonMainAction(ActionEvent e) {
		StackPane stackPane=(StackPane) buttonDis1.getScene().getRoot();
		stackPane.getChildren().remove(anchorPaneRoot);
	}
}
