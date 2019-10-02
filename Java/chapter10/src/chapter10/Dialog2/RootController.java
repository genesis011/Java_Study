package chapter10.Dialog2;

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
	private String string="화이팅";

//1. 스테이지를 잠조할 때는 이니셜라이즈에서 절대로하면 안된다(왜 : 스테이지 없다.)
//2. 스테이지를 참조할 때는 이니셜라이즈를 뺀 다른 핸들러 함수에서 가능하다(왜 : 스테이지에 존재하니까)

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
//		각파일열기 다이얼로그창 활성화하기
//		Stage stage=(Stage)hBox.getScene().getWindow();//가져올 수 없음
//		System.out.println("Stage="+stage);
		
	}//end of initialize
//	파일 열기 다이얼로그 창 활성화하기
	public void handlleOpenFileChooser(ActionEvent e) {
//		1.파일 추져를 부른다.(스테이지, 씬, 루트 구성되어있음)
		FileChooser fileChooser = new FileChooser();
		fileChooser.getExtensionFilters().addAll(
				new ExtensionFilter("텍스트 파일", "*.txt"),
				new ExtensionFilter("이미지 파일", "*.png", "*.jpg", "*.gif"),
				new ExtensionFilter("한글 파일", "*.hwp"),
				new ExtensionFilter("모든 파일", "*.*")
				);
//		2. 주인 스테이지를 할당해야 된다(파일추져스테이지할당)
		File file = fileChooser.showOpenDialog(AppMain.primarySStage);
		if(file != null) {
			System.out.println(file.getPath());
		}
	}
//	파일 열기 다이얼로그 창 활성화하기
	public void handlleSaveFileChooser(ActionEvent e) {
//		1.파일 추져를 부른다.(스테이지, 씬, 루트 구성되어있음)
		FileChooser fileChooser = new FileChooser();
		fileChooser.getExtensionFilters().addAll(				
				new ExtensionFilter("모든 파일", "*.*")
				);
		File file = fileChooser.showSaveDialog(primaryStage);
		if(file != null) {
			System.out.println(file.getPath());
		}
	}
//	디렉토리 정보를 가져오는 다이얼로그창 블러오기
	public void handlleDirectoryFileChooser(ActionEvent e) {
		DirectoryChooser directoryChooser = new DirectoryChooser();
		File file = directoryChooser.showDialog(primaryStage);
		if(file != null) {
			System.out.println(file.getPath());
		}
	}
//	팝업창을 불러서 가져오기		
	public void handllePapupFileChooser(ActionEvent e) {
//		두번째 방법 사용하기
		Popup popup=new Popup();//스테이지 루트컨테이너가 없다.
//		popup.fxml 루트컨테이너를 만들었고 가져온다.
		HBox hbox=null;
		try {
			hbox=FXMLLoader.load(getClass().getResource("popup.fxml"));
//			UI객체를 찾아서 저장시키는 방법 
			ImageView imgageView=(ImageView) hbox.lookup("#imageView");// 아이디를 찾는 방법
			Label label=(Label) hbox.lookup("#label");// 아이디를 찾는 방법
			label.setText(string);
			imgageView.setOnMouseClicked(new EventHandler<Event>() {

				@Override
				public void handle(Event event) {
					popup.hide();
					
				}
			});
			popup.getContent().add(hbox); //씬에 루트컨테이너를 넣는다.
//			팝업창을 사라지게 하는 방법
			popup.setAutoHide(true);
			popup.show(this.hBox.getScene().getWindow());
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
	}
//	사용자 정의하기 창 가져오기
	public void handlleCustomFileChooser(ActionEvent e) throws IOException {
		Stage stage=new Stage(StageStyle.UTILITY);
		stage.initModality(Modality.WINDOW_MODAL);
		stage.initOwner(hBox.getScene().getWindow());
		stage.setTitle("나의 창");
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
		
		buttonOK.setOnAction((e1)->{
			int sum=Integer.parseInt(textFildENG.getText())+Integer.parseInt(textFildKOR.getText())+Integer.parseInt(textFildMUS.getText());	
			textFildTotal.setText(String.valueOf(sum));
			
			
		});
		
		buttonClear.setOnAction((e1)->{
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
		
		Scene scene=new Scene(anchorPane);
		stage.setScene(scene);
		stage.show();
	}
	
}
