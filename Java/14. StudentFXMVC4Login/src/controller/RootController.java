package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import model.Student;
import model.StudentVO;

public class RootController extends Object implements Initializable {
	@FXML private TextField txtName;	
	@FXML private TextField txtLevel;
	@FXML private TextField txtBan;	
	@FXML private TextField txtKo;
	@FXML private TextField txtEng;	
	@FXML private TextField txtMath;
	@FXML private TextField txtSic;	
	@FXML private TextField txtSoc;
	@FXML private TextField txtMusic;	
	@FXML private TextField txtTotal;
	@FXML private TextField txtAvg;	
	@FXML private Button buttonTotal;
	@FXML private Button buttonAvg;	
	@FXML private Button buttonInit;
	@FXML private Button buttonOk;	
	@FXML private Button buttonExit;
	@FXML private Button btnTotalList;	//��ü
	@FXML private ToggleGroup genderGroup;
	@FXML private RadioButton rbMale;
	@FXML private RadioButton rbFemale;
	@FXML private TextField txtSearch;//	�˻���� �߰�
	@FXML private Button buttonSearch;//�˻���� �߰�
	@FXML private Button buttonDelete;//����, ������ư �߰�
	@FXML private Button buttonEdit; //������ư
	boolean editDelete = false;//	������ �� ��ư����
	@FXML private Button buttonSujeng;
	
//	���̺�並 �������� �� ��ġ���� ��ü���� ������ �� �ִ� ���� ����
	private int selectedIndex;
	private ObservableList<Student> selectedStudent;
	
