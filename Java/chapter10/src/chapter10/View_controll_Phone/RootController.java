package chapter10.View_controll_Phone;

import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.text.DefaultEditorKit.InsertBreakAction;

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
	@FXML private ListView<String> listView;
	@FXML private TableView<Phone> tableView;
	@FXML private ImageView imageView;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		insertListViewItemAndEventProcess();
		insertTableViewItemAndEventProcess();
	}
		
		private void insertTableViewItemAndEventProcess() {
			   ObservableList<Phone> tableViewData=FXCollections.observableArrayList(); 
			   tableViewData.add(new Phone("������S1", "phone01.png"));
			   tableViewData.add(new Phone("������S2", "phone02.png"));
			   tableViewData.add(new Phone("������S3", "phone03.png"));
			   tableViewData.add(new Phone("������S4", "phone04.png"));
			   tableViewData.add(new Phone("������S5", "phone05.png"));
			   tableViewData.add(new Phone("������S6", "phone06.png"));
			   tableViewData.add(new Phone("������S7", "phone07.png"));
			   TableColumn tcSmartPhone=tableView.getColumns().get(0);	   
			    tcSmartPhone.setCellValueFactory(new PropertyValueFactory("amartPhone"));
			    tcSmartPhone.setStyle("-fx-aligment: CENTER");
			    
			    TableColumn tcImage=tableView.getColumns().get(1);	   
			    tcImage.setCellValueFactory(new PropertyValueFactory("image"));
			    tcImage.setStyle("-fx-aligment: CENTER");
			    tableView.setItems(tableViewData);
				tableView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Phone>() {

					@Override
					public void changed(ObservableValue<? extends Phone> observable, Phone oldValue, Phone newValue) {
						Image imageData=new Image(getClass().getResource("images/"+newValue.getImage()).toString());
						imageView.setImage(imageData);			
					}
				});
				}
			private void insertListViewItemAndEventProcess() {
				 ObservableList<String> listViewData=FXCollections.observableArrayList();
				 listViewData.add("������S1");		 listViewData.add("������S2");
				 listViewData.add("������S3");		 listViewData.add("������S4");
				 listViewData.add("������S5");		 listViewData.add("������S6");
				 listViewData.add("������S7");
				 listView.setItems(listViewData);
				 listView.setStyle("-fx-aligment: CENTER");
				 
				 listView.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {

						@Override
						public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
							tableView.getSelectionModel().select(newValue.intValue());
							tableView.scrollTo(newValue.intValue());
						}
					});		
			}
			public void handlerButtonOk(ActionEvent e) {
				String data=listView.getSelectionModel().getSelectedItem();
				System.out.println("���õ� ����Ʈ�� ����Ʈ�� = "+data);
				Phone phone=tableView.getSelectionModel().getSelectedItem();
				System.out.println("���õ� ���̺���"+phone.toString());
			}
			public void handlerButtonExit(ActionEvent e) {
			}
}

