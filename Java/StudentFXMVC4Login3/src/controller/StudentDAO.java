package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

import model.StudentVO;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class StudentDAO {
   private int i;

// �� �ű� �л� ���� ���
//	1. ����Ÿ�� �Է��ϴ� �κ�
   public int getStudentregiste(StudentVO svo) throws Exception {
      // �� ������ ó���� ���� SQL ��
      // �ش�� �ʵ� no�κ��� �ڵ����� �����ǹǷ� �ʵ带 �� �ʿ䰡 ����.
      String dml = "insert into schoolchild "
            + "(no, name, year, ban, gender, korean, english, math, sic, soc, music, total, avg)" + " values "
            + "(null, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

      Connection con = null;
      PreparedStatement pstmt = null;
      int count = 0;

      try {
         // �� DBUtil Ŭ������ getConnection( )�޼���� �����ͺ��̽��� ����
         con = DBUtil.getConnection();

         // �� �Է¹��� �л� ������ ó���ϱ� ���Ͽ� SQL������ ����
         pstmt = con.prepareStatement(dml); //������ ����??
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
         count = pstmt.executeUpdate();

         if (i == 1) {
				alertDisplay(5,"�л� ����","������","��������");

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
      return count;
   }

   

private void alertDisplay(int i, String string, String string2, String string3) {
	// TODO Auto-generated method stub
	
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
            retval = new StudentVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
                  rs.getInt(6), rs.getInt(7), rs.getInt(8), rs.getInt(9), rs.getInt(10), rs.getInt(11),
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
      String dml = "update schoolchild set "
            + " korean=?, english=?, math=?, sic=?, soc=?, music=?, total=?, avg=?  where no = ?";
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
//   �л� ���� ��� 
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
      String dml = "select * from schoolchild";

      Connection con = null;
      PreparedStatement pstmt = null;
      ResultSet rs = null; //����Ÿ���̽����� ���� �Խ÷� �����ϴ� ��� �����ϴ� ��ü
//      StudentVO emVo = null;
      StudentVO studentVO = null;
      try {
         con = DBUtil.getConnection();
         pstmt = con.prepareStatement(dml);
         rs = pstmt.executeQuery();
         while (rs.next()) {
        	 studentVO = new StudentVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
                  rs.getInt(6), rs.getInt(7), rs.getInt(8), rs.getInt(9), rs.getInt(10), rs.getInt(11),
                  rs.getInt(12), rs.getDouble(13));
            list.add(studentVO);
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