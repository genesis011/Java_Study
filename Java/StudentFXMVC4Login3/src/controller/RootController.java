package controller;

import java.io.IOException;
import java.net.URL;
import java.text.DecimalFormat;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import model.Student;
import model.StudentVO;

public class RootController implements Initializable {
   @FXML
   private TextField txtName;
   @FXML
   private ComboBox<String> cbYear;
//   @FXML private TextField txtLevel;
   @FXML
   private ToggleGroup genderGroup;
   @FXML
   private RadioButton rbMale;
   @FXML
   private RadioButton rbFemale;
   @FXML
   private TextField txtBan;
   @FXML
   private TextField txtKo;
   @FXML
   private TextField txtEng;
   @FXML
   private TextField txtMath;
   @FXML
   private TextField txtSic;
   @FXML
   private TextField txtSoc;
   @FXML
   private TextField txtMusic;
   @FXML
   private TextField txtTotal;
   @FXML
   private TextField txtAvg;
   @FXML
   private Button btnTotal;
   @FXML
   private Button btnAvg;
   @FXML
   private Button btnInit;
   @FXML
   private Button btnOk;
   @FXML
   private Button btnExit;
   @FXML
   private Button btnTotalList;
   // 검색기능추가
   @FXML
   private TextField txtSearch;
   @FXML
   private Button btnSearch;
   // 수정,삭제버튼추가
   @FXML
   private Button btnEdit;
   @FXML
   private Button btnDelete;
   // 바챠트 버튼설정추가
   @FXML
   private Button btnBarChart;
   // 수정할때를 버튼설정상태 결정
   private boolean editDelete = false;
   // 테이블뷰를 선택했을때 위치값과 객체값을 저장할수있는 변수 선언
   private int selectedIndex;
   private ObservableList<StudentVO> selectStudent;

   @FXML
   private TableView<StudentVO> tableView;
   ObservableList<StudentVO> data; // 테이블뷰에 보여주기위해서 저장된 데이타
   private StudentDAO studentDAO;

   @Override
   
   public void initialize(URL arg0, ResourceBundle arg1) {
      // 1. 버튼초기화(총점, 평균x,초기화,등록x,종료,수정x,삭제x)
      buttonInitSetting(false, true, false, true, false, true, true);
      // 1.2 콤보박스 초기화
      cbYear.setItems(FXCollections.observableArrayList("1", "2", "3", "4", "5", "6"));
      // 2. 테이블설정기능(데이터포맷설정포함)
      tableViewSetting();
      // 3. 총점버튼을 눌렀을때 평균버튼활성화 및 6개값 총점을 구해서 총점필드적어놓는다.
      btnTotal.setOnAction(e -> {
         handlerBtnTotalAction(e);
      });
      // 4. 평균버튼을 눌렀을때 평균계산, 총점버튼비활성,평균버튼비활성,등록활성화,모든텍스트필드비활성화
      btnAvg.setOnAction(e -> {
         handlerBtnAvgAction(e);
      });
      // 5. 초기화버튼을 눌렀을때 1번 버튼초기화, 텍스트 필드 모두활성화
      btnInit.setOnAction(e -> {
         handlerBtnInitAction(e);
      });
      // 6. 등록버튼을 눌렀을때 테이블에 등록하고, 모든값을 초기화한다.
      btnOk.setOnAction(e -> {
         handlerBtnOkAction(e);
      });
      // 7. 검색버튼을 눌렀을때 테이블뷰에서 찾기기능
      btnSearch.setOnAction(e -> {
         handlerBtnSearchAction(e);
      });
      // 8. 삭제버튼을 눌렀을대 테이블뷰에서 삭제기능
      btnDelete.setOnAction(e -> {
         handlerBtnDeleteAction(e);
      });
      // 9. 테이블뷰에서 눌렀을때 이벤트 처리기능
      tableView.setOnMousePressed(e -> {
         handlerTableViewPressedAction(e);
      });
      // 10. 수정버튼을 눌렀을때 이벤트 처리기능
      btnEdit.setOnAction(e -> {
         handlerBtnEditAction(e);
      });
      // 11. 종료버튼을 눌렀을때 이벤트 처리기능
      btnExit.setOnAction(e -> {
         Platform.exit();
      });
      // 12.테이블뷰 마우스를 더블클릭했을때 선택된 내용을 중심으로 파이챠트 보이기
      tableView.setOnMouseClicked(e -> {
         handlerPieChartAction(e);
      });
      // 13.바챠트를 눌렀을때 이벤트 처리기능
      btnBarChart.setOnAction(e -> {
         handlerBtnBarChartAction(e);
      });
      // 14. 맨 처음에 테이블뷰에 데이타베이스 값을 읽어서 테이블뷰에 가져온다.
      btnTotalList();
      // 15. 전체 리스틀르 누르면 데이타베이스에서 값을 가져오기
      btnTotalList.setOnAction(e -> {
          handlerBtnTotalListAction(e);
       });
      
      // 테스팅을 위한 디버깅
      txtName.setText("aaa");
      // txtLevel.setText("2");
      cbYear.setValue("2");
      rbFemale.setSelected(true);
      txtBan.setText("2");
      txtKo.setText("23");
      txtEng.setText("23");
      txtMath.setText("23");
      txtSic.setText("23");
      txtSoc.setText("23");
      txtMusic.setText("23");
   } 