	@FXML private ComboBox<String> comboBoxYear;
	@FXML private TableView<Student> tableView = new TableView<>();
	ObservableList<Student>data=null;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
//		1. ��ư �ʱ�ȭ(����, ���X,�ʱ�ȭ,���X,����)		
		buttonInitSetting(false,true,false,true,false,true,true);
		
//		1.2 �޺��ڽ� �ʱ�ȭ
		ObservableList<String>comboBoxList=FXCollections.observableArrayList();
//		comboBoxList.add("1");		
//		comboBoxList.add("2");		
//		comboBoxList.add("3");
//		comboBoxList.add("4");		
//		comboBoxList.add("5");		
//		comboBoxList.add("6");
		comboBoxYear.setItems(FXCollections.observableArrayList("1", "2", "3", "4", "5", "6"));
		
//		2. ���̺� �������
		tableViewSetting();
		txtName.setText("aaa");
//		txtLevel.setText("2");
		comboBoxYear.setPromptText("");		txtBan.setText("3");		rbFemale.setSelected(false);			txtKo.setText("23");
		txtEng.setText("23");			txtMath.setText("23");				txtSic.setText("23");		txtSoc.setText("23");
		txtMusic.setText("23");//		txtTotal.setText("");//		txtAvg.setText("");
		
//		3. ���� ��ư�� ������ �� ��չ�ư Ȱ��ȭ �� 6�� �� ������ ���ؼ� ���� �ʵ忡 ����ִ´�.		
		buttonTotal.setOnAction((e)-> {handlerButtonTotalAction(e);});
		
//		4. ��� ��ư�� ������ �� ��հ�� ������ư��Ȱ��, ��չ�ư ��Ȱ��, ���Ȱ��ȭ, ����ؽ�Ʈ�ʵ� ��Ȱ��ȭ
		buttonAvg.setOnAction((e)-> {handlerButtonAvgAction(e);});	
		
//		5.�ʱ�ȭ ��ư�� ������ �� 1�� ��ư�ʱ�ȭ, �ؽ�Ʈ�ʵ� ��� Ȱ��ȭ �� ��
		buttonInit.setOnAction((e)-> {handlerButtonInitAction(e);});
		
//		6. ��Ϲ�ư�� ������ �� ���̺� ����ϰ�, ��簪�� �ʱ�ȭ�Ѵ�.
		buttonOk.setOnAction((e)-> {handlerButtonOkAction(e);});
		
//		7.�˻� ��ư�� ������ �� ���̺�信�� ã����		
		buttonSearch.setOnAction((e)-> {handlerButtonSearchAction(e);});
		
//		8. ������ư�� ������ �� ���̺�信�� �������		
		buttonDelete.setOnAction((e)-> {handlerButtonDeleteAction(e);});
		
//		9. ���̺�信�� ������ �� �̺�Ʈó�����		
		tableView.setOnMousePressed(e->{handlerTableViewPressedAction(e);});
		
//		10. ������ư�� ������ �� �̺�Ʈ ó�����
		buttonEdit.setOnAction((e)-> {handlerButtonDeleteAction(e);});
		
//		11. �����ư�� ������ �� �̺�Ʈó�����		
		buttonExit.setOnAction((e)-> {Platform.exit();});	
	}


	public void buttonInitSetting(boolean b, boolean c, boolean d, boolean e, boolean f,boolean g,boolean h) {
		buttonTotal.setDisable(b);		
		buttonAvg.setDisable(c);		
		buttonInit.setDisable(d);		
		buttonOk.setDisable(e);
		buttonExit.setDisable(f);			
		buttonEdit.setDisable(g);
		buttonDelete.setDisable(h);
	}
	private void alertDisplay(int type, String title, String headerText, String contentTest) {
		Alert alert = null;
		switch(type) {
		case 1: alert = new Alert(AlertType.WARNING); break;
		case 2: alert = new Alert(AlertType.CONFIRMATION); break;
		case 3: alert = new Alert(AlertType.ERROR); break;
		case 4: alert = new Alert(AlertType.NONE); break;
		case 5: alert = new Alert(AlertType.INFORMATION); break;
		}
		alert.setTitle(title);		
		alert.setHeaderText(headerText);
		alert.setContentText(headerText+"\n"+contentTest);
		alert.setResizable(false);		
		alert.showAndWait();
	}
	public void tableViewSetting() {
		data=FXCollections.observableArrayList();
//		3. ���̺� �������� ���̺� �並 �������ϰ� ����
		tableView.setEditable(false);
//		���̺� ���� �÷� ����
		TableColumn colNo=new TableColumn("NO");
		colNo.setMaxWidth(40);
		colNo.setStyle("-fx-alignment: CENTER;");
		colNo.setCellValueFactory(new PropertyValueFactory("no"));
		
		TableColumn colName=new TableColumn("����");
		colName.setMaxWidth(40);
		colName.setStyle("-fx-alignment: CENTER;");
		colName.setCellValueFactory(new PropertyValueFactory("name"));
		
		TableColumn colLevel=new TableColumn("�г�");
		colLevel.setMaxWidth(40);
		colLevel.setStyle("-fx-alignment: CENTER;");
		colLevel.setCellValueFactory(new PropertyValueFactory("level"));
		
		TableColumn colBan=new TableColumn("��");
		colBan.setMaxWidth(40);
		colBan.setStyle("-fx-alignment: CENTER;");
		colBan.setCellValueFactory(new PropertyValueFactory("ban"));
		
		TableColumn colGender=new TableColumn("����");
		colBan.setMaxWidth(30);
		colBan.setStyle("-fx-alignment: CENTER;");
		colBan.setCellValueFactory(new PropertyValueFactory("gender"));
		
		TableColumn colKorean=new TableColumn("����");
		colKorean.setMaxWidth(40);
		colKorean.setStyle("-fx-alignment: CENTER;");
		colKorean.setCellValueFactory(new PropertyValueFactory("korean"));
		
		TableColumn colEnglish=new TableColumn("����");
		colEnglish.setMaxWidth(40);
		colEnglish.setStyle("-fx-alignment: CENTER;");
		colEnglish.setCellValueFactory(new PropertyValueFactory("english"));
		
		TableColumn colMath=new TableColumn("����");
		colMath.setMaxWidth(40);
		colMath.setStyle("-fx-alignment: CENTER;");
		colMath.setCellValueFactory(new PropertyValueFactory("math"));
		
		TableColumn colSic=new TableColumn("����");
		colSic.setMaxWidth(40);
		colSic.setStyle("-fx-alignment: CENTER;");
		colSic.setCellValueFactory(new PropertyValueFactory("sic"));
		
		TableColumn colSoc=new TableColumn("��ȸ");
		colSoc.setMaxWidth(40);
		colSoc.setStyle("-fx-alignment: CENTER;");
		colSoc.setCellValueFactory(new PropertyValueFactory("soc"));
		
		TableColumn colMusic=new TableColumn("����");
		colMusic.setMaxWidth(40);
		colMusic.setStyle("-fx-alignment: CENTER;");
		colMusic.setCellValueFactory(new PropertyValueFactory("music"));
		
		TableColumn colTotal=new TableColumn("����");
		colTotal.setMaxWidth(40);
		colTotal.setStyle("-fx-alignment: CENTER;");
		colTotal.setCellValueFactory(new PropertyValueFactory("total"));
		
		TableColumn colAvg=new TableColumn("���");
		colAvg.setMaxWidth(40);
		colAvg.setStyle("-fx-alignment: CENTER;");
		colAvg.setCellValueFactory(new PropertyValueFactory("avg"));

//		2.���̺�� ���� �÷�Ʋ ��ü�� ���̺�信 �߰� �� �׸��߰�
		tableView.setItems(data);
		tableView.getColumns().addAll(colNo,colName,colLevel,colBan,
				colGender,colKorean,colEnglish,colMath,colSic,colSoc,
				colMusic,colTotal,  colAvg);
		
	}
