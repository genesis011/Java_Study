package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javax.security.auth.Subject;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Student;


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
	@FXML private TableView<Student> tableView = new TableView<>();
	ObservableList<Student>data=null;

	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
//		1. 버튼 초기화(총점, 평균X,초기화,등록X,종료)
		buttonInitSetting(false,true,false,true,false);
//		2. 테이블 설정기능
		tableViewSetting();
//		3. 총점 버튼을 눌렀을 때 평균버튼 활성화 및 6개 값 총점을 구해서 총점 필드에 적어넣는다.
		
		buttonTotal.setOnAction((e)-> {handlerButtonTotalAction(e);});
//		4. 평균 버튼을 눌렀을 때 평균계산 총점버튼비활성, 평균버튼 비활성, 등록활성화, 모든텍스트필드 비활성화
		buttonAvg.setOnAction((e)-> {handlerButtonAvgAction(e);});
		
		
//		5.초기화 버튼을 눌렀을 때 1번 버튼초기화, 텍스트필드 모두 활성화 할 것
		buttonInit.setOnAction((e)-> {handlerButtonInitAction(e);});
//		6. 등록버튼을 눌렀을 때 테이블에 등록하고, 모든값을 초기화한다.
		buttonOk.setOnAction((e)-> {handlerButtonOkAction(e);});
//		7.
		buttonExit.setOnAction((e)-> {handlerButtonExitAction(e);});
//		테스팅을 위한 디버깅	
		txtName.setText("aaa");
		txtLevel.setText("2");
		txtBan.setText("3");
		txtKo.setText("23");
		txtEng.setText("23");
		txtMath.setText("23");
		txtSic.setText("23");
		txtSoc.setText("23");
		txtMusic.setText("23");
//		txtTotal.setText("");
//		txtAvg.setText("");
	}
	public void buttonInitSetting(boolean b, boolean c, boolean d, boolean e, boolean f) {
		buttonTotal.setDisable(b);
		buttonAvg.setDisable(c);
		buttonInit.setDisable(d);
		buttonOk.setDisable(e);
		buttonExit.setDisable(f);		
		txtTotal.setDisable(true);
		txtAvg.setDisable(true);
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
		ObservableList<Student>data=FXCollections.observableArrayList();
//		3. 테이블 설정에서 테이블 뷰를 편집못하게 설정
		tableView.setEditable(false);
//		테이블 절정 컬럼 셋팅
		TableColumn colName=new TableColumn("성명");
		colName.setMaxWidth(70);
		colName.setStyle("-fx-alignment: CENTER;");
		colName.setCellValueFactory(new PropertyValueFactory("name"));
		
		TableColumn colLevel=new TableColumn("학년");
		colLevel.setMaxWidth(40);
		colLevel.setStyle("-fx-alignment: CENTER;");
		colLevel.setCellValueFactory(new PropertyValueFactory("leve"));
		
		TableColumn colBan=new TableColumn("반");
		colBan.setMaxWidth(40);
		colBan.setStyle("-fx-alignment: CENTER;");
		colBan.setCellValueFactory(new PropertyValueFactory("ban"));
		
		TableColumn colKorean=new TableColumn("국어");
		colKorean.setMaxWidth(40);
		colKorean.setStyle("-fx-alignment: CENTER;");
		colKorean.setCellValueFactory(new PropertyValueFactory("korean"));
		
		TableColumn colEnglish=new TableColumn("영어");
		colEnglish.setMaxWidth(40);
		colEnglish.setStyle("-fx-alignment: CENTER;");
		colEnglish.setCellValueFactory(new PropertyValueFactory("english"));
		
		TableColumn colMath=new TableColumn("수학");
		colMath.setMaxWidth(40);
		colMath.setStyle("-fx-alignment: CENTER;");
		colMath.setCellValueFactory(new PropertyValueFactory("math"));
		
		TableColumn colSic=new TableColumn("과학");
		colSic.setMaxWidth(40);
		colSic.setStyle("-fx-alignment: CENTER;");
		colSic.setCellValueFactory(new PropertyValueFactory("sic"));
		
		TableColumn colSoc=new TableColumn("사회");
		colSoc.setMaxWidth(40);
		colSoc.setStyle("-fx-alignment: CENTER;");
		colSoc.setCellValueFactory(new PropertyValueFactory("soc"));
		
		TableColumn colMusic=new TableColumn("음악");
		colMusic.setMaxWidth(40);
		colMusic.setStyle("-fx-alignment: CENTER;");
		colMusic.setCellValueFactory(new PropertyValueFactory("music"));
		
		TableColumn colTotal=new TableColumn("총점");
		colTotal.setMaxWidth(40);
		colTotal.setStyle("-fx-alignment: CENTER;");
		colTotal.setCellValueFactory(new PropertyValueFactory("total"));
		
		TableColumn colAvg=new TableColumn("평균");
		colAvg.setMaxWidth(40);
		colAvg.setStyle("-fx-alignment: CENTER;");
		colAvg.setCellValueFactory(new PropertyValueFactory("avg"));

//		2.테이블뷰 설정 컬럼틀 객체를 테이블뷰에 추가 및 항목추가
		tableView.setItems(data);
		tableView.getColumns().addAll(colName,colLevel,colBan,colKorean,colEnglish,colMath,colSic,colSoc,colMusic,colTotal,  colAvg);
		
	}