   // 1. 버튼초기화(총점,평균,초기화,등록,종료,수정,삭제)설정 및 총점, 평균 텍스트필드 비활성화
   public void buttonInitSetting(boolean b, boolean c, boolean d, boolean e, boolean f, boolean g, boolean h) {
      btnTotal.setDisable(b);
      btnAvg.setDisable(c);
      btnInit.setDisable(d);
      btnOk.setDisable(e);
      btnExit.setDisable(f);
      btnEdit.setDisable(g);
      btnDelete.setDisable(h);
      txtTotal.setDisable(true);
      txtAvg.setDisable(true);

   }

   // 2. 테이블설정기능(데이터포맷설정포함)
   public void tableViewSetting() {
      // 2. 테이블설정 얼레이리스트설정
      data = FXCollections.observableArrayList();
      // 2. 테이블설정 테이블뷰를 편집못하게 설정
      tableView.setEditable(false);
      // 3.텍스트라벨 숫자만 입력
      DecimalFormat format = new DecimalFormat("###");
      // 점수 입력시 길이 제한 이벤트 처리
      txtKo.setTextFormatter(new TextFormatter<>(event -> {
         if (event.getControlNewText().isEmpty()) {
            return event;
         }
         ParsePosition parsePosition = new ParsePosition(0);
         Object object = format.parse(event.getControlNewText(), parsePosition);
         if (object == null || parsePosition.getIndex() < event.getControlNewText().length()
               || event.getControlNewText().length() == 4) {
            return null;
         } else {
            return event;
         }
      }));

      txtEng.setTextFormatter(new TextFormatter<>(event -> {
         if (event.getControlNewText().isEmpty()) {
            return event;
         }
         ParsePosition parsePosition = new ParsePosition(0);
         Object object = format.parse(event.getControlNewText(), parsePosition);
         if (object == null || parsePosition.getIndex() < event.getControlNewText().length()
               || event.getControlNewText().length() == 4) {
            return null;
         } else {
            return event;

         }
      }));

      txtMath.setTextFormatter(new TextFormatter<>(event -> {
         if (event.getControlNewText().isEmpty()) {
            return event;
         }
         ParsePosition parsePosition = new ParsePosition(0);
         Object object = format.parse(event.getControlNewText(), parsePosition);
         if (object == null || parsePosition.getIndex() < event.getControlNewText().length()
               || event.getControlNewText().length() == 4) {
            return null;
         } else {
            return event;
         }
      }));

      txtSic.setTextFormatter(new TextFormatter<>(event -> {
         if (event.getControlNewText().isEmpty()) {
            return event;
         }
         ParsePosition parsePosition = new ParsePosition(0);
         Object object = format.parse(event.getControlNewText(), parsePosition);
         if (object == null || parsePosition.getIndex() < event.getControlNewText().length()
               || event.getControlNewText().length() == 4) {
            return null;
         } else {
            return event;
         }
      }));

      txtSoc.setTextFormatter(new TextFormatter<>(event -> {
         if (event.getControlNewText().isEmpty()) {
            return event;
         }
         ParsePosition parsePosition = new ParsePosition(0);
         Object object = format.parse(event.getControlNewText(), parsePosition);

         if (object == null || parsePosition.getIndex() < event.getControlNewText().length()
               || event.getControlNewText().length() == 4) {
            return null;
         } else {
            return event;
         }
      }));

      txtMusic.setTextFormatter(new TextFormatter<>(event -> {
         if (event.getControlNewText().isEmpty()) {
            return event;
         }
         ParsePosition parsePosition = new ParsePosition(0);
         Object object = format.parse(event.getControlNewText(), parsePosition);
         if (object == null || parsePosition.getIndex() < event.getControlNewText().length()
               || event.getControlNewText().length() == 4) {
            return null;
         } else {
            return event;
         }
      }));

      // 2. 테이블설정 컬럼셋팅
      TableColumn colNo = new TableColumn("NO");
      colNo.setMaxWidth(30);
      colNo.setStyle("-fx-alignment: CENTER;");
      colNo.setCellValueFactory(new PropertyValueFactory("no"));

      TableColumn colName = new TableColumn("성명");
      colName.setMaxWidth(55);
      colName.setStyle("-fx-alignment: CENTER;");
      colName.setCellValueFactory(new PropertyValueFactory("name"));

      TableColumn colLevel = new TableColumn("학년");
      colLevel.setMaxWidth(40);
      colLevel.setStyle("-fx-alignment: CENTER;");
      colLevel.setCellValueFactory(new PropertyValueFactory("level"));

      TableColumn colBan = new TableColumn("반");
      colBan.setMaxWidth(40);
      colBan.setStyle("-fx-alignment: CENTER;");
      colBan.setCellValueFactory(new PropertyValueFactory("ban"));

      TableColumn colGender = new TableColumn("성별");
      colGender.setMaxWidth(40);
      colGender.setStyle("-fx-alignment: CENTER;");
      colGender.setCellValueFactory(new PropertyValueFactory("gender"));

      TableColumn colKorean = new TableColumn("국어");
      colKorean.setMaxWidth(40);
      colKorean.setCellValueFactory(new PropertyValueFactory<>("korean"));

      TableColumn colEnglish = new TableColumn("영어");
      colEnglish.setMaxWidth(40);
      colEnglish.setCellValueFactory(new PropertyValueFactory<>("english"));

      TableColumn colMath = new TableColumn("수학");
      colMath.setMaxWidth(40);
      colMath.setCellValueFactory(new PropertyValueFactory<>("math"));

      TableColumn colSic = new TableColumn("과학");
      colSic.setMaxWidth(40);
      colSic.setCellValueFactory(new PropertyValueFactory<>("sic"));

      TableColumn colSoc = new TableColumn("사회");
      colSoc.setMaxWidth(40);
      colSoc.setCellValueFactory(new PropertyValueFactory<>("soc"));

      TableColumn colMusic = new TableColumn("음악");
      colMusic.setMaxWidth(40);
      colMusic.setCellValueFactory(new PropertyValueFactory<>("music"));

      TableColumn colTotal = new TableColumn("총점");
      colTotal.setMaxWidth(50);
      colTotal.setCellValueFactory(new PropertyValueFactory<>("total"));

      TableColumn colAvg = new TableColumn("평균");
      colAvg.setMaxWidth(60);
      colAvg.setCellValueFactory(new PropertyValueFactory<>("avg"));

      // 2. 테이블설정 컬럼들 객체를 테이블뷰에 리스트추가 및 항목추가
      tableView.setItems(data);
      tableView.getColumns().addAll(colNo, colName, colLevel, colBan, colGender, colKorean, colEnglish, colMath,
            colSic, colSoc, colMusic, colTotal, colAvg);

   }

