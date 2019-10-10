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
//	// ① 신규 학생 점수 등록
//	public StudentVO getStudentregiste(StudentVO svo) throws Exception {
//		// ② 데이터 처리를 위한 SQL 문
//		String dml = "insert into schoolchild " + "(no, name, year, ban, gender, korean, english, math, sic, soc, music, total, avg)" + " values " + "(schoolchild_seq.nextval, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
//		Connection con = null;
//		PreparedStatement pstmt = null;
//		StudentVO retval = null;
//
//		try {
//			// ③ DBUtil이라는 클래스의 getConnection( )메서드로 데이터베이스와 연결
//			con = DBUtil.getConnection();
//
//			// ④ 입력받은 학생 정보를 처리하기 위하여 SQL문장을 생성
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
//			// ⑤ SQL문을 수행후 처리 결과를 얻어옴
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
//				// ⑥ 데이터베이스와의 연결에 사용되었던 오브젝트를 해제
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