//	1. 버튼 초기화 (총점, 평균, 초기화, 

//	3. 총점 버튼을 눌렀을 때 평균버튼 활성화 및 6개 값 총점을 구해서 총점 필드에 적어넣는다.
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
			alertDisplay(1,"합계 실패","계산오류",e2.toString());
		}
	}
//	4. 평균 버튼을 눌렀을 때 평균계산 총점버튼비활성, 평균버튼 비활성, 등록활성화, 모든텍스트필드 비활성화
	public void handlerButtonAvgAction(ActionEvent e) {
		txtAvg.setText(String.valueOf(Integer.parseInt(txtTotal.getText())/6.0));
//		1. 버튼 초기화(총점X, 평균X,초기화,등록,종료)
		buttonInitSetting(true,true,false,false,false);
//		2. 텍스트필드 비활성화(이름x, 학년x, 반x, 국어x, 영어x, 수학x, 과한x, 사회x, 음악x)
		txtFieldInitSetting(true,true,true,true,true,true,true,true,true);
	}
//	5.초기화 버튼을 눌렀을 때 1번 버튼초기화, 텍스트필드 모두 활성화 할 것
	public void handlerButtonInitAction(ActionEvent e) {
//		1. 버튼 초기화(총점, 평균X,초기화,등록X,종료)
		buttonInitSetting(false,true,false,true,false);
//		텍스트필드 모두 활성화
//		2. 텍스트필드 비활성화(이름, 학년, 반, 국어, 영어, 수학, 과한, 사회, 음악)
		txtFieldInitSetting(false,false,false,false,false,false,false,false,false);
//		모든 값 초기화
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
//	6. 등록버튼을 눌렀을 때 테이블에 등록하고, 모든값을 초기화한다.
	public void handlerButtonOkAction(ActionEvent e) {
//		총점과 평균이 있는지 확인한다.
		try {
			if(txtTotal.getText().equals("") || txtAvg.getText().equals("")) {
				throw new Exception(); //11111
			} else {
				Student student = new Student(txtName.getText(),
						txtLevel.getText(), txtBan.getText(), txtKo.getText(), txtEng.getText(),
						txtMath.getText(), txtSic.getText(), txtSoc.getText(), txtMusic.getText(), 
						txtTotal.getText(), txtAvg.getText());
//				테이블뷰에 이미들어간 순간
				data.add(student);
				alertDisplay(1,"등록 성공","테이블등록 성공","추카추카.."); //11111
			}
		} catch (Exception e2) {
			alertDisplay(1,"등록 실패","함계,평균제대로 입력요망","정신차려"); //11111
			return;
		}
//		5.초기화 버튼을 눌렀을 때 1번 버튼초기화, 텍스트필드 모두 활성화 할 것
		handlerButtonInitAction(e);
	}
	
	public void handlerButtonExitAction(ActionEvent e) {
		
	}
	
	public void handlerBtnAvgActoion(ActionEvent e){
		
	}
	private void txtFieldInitSetting(boolean b, boolean c, boolean d, boolean e, boolean f, boolean g, boolean h, boolean i,
			boolean j) {
		txtName.setDisable(b);
		txtLevel.setDisable(c);
		txtBan.setDisable(d);
		txtKo.setDisable(e);
		txtEng.setDisable(f);
		txtMath.setDisable(g);
		txtSic.setDisable(h);
		txtSoc.setDisable(i);
		txtMusic.setDisable(j);
	}
}
 