   // 3. 총점버튼을 눌렀을때 평균버튼활성화 및 6개값 총점을 구해서 총점필드적어놓는다.
   public void handlerBtnTotalAction(ActionEvent e) {
      try {
         int korean = Integer.parseInt(txtKo.getText());
         int english = Integer.parseInt(txtEng.getText());
         int math = Integer.parseInt(txtMath.getText());
         int sic = Integer.parseInt(txtSic.getText());
         int soc = Integer.parseInt(txtSoc.getText());
         int music = Integer.parseInt(txtMusic.getText());
         if ((korean <= 100) && (english <= 100) && (math <= 100) && (sic <= 100) && (soc <= 100)
               && (music <= 100)) {
            int total = korean + english + math + sic + soc + music;
            txtTotal.setText(String.valueOf(total));
            btnAvg.setDisable(false);
         } else {
            throw new Exception("유효한값 오류");
         }
      } catch (Exception e2) {
         alertDisplay(1, "합계실패", "계산오류(유효한값 점검요망) ", e2.toString());
      }
   }

   // 4. 평균버튼을 눌렀을때 평균계산, 총점버튼비활성,평균버튼비활성,등록활성화,모든텍스트필드비활성화
   public void handlerBtnAvgAction(ActionEvent e) {
      txtAvg.setText(String.valueOf(Integer.parseInt(txtTotal.getText()) / 6.0));
      // 1. 버튼초기화(총점x, 평균x,초기화,등록,종료,수정x,삭제x)
      buttonInitSetting(true, true, false, false, false, true, true);
      // 텍스트필드 비활성화(이름x,학년x,반x,성별x,국어x,영어x,수학x,과학x,사회x,음악x)
      textFieldInitSetting(true, true, true, true, true, true, true, true, true, true);

   }

