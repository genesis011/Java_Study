package chapter10.View_controll_Test2;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;

public class RootController implements Initializable {
	@FXML private ListView<String> listView;
	@FXML private TableView<Phone> tableView;
	@FXML private ImageView imageView;

	public void initialize(URL arg0, ResourceBundle arg1) {
//		1. 변수선언
	}
	private void insertListViewItemAndEventProcess() {
//		옵저버블리스트<S>리스트데이타=FX컬렉션스.옵저버블리스트();
		//1. ObservableList<String>  listViewData 객체를 구한다.
		ObservableList<String> listViewData = FXCollections.observableArrayList();
		//2. listViewData에(리스트뷰) 갤럭시S1 ~ 갤럭시S7  추가한다
		
	}
}
