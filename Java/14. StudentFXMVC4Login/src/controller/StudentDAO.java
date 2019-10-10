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
	   // �� �ű� �л� ���� ���
	   public int getStudentregiste(StudentVO svo) throws Exception {
	      // �� ������ ó���� ���� SQL ��
	      //�ش�� �ʵ� no�κ��� �ڵ����� �����ǹǷ� �ʵ带 �� �ʿ䰡 ����.
	String dml = "insert into schoolchild "
	      + "(no, name, year, ban, gender, korean, english, math, sic, soc, music, total, avg)" + " values "
	      + "(null,?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";//no�� null�� �൵ ���� ���൵ ����.
	
	      Connection con = null;
	      PreparedStatement pstmt = null;
	      int count=0;
//	      StudentVO retval = null;//�ǹ� ����
		try {
	         // �� DBUtil Ŭ������ getConnection( )�޼���� �����ͺ��̽��� ����
	         con = DBUtil.getConnection(); //DBUtil�� 18���� Class.forName(driver);�� �ҷ��´�.

	         // �� �Է¹��� �л� ������ ó���ϱ� ���Ͽ� SQL������ ����
	         pstmt = con.prepareStatement(dml); //������ ���Ѱ�(19���� dml�� �ִ´�.)
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

	         // �� SQL���� ������ ó�� ����� ����
	         count = pstmt.executeUpdate(); //SQML���� insert into�� ���� �� �����´�.

//	         retval = new StudentVO();

	      } catch (SQLException e) {
	         System.out.println("e=[" + e + "]");
	      } catch (Exception e) {
	         System.out.println("e=[" + e + "]");
	      } finally {
	         try {
	            // �� �����ͺ��̽����� ���ῡ ���Ǿ��� ������Ʈ�� ����
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

	   // �� �л��� name�� �Է¹޾� ���� ��ȸ
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

	   // ������ �л��� ���� ���� 
	   public StudentVO getStudentUpdate(StudentVO svo, int no) throws Exception {
	      // �� ������ ó���� ���� SQL ��
	      String dml = "update schoolchild set " + " korean=?, english=?, math=?, sic=?, soc=?, music=?, total=?, avg=?  where no = ?";
	      Connection con = null;
	      PreparedStatement pstmt = null;
	      StudentVO retval = null;

	      try {
	         // �� DBUtil�̶�� Ŭ������ getConnection( )�޼���� �����ͺ��̽��� ����
	         con = DBUtil.getConnection();

	         // �� ������ �л� ������ �����ϱ� ���Ͽ� SQL������ ����
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

	         // �� SQL���� ������ ó�� ����� ����
	         int i = pstmt.executeUpdate();

	         if (i == 1) {
	            Alert alert = new Alert(AlertType.INFORMATION);
	            alert.setTitle("���� ����");
	            alert.setHeaderText("���� ���� �Ϸ�.");
	            alert.setContentText("���� ���� ����!!!");

	            alert.showAndWait();
	            retval = new StudentVO();
	         } else {
	            Alert alert = new Alert(AlertType.INFORMATION);
	            alert.setTitle("���� ����");
	            alert.setHeaderText("���� ���� ����.");
	            alert.setContentText("���� ���� ����!!!");

	            alert.showAndWait();
	         }

	      } catch (SQLException e) {
	         System.out.println("e=[" + e + "]");
	      } catch (Exception e) {
	         System.out.println("e=[" + e + "]");
	      } finally {
	         try {
	            // �� �����ͺ��̽����� ���ῡ ���Ǿ��� ������Ʈ�� ����
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
	      // �� ������ ó���� ���� SQL ��
	      String dml = "delete from schoolchild where no = ?";
	      Connection con = null;
	      PreparedStatement pstmt = null;

	      try {
	         // �� DBUtil�̶�� Ŭ������ getConnection( )�޼���� �����ͺ��̽��� ����
	         con = DBUtil.getConnection();

	         // �� SQL���� ������ ó�� ����� ����
	         pstmt = con.prepareStatement(dml);
	         pstmt.setInt(1, no);

	         // �� SQL���� ������ ó�� ����� ����
	         int i = pstmt.executeUpdate();

	         if (i == 1) {
	            Alert alert = new Alert(AlertType.INFORMATION);
	            alert.setTitle("�л� ����");
	            alert.setHeaderText("�л� ���� �Ϸ�.");
	            alert.setContentText("�л� ���� ����!!!");

	            alert.showAndWait();

	         } else {
	            Alert alert = new Alert(AlertType.INFORMATION);
	            alert.setTitle("�л� ����");
	            alert.setHeaderText("�л� ���� ����.");
	            alert.setContentText("�л� ���� ����!!!");

	            alert.showAndWait();
	         }

	      } catch (SQLException e) {
	         System.out.println("e=[" + e + "]");
	      } catch (Exception e) {
	         System.out.println("e=[" + e + "]");
	      } finally {
	         try {
	            // �� �����ͺ��̽����� ���ῡ ���Ǿ��� ������Ʈ�� ����
	            if (pstmt != null)
	               pstmt.close();
	            if (con != null)
	               con.close();
	         } catch (SQLException e) {
	         }
	      }

	   }

	   // �л� ��ü ����Ʈ
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

	   // �����ͺ��̽����� �л� ���̺��� �÷��� ����
	   public ArrayList<String> getColumnName() {
	      ArrayList<String> columnName = new ArrayList<String>();

	      String sql = "select * from schoolchild";
	      Connection con = null;
	      PreparedStatement pstmt = null;
	      ResultSet rs = null;
	      // ResultSetMetaData ��ü ���� ����
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