   // 5. 초기화버튼을 눌렀을때 1번 버튼초기화, 텍스트 필드 모두활성화
   public void handlerBtnInitAction(ActionEvent e) {
      // 1. 버튼초기화(총점, 평균x,초기화,등록x,종료,수정x,삭제x)
      buttonInitSetting(false, true, false, true, false, true, true);
      // 텍스트필드 활성화(이름,학년,반,성별,국어,영어,수학,과학,사회,음악)
      textFieldInitSetting(false, false, false, false, false, false, false, false, false, false);
      // 텍스트필드 초기화
//      txtName.clear();
//      txtLevel.clear();
//      txtBan.clear();
//      txtKo.clear();
//      txtEng.clear();
//      txtMath.clear();
//      txtSic.clear();
//      txtSoc.clear();
//      txtMusic.clear();
      txtTotal.clear();
      txtAvg.clear();
   }

   // 6. 등록버튼을 눌렀을때 테이블에 등록하고, 모든값을 초기화한다.
   public void handlerBtnOkAction(ActionEvent e) {
      // 총점과 평균이 있는지 확인한다.
      try {
         if (txtTotal.getText().equals("") || txtAvg.getText().equals("")) {
            throw new Exception();
         } else {
            StudentVO svo = new StudentVO(txtName.getText(), cbYear.getSelectionModel().getSelectedItem(),
                  txtBan.getText(), (genderGroup.getSelectedToggle().getUserData()).toString(),
                  Integer.parseInt(txtKo.getText().trim()), Integer.parseInt(txtEng.getText().trim()),
                  Integer.parseInt(txtMath.getText().trim()), Integer.parseInt(txtSic.getText().trim()),
                  Integer.parseInt(txtSoc.getText().trim()), Integer.parseInt(txtMusic.getText().trim()),
                  Integer.parseInt(txtTotal.getText().trim()), Double.parseDouble(txtAvg.getText().trim()));
            // 테이블뷰에 들어가버린 순간
            if (editDelete == true) {
               data.remove(selectedIndex);
               data.add(selectedIndex, svo);
               editDelete = false;
            } else {
               studentDAO = new StudentDAO(); // 객체를 부르는것
               // 데이타베이스 테이블에 입력값을 입력하는 함수.
               int count = studentDAO.getStudentregiste(svo);
               if (count != 0) {
            	   data.removeAll(data);
//                  data.add(svo);
            	   btnTotalList();
               } else {
                  throw new Exception("데이타베이스 접속 실패");
               }
            }
            alertDisplay(1, "등록성공", "테이블등록성공", "축하축하..");
         }
      } catch (Exception e2) {
         alertDisplay(1, "등록실패", "합계,평균제대로입력요망", e2.toString());
         return;
      }
      // 5. 초기화버튼을 눌렀을때 1번 버튼초기화, 텍스트 필드 모두활성화
      handlerBtnInitAction(e);
   }

   // 7. 검색버튼을 눌렀을때 테이블뷰에서 찾기기능
   public void handlerBtnSearchAction(ActionEvent e) {
      for (StudentVO student : data) {
         if (txtSearch.getText().equals(student.getName())) {
            tableView.getSelectionModel().select(student);
            return;
         }
      }
      alertDisplay(1, "검색결과", "이름검색오류", "정확한이름을 입력요망");
   }