//	1. ��ư �ʱ�ȭ (����, ���, �ʱ�ȭ, 

//	3. ���� ��ư�� ������ �� ��չ�ư Ȱ��ȭ �� 6�� �� ������ ���ؼ� ���� �ʵ忡 ����ִ´�.
	public void handlerButtonTotalAction(ActionEvent e) {
		try {
			int korean=Integer.parseInt(txtKo.getText());
		    int english = Integer.parseInt(txtEng.getText());
		    int math = Integer.parseInt(txtMath.getText());
		    int sic = Integer.parseInt(txtSic.getText());
		    int soc = Integer.parseInt(txtSoc.getText());
		    int music = Integer.parseInt(txtMusic.getText());
		    int total = korean + english + math + sic + soc + music;
		    txtTotal.setText(String.valueOf(total));
			buttonAvg.setDisable(false);
		} catch (Exception e2) {
			alertDisplay(1,"�հ� ����","������",e2.toString());
		}
	}
//	4. ��� ��ư�� ������ �� ��հ�� ������ư��Ȱ��, ��չ�ư ��Ȱ��, ���Ȱ��ȭ, ����ؽ�Ʈ�ʵ� ��Ȱ��ȭ
	public void handlerButtonAvgAction(ActionEvent e) {
		txtAvg.setText(String.valueOf(Integer.parseInt(txtTotal.getText())/6.0));
//		1. ��ư �ʱ�ȭ(����X, ���X,�ʱ�ȭ,���,����)
		buttonInitSetting(true,true,false,false,false,true,true);
//		2. �ؽ�Ʈ�ʵ� ��Ȱ��ȭ(�̸�x, �г�x, ��x, ����,����x, ����x, ����x, ����x, ��ȸx, ����x)
		txtFieldInitSetting(true,true,true,true,true,true,true,true,true,true);
	}
//	5.�ʱ�ȭ ��ư�� ������ �� 1�� ��ư�ʱ�ȭ, �ؽ�Ʈ�ʵ� ��� Ȱ��ȭ �� ��
	public void handlerButtonInitAction(ActionEvent e) {
//		1. ��ư �ʱ�ȭ(����, ���X,�ʱ�ȭ,���X,����)
		buttonInitSetting(false,true,false,true,false,true,true);
//		�ؽ�Ʈ�ʵ� ��� Ȱ��ȭ
//		2. �ؽ�Ʈ�ʵ� ��Ȱ��ȭ(�̸�, �г�, ��,����, ����, ����, ����, ����, ��ȸ, ����)
		txtFieldInitSetting(false,false,false,false,false,false,false,false,false,false);
//		��� �� �ʱ�ȭ
		txtName.clear();		
		txtLevel.clear();		
		txtBan.clear();		
		txtKo.clear();
		txtEng.clear();		
		txtMath.clear();		
		txtSic.clear();		
		txtSoc.clear();
		txtMusic.clear();		
		txtTotal.clear();		
		txtAvg.clear();
	}
//	6. ��Ϲ�ư�� ������ �� ���̺� ����ϰ�, ��簪�� �ʱ�ȭ�Ѵ�.
	public void handlerButtonOkAction(ActionEvent e) {
//		������ ����� �ִ��� Ȯ���Ѵ�.
		try {
			if(txtTotal.getText().equals("") || txtAvg.getText().equals("")) {
				throw new Exception(); //11111
			} else {
				StudentVO student = new StudentVO(txtName.getText(),
						comboBoxYear.getSelectionModel().getSelectedItem(), 
						txtBan.getText(),
						genderGroup.getSelectedToggle().getUserData().toString(),
						Integer.parseInt(txtKo.getText().trim()), 
						Integer.parseInt(txtEng.getText().trim()),
						Integer.parseInt(txtMath.getText().trim()), 
						Integer.parseInt(txtSic.getText().trim()), 
						Integer.parseInt(txtSoc.getText().trim()), 
						Integer.parseInt(txtMusic.getText().trim()), 
						Integer.parseInt(txtTotal.getText().trim()), 
						Double.parseDouble(txtAvg.getText().trim()));
//				���̺�信 �̵̹� ����
				if(editDelete==true) {
					data.remove(selectedIndex);
					data.add(selectedIndex, student);
					editDelete=false;
				}else {
					data.add(student);
				}
				data.add(student);
				alertDisplay(3,"��� ����","���̺��� ����","��ī��ī.."); //11111
			}
		} catch (Exception e2) {
			alertDisplay(1,"��� ����","�԰�,�������� �Է¿��","��������"); //11111
			return;
		}
//		5.�ʱ�ȭ ��ư�� ������ �� 1�� ��ư�ʱ�ȭ, �ؽ�Ʈ�ʵ� ��� Ȱ��ȭ �� ��
		handlerButtonInitAction(e);
	}
