package chapter10.button_tol;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class RootController implements Initializable {
	@FXML	private CheckBox checkClasses;
	@FXML	private CheckBox checkCap;
	@FXML	private ImageView imageCheck;
	@FXML	private RadioButton checkbubble;
	@FXML	private RadioButton checkBar;
	@FXML	private RadioButton checkArea;
	@FXML	private ImageView checkImage;
	@FXML	private ImageView checkButton;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

	}

	public void handdlerButtonExitAction(ActionEvent e) {
		Platform.exit();
	}

	public void handdlerChecBoxAction(ActionEvent e) {
		if (checkClasses.isSelected() && checkCap.isSelected()) {
			imageCheck.setImage(new Image(getClass().getResource("images/geek-glasses-hair.gif").toString()));
		} else if (checkClasses.isSelected()) {

			imageCheck.setImage(new Image(getClass().getResource("images/geek-glasses.gif").toString()));
		} else if (checkCap.isSelected()) {
			imageCheck.setImage(new Image(getClass().getResource("images/geek-hair.gif").toString()));

		} else {
			imageCheck.setImage(new Image(getClass().getResource("images/geek.gif").toString()));
		} // end HanddlerCheckBox
	}
}