   // 8. 삭제버튼을 눌렀을대 테이블뷰에서 삭제기능
   public void handlerBtnDeleteAction(ActionEvent e) {
	   try {
//	      data.remove(selectedIndex);
	      StudentDAO studentDAO =new StudentDAO();
	      studentDAO.getStudentDelete(selectStudent.get(0).getNo());
	      data.removeAll(data);
	} catch (Exception e1) {
		alertDisplay(1,"삭제오류","8. 삭제오류","다시 확인해주세요");
	}
      // 1. 버튼초기화(총점,평균x,초기화,등록x,종료,수정x,삭제x)
      buttonInitSetting(false, true, false, true, false, true, true);
      // 텍스트필드 비활성화(이름,학년,반,성별,국어,영어,수학,과학,사회,음악)
      textFieldInitSetting(false, false, false, false, false, false, false, false, false, false);
      editDelete = false;
   }

   // 9. 테이블뷰에서 눌렀을때 이벤트 처리기능
   public void handlerTableViewPressedAction(MouseEvent e) {
      try {
         // 눌렀을때 위치와 해당된 객체를 가져온다.
         editDelete = true;
         // 1. 버튼초기화(총점X, 평균x,초기화,등록x,종료,수정,삭제)
         buttonInitSetting(true, true, true, true, false, false, false);

         selectedIndex = tableView.getSelectionModel().getSelectedIndex();
         selectStudent = tableView.getSelectionModel().getSelectedItems();
         // 눌렀을때 테이블에 있는 값을 가져와서 데이터필드에 집어넣는다.
         txtName.setText(selectStudent.get(0).getName());
         cbYear.setValue(selectStudent.get(0).getLevel());
         txtBan.setText(selectStudent.get(0).getBan());
         if (selectStudent.get(0).getGender().equals("남성")) {
            rbMale.setSelected(true);
            rbFemale.setSelected(false);
         } else {
            rbMale.setSelected(false);
            rbFemale.setSelected(true);
         }
         txtKo.setText(String.valueOf(selectStudent.get(0).getKorean()));
         txtEng.setText(String.valueOf(selectStudent.get(0).getEnglish()));
         txtMath.setText(String.valueOf(selectStudent.get(0).getMath()));
         txtSic.setText(String.valueOf(selectStudent.get(0).getSic()));
         txtSoc.setText(String.valueOf(selectStudent.get(0).getSoc()));
         txtMusic.setText(String.valueOf(selectStudent.get(0).getMusic()));
         txtTotal.setText(String.valueOf(selectStudent.get(0).getTotal()));
         txtAvg.setText(String.valueOf(selectStudent.get(0).getAvg()));

         // 텍스트필드 비활성화(이름x,학년x,반x,성별x,국어x,영어x,수학x,과학x,사회x,음악x)
         textFieldInitSetting(true, true, true, true, true, true, true, true, true, true);
      } catch (Exception e2) {

         // 1. 버튼초기화(총점, 평균x,초기화,등록x,종료,수정x,삭제x)
         buttonInitSetting(false, true, false, true, false, true, true);
         editDelete = false;
      }
   }

