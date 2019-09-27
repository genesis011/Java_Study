package chapter10.View_controll_Test;

import java.net.URL;
import java.util.ResourceBundle;

import chapter10.View_controll.Phone;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class RootController implements Initializable {
	@FXML ListView<String> listView;
	@FXML private TableView<Phone> tableView;
	@FXML private ImageView imageView;
	
	//1. �������� (����Ʈ��, ���̺��, �̹�����)
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	   //1. ����Ʈ�並 �׸��� �����ϰ� ������Ƽ �̺�Ʈó���Ѵ�.
	   insertListViewItemAndEventProcess();
	   //2. ���̺�並 �׸��� �����ϰ� ���̺��÷� �����ϰ�, ������Ƽ �̺�Ʈó���Ѵ�.
	   insertTableViewItemAndEventProcess();
	   
	} //end initialize
	private void insertTableViewItemAndEventProcess() {
	   ObservableList<Phone> tableViewData=FXCollections.observableArrayList();// ��ü�� ���Ѵ�. 
	   //2. tableViewData��(���̺��) new Phone("S1","phone01.png") �߰��Ѵ�
	   tableViewData.add(new Phone("������S1", "phone01.png"));
	   tableViewData.add(new Phone("������S2", "phone02.png"));
	   tableViewData.add(new Phone("������S3", "phone03.png"));
	   tableViewData.add(new Phone("������S4", "phone04.png"));
	   tableViewData.add(new Phone("������S5", "phone05.png"));
	   tableViewData.add(new Phone("������S6", "phone06.png"));
	   tableViewData.add(new Phone("������S7", "phone07.png"));
	   //3. �� ���̺��÷��� PhoneŬ���� ����̸��� �����Ѵ�.
	   // TableColumn tcSmartPhone=tableView.getColumns().get(0);
	   TableColumn tcSmartPhone=tableView.getColumns().get(0);	   
	    tcSmartPhone.setCellValueFactory(new PropertyValueFactory("amartPhone"));
	    tcSmartPhone.setStyle("-fx-aligment: CENTER");
	    
	    // TableColumn tcSmartPhone=tableView.getColumns().get(0);
	    TableColumn tcImage=tableView.getColumns().get(1);	   
	    tcImage.setCellValueFactory(new PropertyValueFactory("image"));
	    tcImage.setStyle("-fx-aligment: CENTER");
	   //4. ���̺�信 tableViewData�� �߰��Ѵ�.
	    tableView.setItems(tableViewData);
		tableView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Phone>() {

			//5. ���̺�信 �̺�Ʈó���Ѵ�. (��Ʈ: getSelectionModel())
			@Override
			public void changed(ObservableValue<? extends Phone> observable, Phone oldValue, Phone newValue) {
				//5.1  ���õ� phone��ü���� getImage �̸��� �����ͼ� imageView�� ����
				Image imageData=new Image(getClass().getResource("images/"+newValue.getImage()).toString());
				imageView.setImage(imageData);			
			}
		});
		}
	   //��Ų��. 
	private void insertListViewItemAndEventProcess() {
		//1. ObservableList<String>  listViewData ��ü�� ���Ѵ�.
		 ObservableList<String> listViewData=FXCollections.observableArrayList();
		 //2. listViewData��(����Ʈ��) ������S1 ~ ������S7  �߰��Ѵ�		 
		 listViewData.add("������S1");		 listViewData.add("������S2");
		 listViewData.add("������S3");		 listViewData.add("������S4");
		 listViewData.add("������S5");		 listViewData.add("������S6");
		 listViewData.add("������S7");
		 //3. ����Ʈ�信 listViewData�� �߰��Ѵ�.		 
		 listView.setItems(listViewData);
		 listView.setStyle("-fx-aligment: CENTER");
		 
		 listView.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {

				@Override
				public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
					//4. ����Ʈ�信 �̺�Ʈó���Ѵ�. (��Ʈ: getSelectionModel())
					//4.1 ���̺�� ��ġ�� �ο��Ѵ�. �����Ѵ�.
					tableView.getSelectionModel().select(newValue.intValue());
					//4.2 ���̺�� scrollTo(��ġ)�����Ѵ�.
					tableView.scrollTo(newValue.intValue());
				}
			});		
	}
	public void handlerButtonOKAction(ActionEvent e) {
	   //1. ���õ� ����Ʈ�並 �����ͼ�. getSelectionModel() ����Ѵ�.
		String data=listView.getSelectionModel().getSelectedItem();
		System.out.println("���õ� ����Ʈ�� ����Ʈ�� = "+data);
		//2. ���õ� ���̺�並 �����ͼ�  getSelectionModel() ����Ѵ�.
		Phone phone=tableView.getSelectionModel().getSelectedItem();
		System.out.println("���õ� ���̺���"+phone.toString());
	}
	public void handlerButtonExitAction(ActionEvent e) {
	   //1. ����â�� �ݴ´�. 
	}
}
