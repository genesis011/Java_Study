package controller;
	
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import model.StudentVO;

	public class StudentDAO {
	   // ① 신규 학생 점수 등록
	   public int getStudentregiste(StudentVO svo) throws Exception {
	      // ② 데이터 처리를 위한 SQL 문
	      //해당된 필드 no부분은 자동으로 증가되므로 필드를 줄 필요가 없음.
	String dml = "insert into schoolchild "
	      + "(no, name, year, ban, gender, korean, english, math, sic, soc, music, total, avg)" + " values "
	      + "(null,?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";//no와 null을 줘도 들어가고 안줘도 들어간다.
	
	      Connection con = null;
	      PreparedStatement pstmt = null;
	      int count=0;
//	      StudentVO retval = null;//의미 없음
		try {
	         // ③ DBUtil 클래스의 getConnection( )메서드로 데이터베이스와 연결
	         con = DBUtil.getConnection(); //DBUtil의 18번줄 Class.forName(driver);를 불러온다.

	         // ④ 입력받은 학생 정보를 처리하기 위하여 SQL문장을 생성
	         pstmt = con.prepareStatement(dml); //보안을 위한것(19번줄 dml을 넣는다.)
	         pstmt.setString(1, svo.getName());
	         pstmt.setString(2, svo.getLevel());
	         pstmt.setString(3, svo.getBan());
	         pstmt.setString(4, svo.getGender());
	         pstmt.setInt(5, svo.getKorean());
	         pstmt.setInt(6, svo.getEnglish());
	         pstmt.setInt(7, svo.getMath());
	         pstmt.setInt(8, svo.getSic());
	         pstmt.setInt(9, svo.getSoc());
	         pstmt.setInt(10, svo.getMusic());
	         pstmt.setInt(11, svo.getTotal());
	         pstmt.setDouble(12, svo.getAvg());

	         // ⑤ SQL문을 수행후 처리 결과를 얻어옴
	         count = pstmt.executeUpdate(); //SQML에서 insert into의 값을 다 가져온다.

//	         retval = new StudentVO();

	      } catch (SQLException e) {
	         System.out.println("e=[" + e + "]");
	      } catch (Exception e) {
	         System.out.println("e=[" + e + "]");
	      } finally {
	         try {
	            // ⑥ 데이터베이스와의 연결에 사용되었던 오브젝트를 해제
	            if (pstmt != null)
	               pstmt.close();
	            if (con != null)
	               con.close();
	         } catch (SQLException e) {
	         }
	      }
//	      return retval;
	      return count;
	   }

	   // ⑦ 학생의 name을 입력받아 정보 조회
	   public StudentVO getStudentCheck(String name) throws Exception {
	      String dml = "select * from schoolchild where name = ?";

	      Connection con = null;
	      PreparedStatement pstmt = null;
	      ResultSet rs = null;
	      StudentVO retval = null;
	      try {
	         con = DBUtil.getConnection();
	         pstmt = con.prepareStatement(dml);
	         pstmt.setString(1, name);
	         rs = pstmt.executeQuery();
	         if (rs.next()) {
	            retval = new StudentVO(rs.getInt(1), rs.getString(2), rs.getString(3), 
	            		rs.getString(4), rs.getString(5),rs.getInt(6), rs.getInt(7), rs.getInt(8), 
	            		rs.getInt(9), rs.getInt(10), rs.getInt(11),
	rs.getInt(12), rs.getDouble(13));
	         }
	      } catch (SQLException se) {
	         System.out.println(se);
	      } catch (Exception e) {
	         System.out.println(e);
	      } finally {
	         try {
	            if (rs != null)
	               rs.close();
	            if (pstmt != null)
	               pstmt.close();
	            if (con != null)
	               con.close();
	         } catch (SQLException se) {
	         }
	      }
	      return retval;
	   }

	   // 선택한 학생의 점수 수정 
	   public StudentVO getStudentUpdate(StudentVO svo, int no) throws Exception {
	      // ② 데이터 처리를 위한 SQL 문
	      String dml = "update schoolchild set " + " korean=?, english=?, math=?, sic=?, soc=?, music=?, total=?, avg=?  where no = ?";
	      Connection con = null;
	      PreparedStatement pstmt = null;
	      StudentVO retval = null;

	      try {
	         // ③ DBUtil이라는 클래스의 getConnection( )메서드로 데이터베이스와 연결
	         con = DBUtil.getConnection();

	         // ④ 수정한 학생 정보를 수정하기 위하여 SQL문장을 생성
	         pstmt = con.prepareStatement(dml);
	         pstmt.setInt(1, svo.getKorean());
	         pstmt.setInt(2, svo.getEnglish());
	         pstmt.setInt(3, svo.getMath());
	         pstmt.setInt(4, svo.getSic());
	         pstmt.setInt(5, svo.getSoc());
	         pstmt.setInt(6, svo.getMusic());
	         pstmt.setInt(7, svo.getTotal());
	         pstmt.setDouble(8, svo.getAvg());
	         pstmt.setDouble(9, no);

	         // ⑤ SQL문을 수행후 처리 결과를 얻어옴
	         int i = pstmt.executeUpdate();

	         if (i == 1) {
	            Alert alert = new Alert(AlertType.INFORMATION);
	            alert.setTitle("점수 수정");
	            alert.setHeaderText("점수 수정 완료.");
	            alert.setContentText("점수 수정 성공!!!");

	            alert.showAndWait();
	            retval = new StudentVO();
	         } else {
	            Alert alert = new Alert(AlertType.INFORMATION);
	            alert.setTitle("점수 수정");
	            alert.setHeaderText("점수 수정 실패.");
	            alert.setContentText("점수 수정 실패!!!");

	            alert.showAndWait();
	         }

	      } catch (SQLException e) {
	         System.out.println("e=[" + e + "]");
	      } catch (Exception e) {
	         System.out.println("e=[" + e + "]");
	      } finally {
	         try {
	            // ⑥ 데이터베이스와의 연결에 사용되었던 오브젝트를 해제
	            if (pstmt != null)
	               pstmt.close();
	            if (con != null)
	               con.close();
	         } catch (SQLException e) {
	         }
	      }
	      return retval;
	   }

	   public void getStudentDelete(int no) throws Exception {
	      // ② 데이터 처리를 위한 SQL 문
	      String dml = "delete from schoolchild where no = ?";
	      Connection con = null;
	      PreparedStatement pstmt = null;

	      try {
	         // ③ DBUtil이라는 클래스의 getConnection( )메서드로 데이터베이스와 연결
	         con = DBUtil.getConnection();

	         // ⑤ SQL문을 수행후 처리 결과를 얻어옴
	         pstmt = con.prepareStatement(dml);
	         pstmt.setInt(1, no);

	         // ⑤ SQL문을 수행후 처리 결과를 얻어옴
	         int i = pstmt.executeUpdate();

	         if (i == 1) {
	            Alert alert = new Alert(AlertType.INFORMATION);
	            alert.setTitle("학생 삭제");
	            alert.setHeaderText("학생 삭제 완료.");
	            alert.setContentText("학생 삭제 성공!!!");

	            alert.showAndWait();

	         } else {
	            Alert alert = new Alert(AlertType.INFORMATION);
	            alert.setTitle("학생 삭제");
	            alert.setHeaderText("학생 삭제 실패.");
	            alert.setContentText("학생 삭제 실패!!!");

	            alert.showAndWait();
	         }

	      } catch (SQLException e) {
	         System.out.println("e=[" + e + "]");
	      } catch (Exception e) {
	         System.out.println("e=[" + e + "]");
	      } finally {
	         try {
	            // ⑥ 데이터베이스와의 연결에 사용되었던 오브젝트를 해제
	            if (pstmt != null)
	               pstmt.close();
	            if (con != null)
	               con.close();
	         } catch (SQLException e) {
	         }
	      }

	   }

	   // 학생 전체 리스트
	   public ArrayList<StudentVO> getStudentTotal() {
	      ArrayList<StudentVO> list = new ArrayList<StudentVO>();
	      String tml = "select * from schoolchild";

	      Connection con = null;
	      PreparedStatement pstmt = null;
	      ResultSet rs = null;
	      StudentVO emVo = null;

	      try {
	         con = DBUtil.getConnection();
	         pstmt = con.prepareStatement(tml);
	         rs = pstmt.executeQuery();
	         while (rs.next()) {
	            emVo = new StudentVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),rs.getInt(6), rs.getInt(7), rs.getInt(8), rs.getInt(9), rs.getInt(10), rs.getInt(11),
	rs.getInt(12), rs.getDouble(13));
	            list.add(emVo);
	         }
	      } catch (SQLException se) {
	         System.out.println(se);
	      } catch (Exception e) {
	         System.out.println(e);
	      } finally {
	         try {
	            if (rs != null)
	               rs.close();
	            if (pstmt != null)
	               pstmt.close();
	            if (con != null)
	               con.close();
	         } catch (SQLException se) {
	         }
	      }
	      return list;
	   }

	   // 데이터베이스에서 학생 테이블의 컬럼의 갯수
	   public ArrayList<String> getColumnName() {
	      ArrayList<String> columnName = new ArrayList<String>();

	      String sql = "select * from schoolchild";
	      Connection con = null;
	      PreparedStatement pstmt = null;
	      ResultSet rs = null;
	      // ResultSetMetaData 객체 변수 선언
	      ResultSetMetaData rsmd = null;
	      try {
	         con = DBUtil.getConnection();
	         pstmt = con.prepareStatement(sql);
	         rs = pstmt.executeQuery();
	         rsmd = rs.getMetaData();
	         int cols = rsmd.getColumnCount();
	         for (int i = 1; i <= cols; i++) {
	            columnName.add(rsmd.getColumnName(i));
	         }
	      } catch (SQLException se) {
	         System.out.println(se);
	      } catch (Exception e) {
	         System.out.println(e);
	      } finally {
	         try {
	            if (rs != null)
	               rs.close();
	            if (pstmt != null)
	               pstmt.close();
	            if (con != null)
	               con.close();
	         } catch (SQLException se) {
	         }
	      }
	      return columnName;
	   }
	}

