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
//		1. ��������
	}
	private void insertListViewItemAndEventProcess() {
//		����������Ʈ<S>����Ʈ����Ÿ=FX�÷��ǽ�.����������Ʈ();
		//1. ObservableList<String>  listViewData ��ü�� ���Ѵ�.
		ObservableList<String> listViewData = FXCollections.observableArrayList();
		//2. listViewData��(����Ʈ��) ������S1 ~ ������S7  �߰��Ѵ�
		
	}
}
