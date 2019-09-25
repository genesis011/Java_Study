package chapter10.cicle_bind;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;

public class RootController implements Initializable {
	@FXML private AnchorPane ancDe;
	@FXML private Circle circle;
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
//		circle.setCenterX(ancDe.getWidth()/2);
//		circle.setCenterY(ancDe.getHeight()/2);
		circle.centerXProperty().bind(Bindings.divide(ancDe.widthProperty(), 2));;
		circle.centerYProperty().bind(Bindings.divide(ancDe.heightProperty(), 2));;
	}
}