   // 10. 수정버튼을 눌렀을때 이벤트 처리기능
   public void handlerBtnEditAction(ActionEvent e) {
      try {
         // 1. 버튼초기화(총점,평균x,초기화,등록x,종료,수정x,삭제x)
         buttonInitSetting(false, true, false, true, false, true, true);
         // 텍스트필드 비활성화(이름x,학년x,반x,성별x,국어x,영어x,수학x,과학x,사회x,음악x)
         textFieldInitSetting(false, false, false, false, false, false, false, false, false, false);
         // 수정화면을 부르기
         Parent editRoot = FXMLLoader.load(getClass().getResource("/view/formedit.fxml"));
         Stage stageDialog = new Stage(StageStyle.UTILITY);
         stageDialog.initModality(Modality.WINDOW_MODAL);
         stageDialog.initOwner(btnOk.getScene().getWindow());
         stageDialog.setTitle("수정창");
         // =====================
         TextField editName = (TextField) editRoot.lookup("#txtName");
         TextField editYear = (TextField) editRoot.lookup("#txtYear");
         TextField editBan = (TextField) editRoot.lookup("#txtBan");
         TextField editGender = (TextField) editRoot.lookup("#txtGender");
         TextField editKorean = (TextField) editRoot.lookup("#txtKorean");
         TextField editEnglish = (TextField) editRoot.lookup("#txtEnglish");
         TextField editMath = (TextField) editRoot.lookup("#txtMath");
         TextField editSic = (TextField) editRoot.lookup("#txtSic");
         TextField editSoc = (TextField) editRoot.lookup("#txtSoc");
         TextField editMusic = (TextField) editRoot.lookup("#txtMusic");
         TextField editTotal = (TextField) editRoot.lookup("#txtTotal");
         TextField editAvg = (TextField) editRoot.lookup("#txtAvg");
         Button btnCal = (Button) editRoot.lookup("#btnCal");
         Button btnFormAdd = (Button) editRoot.lookup("#btnFormAdd");
         Button btnFormCancel = (Button) editRoot.lookup("#btnFormCancel");

         // 총점과 평균은 수정을 하지 못하게 한다.
         editTotal.setDisable(true);
         editAvg.setDisable(true);
         // 텍스트 에디트 값을 넣는다.
         editName.setText(selectStudent.get(0).getName());
         editYear.setText(selectStudent.get(0).getLevel());
         editBan.setText(selectStudent.get(0).getBan());
         editGender.setText(selectStudent.get(0).getGender());
         editKorean.setText(String.valueOf(selectStudent.get(0).getKorean()));
         editEnglish.setText(String.valueOf(selectStudent.get(0).getEnglish()));
         editMath.setText(String.valueOf(selectStudent.get(0).getMath()));
         editSic.setText(String.valueOf(selectStudent.get(0).getSic()));
         editSoc.setText(String.valueOf(selectStudent.get(0).getSoc()));
         editMusic.setText(String.valueOf(selectStudent.get(0).getMusic()));
         editTotal.setText(String.valueOf(selectStudent.get(0).getTotal()));
         editAvg.setText(String.valueOf(selectStudent.get(0).getAvg()));
         // =====================
         // 버튼계산 이벤트처리
         btnCal.setOnAction((e1) -> {
            try {
               int korean = Integer.parseInt(editKorean.getText());
               int english = Integer.parseInt(editEnglish.getText());
               int math = Integer.parseInt(editMath.getText());
               int sic = Integer.parseInt(editSic.getText());
               int soc = Integer.parseInt(editSoc.getText());
               int music = Integer.parseInt(editMusic.getText());
               if ((korean <= 100) && (english <= 100) && (math <= 100) && (sic <= 100) && (soc <= 100)
                     && (music <= 100)) {
                  int total = korean + english + math + sic + soc + music;
                  editTotal.setText(String.valueOf(total));
                  editAvg.setText(String.valueOf(total / 6.0));
               } else {
                  throw new Exception("유효한값 오류");
               }
            } catch (Exception e2) {
               alertDisplay(1, "합계실패", "계산오류(유효한값 점검요망) ", e2.toString());
            }

         });
         // 저장버튼을 눌렀을때
         btnFormAdd.setOnAction(e4 -> {
            try {
               if (editTotal.getText().equals("") || editAvg.getText().equals("")) {
                  throw new Exception();
               } else {

                  StudentVO svo = new StudentVO(editName.getText(), editYear.getText(), editBan.getText(),
                        editGender.getText(), Integer.parseInt(editKorean.getText().trim()),
                        Integer.parseInt(editEnglish.getText().trim()),
                        Integer.parseInt(editMath.getText().trim()), Integer.parseInt(editSic.getText().trim()),
                        Integer.parseInt(editSoc.getText().trim()),
                        Integer.parseInt(editMusic.getText().trim()),
                        Integer.parseInt(editTotal.getText().trim()),
                        Double.parseDouble(editAvg.getText().trim()));

                  // 테이블뷰에 들어가버린 순간
                  if (editDelete == true) {
                     data.remove(selectedIndex);
                     data.add(selectedIndex, svo);
                     editDelete = false;
                  } else {
                     throw new Exception("수정등록오류");
                  }

               }
            } catch (Exception e2) {
               alertDisplay(1, "수정등록실패", "수정등록실패", "정신차려" + e2.getMessage());
            }
            stageDialog.close();
         });
         // 취소버튼을 눌렀을때
         btnFormCancel.setOnAction(e3 -> {
            stageDialog.close();
         });

         Scene scene = new Scene(editRoot);
         stageDialog.setScene(scene);
         stageDialog.setResizable(false);
         stageDialog.show();
      } catch (IOException e1) {
         // TODO Auto-generated catch block
         e1.printStackTrace();
      }

   }

