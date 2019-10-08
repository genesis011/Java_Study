package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// 드라이버를 적재, 아이디와 패스워드로 mysql 테이타베이스 연결요청->디비를 연결하는 객체참조 변수를 준다.

public class DBUtil {
// 1. 드라이버명을 통해서 적재(저장)
	private static String driver = "com.msql.jdbc.Driver";
//	2. 데이타 베이스 url저장 
	private static String url="jdbc:mysql://192.168.0.228/studentDB";//접근내용
	
//	2. 드라이버를 적재하고, 데이타베이스를 연결하는 함수
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
//		1. 진짜 드라이버) 드라이버 적재
		Class.forName(driver);
//		2. 데이타베이스를 연결
		Connection con = DriverManager.getConnection(url,"root","123456");
		return con;
	}
	
}
