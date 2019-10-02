package chapter10.Dialog3;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Modality;
import javafx.stage.Popup;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class RootController extends Object implements Initializable {
	public Stage primaryStage;
@FXML private HBox hBox;
@FXML	private Button buttonDis2;
	private String string="ȭ����";

//1. ���������� ������ ���� �̴ϼȶ������ ������ϸ� �ȵȴ�(�� : �������� ����.)
//2. ���������� ������ ���� �̴ϼȶ���� �� �ٸ� �ڵ鷯 �Լ����� �����ϴ�(�� : ���������� �����ϴϱ�)

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		buttonDis2.setOnAction((e2) -> {
			handleButtonLoginAction(e2);
		});
		
	}//end of initialize

	public void handlleOpenFileChooser(ActionEvent e) {
//		1.���� ������ �θ���.(��������, ��, ��Ʈ �����Ǿ�����)
		FileChooser fileChooser = new FileChooser();
		fileChooser.getExtensionFilters().addAll(
				new ExtensionFilter("�ؽ�Ʈ ����", "*.txt"),
				new ExtensionFilter("�̹��� ����", "*.png", "*.jpg", "*.gif"),
				new ExtensionFilter("�ѱ� ����", "*.hwp"),
				new ExtensionFilter("��� ����", "*.*")
				);
//		2. ���� ���������� �Ҵ��ؾ� �ȴ�(�����������������Ҵ�)
		File file = fileChooser.showOpenDialog(AppMain.primarySStage);
		if(file != null) {
			System.out.println(file.getPath());
		}
	}
	public void handlleSaveFileChooser(ActionEvent e) {
		FileChooser fileChooser = new FileChooser();
		fileChooser.getExtensionFilters().addAll(				
				new ExtensionFilter("��� ����", "*.*")
				);
		File file = fileChooser.showSaveDialog(primaryStage);
		if(file != null) {
			System.out.println(file.getPath());
		}
	}
	public void handlleDirectoryFileChooser(ActionEvent e) {
		DirectoryChooser directoryChooser = new DirectoryChooser();
		File file = directoryChooser.showDialog(primaryStage);
		if(file != null) {
			System.out.println(file.getPath());
		}
	}
	public void handllePapupFileChooser(ActionEvent e) {
		Popup popup=new Popup();//�������� ��Ʈ�����̳ʰ� ����.
		HBox hbox=null;
		try {
			hbox=FXMLLoader.load(getClass().getResource("popup.fxml"));
//			UI��ü�� ã�Ƽ� �����Ű�� ��� 
			ImageView imgageView=(ImageView) hbox.lookup("#imageView");// ���̵� ã�� ���
			Label label=(Label) hbox.lookup("#label");// ���̵� ã�� ���
			label.setText(string);
			imgageView.setOnMouseClicked(new EventHandler<Event>() {

				@Override
				public void handle(Event event) {
					popup.hide();
					
				}
			});
			popup.getContent().add(hbox); //���� ��Ʈ�����̳ʸ� �ִ´�.
//			�˾�â�� ������� �ϴ� ���
			popup.setAutoHide(true);
			popup.show(this.hBox.getScene().getWindow());
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
	}
	public void handlleCustomFileChooser(ActionEvent e) throws IOException {
		Stage stage=new Stage(StageStyle.UTILITY);
		stage.initModality(Modality.WINDOW_MODAL);
		stage.initOwner(hBox.getScene().getWindow());
		stage.setTitle("���� â");
		stage.setResizable(false);
		AnchorPane anchorPane=FXMLLoader.load(getClass().getResource("custom_dialog.fxml"));
		TextField textFildKOR=(TextField) anchorPane.lookup("#textFildKOR");
		TextField textFildENG=(TextField) anchorPane.lookup("#textFildENG");
		TextField textFildMUS=(TextField) anchorPane.lookup("#textFildMUS");
		TextField textFildTotal=(TextField) anchorPane.lookup("#textFildTotal");
		TextField textFildAverage=(TextField) anchorPane.lookup("#textFildAverage");
		Button buttonOK=(Button) anchorPane.lookup("#buttonOK");
		Button buttonClear=(Button) anchorPane.lookup("#buttonClear");
		Button buttonAverage=(Button) anchorPane.lookup("#buttonAverage");
	}


		
		
	private void handleButtonLoginAction(ActionEvent e) {
		StackPane stackPane = null;
		AnchorPane anchorPane = null;
		try {
			stackPane = (StackPane) buttonDis2.getScene().getRoot();
			anchorPane = FXMLLoader.load(getClass().getResource("custom_dialog.fxml"));
			stackPane.getChildren().add(anchorPane);
		} catch (IOException e2) {
			e2.printStackTrace();
		}
}
}