   // 12.테이블뷰 마우스를 더블클릭했을때 선택된 내용을 중심으로 파이챠트 보이기
   public void handlerPieChartAction(MouseEvent e) {
      try {
         if (e.getClickCount() != 2) {
            return;
         }
         // 1. 버튼초기화(총점,평균x,초기화,등록x,종료,수정x,삭제x)
         buttonInitSetting(false, true, false, true, false, true, true);
         // 텍스트필드 비활성화(이름x,학년x,반x,성별x,국어x,영어x,수학x,과학x,사회x,음악x)
         textFieldInitSetting(false, false, false, false, false, false, false, false, false, false);
         // 두번클릭을 했는지를 점검한다.

         // 두번클릭이 되었을때
         Parent pieChartRoot = FXMLLoader.load(getClass().getResource("/view/piechart.fxml"));
         Stage stage = new Stage(StageStyle.UTILITY);
         stage.initModality(Modality.WINDOW_MODAL);
         stage.initOwner(btnOk.getScene().getWindow());
         stage.setTitle(selectStudent.get(0).getName() + " 합계 평균 성적챠트");

         PieChart pieChart = (PieChart) pieChartRoot.lookup("#pieChart");
         Button btnClose = (Button) pieChartRoot.lookup("#btnClose");
         // 그래프 그리기
         pieChart.setData(FXCollections.observableArrayList(
               new PieChart.Data("총점", (double) (selectStudent.get(0).getTotal())),
               new PieChart.Data("평균", (selectStudent.get(0).getAvg()))));
         // 창 닫기기능
         btnClose.setOnAction(e2 -> {
            editDelete = false;
            stage.close();
         });

         Scene scene = new Scene(pieChartRoot);
         stage.setScene(scene);
         stage.show();
      } catch (IOException e1) {
         // TODO Auto-generated catch block
         e1.printStackTrace();
      }

   }

