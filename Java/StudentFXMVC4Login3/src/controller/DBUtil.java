package controller;

import java.sql.Connection;
import java.sql.DriverManager;

// 이녀석이 하는일은 드라이버를 적재한다.
// 아이디와 패스워드로  mySql 데이터베이스 연결을 요청한다 -> 객체 참조 변수

public class DBUtil {
	
	//1. 드라이버 명을 통해서 적재한다.
	private static String driver = "com.mysql.jdbc.Driver";
	//2. 드라이버를 적재하고 데이터 베이스를 연결하는 함수를 만든다. url 저장
	private static String url="jdbc:mysql://localhost:3307/studentDB";
	//2. 드라이버를 적재하고 데이타 베이스를 연결하는 함수,
	public static Connection getConnection() throws Exception {
		//1. 드라이버를 적재한다.
		Class.forName(driver);
		//2. 데이타베이스 연결한다.
		Connection con =(Connection)DriverManager.getConnection(url, "root", "123456");
		return con;	
	}
}
