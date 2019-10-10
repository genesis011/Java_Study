//package model;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
//import controller.DBUtil;
//import model.StudentVO;
//
//public class StudentDAO {
//	// �� �ű� �л� ���� ���
//	public StudentVO getStudentregiste(StudentVO svo) throws Exception {
//		// �� ������ ó���� ���� SQL ��
//		String dml = "insert into schoolchild " + "(no, name, year, ban, gender, korean, english, math, sic, soc, music, total, avg)" + " values " + "(schoolchild_seq.nextval, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
//		Connection con = null;
//		PreparedStatement pstmt = null;
//		StudentVO retval = null;
//
//		try {
//			// �� DBUtil�̶�� Ŭ������ getConnection( )�޼���� �����ͺ��̽��� ����
//			con = DBUtil.getConnection();
//
//			// �� �Է¹��� �л� ������ ó���ϱ� ���Ͽ� SQL������ ����
//			pstmt = con.prepareStatement(dml);
//			pstmt.setString(1, svo.getName());
//			pstmt.setString(2, svo.getLevel());
//			pstmt.setString(3, svo.getBan());
//			pstmt.setString(4, svo.getGender());
//			pstmt.setInt(5, svo.getKorean());
//			pstmt.setInt(6, svo.getEnglish());
//			pstmt.setInt(7, svo.getMath());
//			pstmt.setInt(8, svo.getSic());
//			pstmt.setInt(9, svo.getSoc());
//			pstmt.setInt(10, svo.getMusic());
//			pstmt.setInt(11, svo.getTotal());
//			pstmt.setDouble(12, svo.getAvg());
//
//			// �� SQL���� ������ ó�� ����� ����
//			int i = pstmt.executeUpdate();
//
//			retval = new StudentVO();
//
//		} catch (SQLException e) {
//			System.out.println("e=[" + e + "]");
//		} catch (Exception e) {
//			System.out.println("e=[" + e + "]");
//		} finally {
//			try {
//				// �� �����ͺ��̽����� ���ῡ ���Ǿ��� ������Ʈ�� ����
//				if (pstmt != null)
//					pstmt.close();
//				if (con != null)
//					con.close();
//			} catch (SQLException e) {
//			}
//		}
//		return retval;
//	}
//}