   // 13.바챠트를 눌렀을때 이벤트 처리기능
   public void handlerBtnBarChartAction(ActionEvent e) {
      try {
         Parent barChartRoot = FXMLLoader.load(getClass().getResource("/view/barchart.fxml"));
         Stage stage = new Stage(StageStyle.UTILITY);
         stage.initModality(Modality.WINDOW_MODAL);
         stage.initOwner(btnOk.getScene().getWindow());
         stage.setTitle(" 막대그래프 성적챠트");

         BarChart barChart = (BarChart) barChartRoot.lookup("#barChart");
         Button btnClose = (Button) barChartRoot.lookup("#btnClose");

         // 모든 국어점수 바챠트에 입력한다.
         XYChart.Series seriesKorean = new XYChart.Series();
         seriesKorean.setName("국어");
         ObservableList koreanList = FXCollections.observableArrayList();
         for (int i = 0; i < data.size(); i++) {
            koreanList.add(new XYChart.Data(data.get(i).getName(), data.get(i).getKorean()));
         }
         seriesKorean.setData(koreanList);
         barChart.getData().add(seriesKorean);
         // 모든 수학점수
         XYChart.Series seriesMath = new XYChart.Series();
         seriesMath.setName("수학");
         ObservableList mathList = FXCollections.observableArrayList();
         for (int i = 0; i < data.size(); i++) {
            mathList.add(new XYChart.Data(data.get(i).getName(), data.get(i).getMath()));
         }
         seriesMath.setData(mathList);
         barChart.getData().add(seriesMath);
         // 모든 영어점수
         XYChart.Series seriesEnglish = new XYChart.Series();
         seriesEnglish.setName("영어");
         ObservableList englishList = FXCollections.observableArrayList();
         for (int i = 0; i < data.size(); i++) {
            englishList.add(new XYChart.Data(data.get(i).getName(),

                  data.get(i).getEnglish()));
         }
         seriesEnglish.setData(englishList);
         barChart.getData().add(seriesEnglish);
         // 모든 과학점수
         XYChart.Series seriesSic = new XYChart.Series();
         seriesSic.setName("과학");
         ObservableList sicList = FXCollections.observableArrayList();
         for (int i = 0; i < data.size(); i++) {
            sicList.add(new XYChart.Data(data.get(i).getName(), data.get(i).getSic()));
         }
         seriesSic.setData(sicList);
         barChart.getData().add(seriesSic);
         // 모든 사회점수
         XYChart.Series seriesSoc = new XYChart.Series();
         seriesSoc.setName("사회");
         ObservableList socList = FXCollections.observableArrayList();
         for (int i = 0; i < data.size(); i++) {
            socList.add(new XYChart.Data(data.get(i).getName(), data.get(i).getSoc()));
         }
         seriesSoc.setData(socList);
         barChart.getData().add(seriesSoc);
         // 모든 음악점수
         XYChart.Series seriesMusic = new XYChart.Series();
         seriesMusic.setName("음악");
         ObservableList musicList = FXCollections.observableArrayList();
         for (int i = 0; i < data.size(); i++) {
            musicList.add(new XYChart.Data(data.get(i).getName(), data.get(i).getMusic()));
         }
         seriesMusic.setData(musicList);
         barChart.getData().add(seriesMusic);

         // 바챠트 버튼close 이벤트
         btnClose.setOnAction(e1 -> {
            // 1. 버튼초기화(총점,평균x,초기화,등록x,종료,수정x,삭제x)
            buttonInitSetting(false, true, false, true, false, true, true);
            // 텍스트필드 비활성화(이름x,학년x,반x,성별x,국어x,영어x,수학x,과학x,사회x,음악x)
            textFieldInitSetting(false, false, false, false, false, false, false, false, false, false);
            editDelete = false;
            stage.close();
         });

         Scene scene = new Scene(barChartRoot);
         stage.setScene(scene);
         stage.show();

      } catch (IOException e1) {
         // TODO Auto-generated catch block
         e1.printStackTrace();
      }

   }
   
   // 14. 맨 처음에 테이블뷰에 데이타베이스 값을 읽어서 테이블뷰에 가져온다.
	public void btnTotalList(){
	 	  ArrayList<StudentVO>list=null;
	 	  StudentDAO studentDAO=new StudentDAO();
	 	  StudentVO studentVO=null;
	 	  list=studentDAO.getStudentTotal();
	 	  if(list==null) {
	 		 alertDisplay(1,"경고","DB가져오기 오류", "점검요망");
	 		  return;
	 	  }
	 	  
	 	  for(int i=0;i<list.size();i++) {
	 		 studentVO =list.get(i);
	 		 data.add(studentVO);
	 	  }
	   }  
	
	// 15. 전체 리스틀르 누르면 데이타베이스에서 값을 가져오기
   public void handlerBtnTotalListAction(ActionEvent e) {
	   try {
	data.removeAll(data);
	btnTotalList();
	   }catch(Exception e1) {
		   alertDisplay(1, "전체리스트 오류","15번 전체리스트 오류발생",e1.toString());
	   }
}
   // 경고창디스플레이
   public void alertDisplay(int type, String title, String headerText, String contentText) {
      Alert alert = null;
      switch (type) {
      case 1:
         alert = new Alert(AlertType.WARNING);
         break;
      case 2:
         alert = new Alert(AlertType.CONFIRMATION);
         break;
      case 3:
         alert = new Alert(AlertType.ERROR);
         break;
      case 4:
         alert = new Alert(AlertType.NONE);
         break;
      case 5:
         alert = new Alert(AlertType.INFORMATION);
         break;
      }
      alert.setTitle(title);
      alert.setHeaderText(headerText);
      alert.setContentText(headerText + "\n" + contentText);
      alert.setResizable(false);
      alert.show();
   }

   // 텍스트필드 비활성화(이름,학년,반,성별,국어,영어,수학,과학,사회,음악)
   private void textFieldInitSetting(boolean b, boolean c, boolean d, boolean k, boolean e, boolean f, boolean g,
         boolean h, boolean i, boolean j) {
      txtName.setDisable(b);
      cbYear.setDisable(c);
//      txtLevel.setDisable(c);
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