//	7.�˻� ��ư�� ������ �� ���̺�信�� ã����
	private void handlerButtonSearchAction(ActionEvent e) {
			for(Student student : data) {
				if(txtSearch.getText().equals(student.getName())) {
					tableView.getSelectionModel().select(student);
					return;
				}
			}	
			alertDisplay(1,"�˻����","�̸��˻� ����","�̸��� ��Ȯ�ϰ� �Է��Ͻÿ�");
	}
//	8. ������ư�� ������ �� ���̺�信�� �������
	private void handlerButtonDeleteAction(ActionEvent e) {
		alertDisplay(2,"�������","�������","���� �����Ͻðڽ��ϱ�?");
		data.remove(selectedIndex);		
	}
//	9. ���̺�信�� ������ �� �̺�Ʈó�����
	private void handlerTableViewPressedAction(MouseEvent e) {
//	������ �� ��ġ�� �ش�� ��ü�� �����´�.
		editDelete=true;
//		1. ��ư �ʱ�ȭ(����, ���X,�ʱ�ȭ,���X,����)		
		buttonInitSetting(true,true,true,true,false,true,true);
		selectedIndex=tableView.getSelectionModel().getSelectedIndex();
		selectedStudent=tableView.getSelectionModel().getSelectedItems();
//		������ �� ���̺� �ִ� ���� �����ͼ� ������ �ʵ忡 ����ִ´�.
		txtName.setText(selectedStudent.get(0).getName());
		comboBoxYear.setValue(selectedStudent.get(0).getLevel());
		txtBan.setText(selectedStudent.get(0).getBan());
		if(selectedStudent.get(0).getGender().equals("����")) {
			rbMale.setSelected(true);
			rbFemale.setSelected(false);
		}else {
			rbMale.setSelected(false);
			rbFemale.setSelected(true);
		}
		txtKo.setText(selectedStudent.get(0).getKorean());
		txtEng.setText(selectedStudent.get(0).getEnglish());
		txtMath.setText(selectedStudent.get(0).getMath());
		txtSic.setText(selectedStudent.get(0).getSic());
		txtSoc.setText(selectedStudent.get(0).getSoc());
		txtMusic.setText(selectedStudent.get(0).getMusic());
		txtTotal.setText(selectedStudent.get(0).getTotal());
		txtAvg.setText(selectedStudent.get(0).getAvg());
//		2. �ؽ�Ʈ�ʵ� ��Ȱ��ȭ(�̸�x, �г�x, ��x,����x, ����x, ����x, ����x, ����x, ��ȸx, ����x)
		txtFieldInitSetting(true,true,true,true,true,true,true,true,true,true);
	}
//	10. ������ư�� ������ �� �̺�Ʈ ó�����
	private void handlerButtonEditAction(ActionEvent e) {
//		1. ��ư �ʱ�ȭ(����, ���X,�ʱ�ȭ,���X,����)		
		buttonInitSetting(false,true,false,true,false,true,true);
//		2. ������ư, ������ư ��Ȱ��ȭ
		txtFieldInitSetting(false,false,false,false,false,false,false,false,false,false);
	}
	
	public void handlerButtonExitAction(ActionEvent e) {
		
	}	
	public void handlerBtnAvgActoion(ActionEvent e){
		
	}
	private void txtFieldInitSetting(boolean b, boolean c, boolean d,boolean k, boolean e, boolean f, boolean g, boolean h, boolean i,
			boolean j) {
		txtName.setDisable(b);		
		comboBoxYear.setDisable(c);	
		//txtLevel.setDisable(c);
		txtBan.setDisable(d);
		rbMale.setDisable(k);
		rbFemale.setDisable(k);
		txtKo.setDisable(e);		
		txtEng.setDisable(f);
		txtMath.setDisable(g);		
		txtSic.setDisable(h);		
		txtSoc.setDisable(i);
		txtMusic.setDisable(j);
	}
}
 