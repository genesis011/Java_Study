package controller;

import java.sql.Connection;
import java.sql.DriverManager;

// �̳༮�� �ϴ����� ����̹��� �����Ѵ�.
// ���̵�� �н������  mySql �����ͺ��̽� ������ ��û�Ѵ� -> ��ü ���� ����

public class DBUtil {
	
	//1. ����̹� ���� ���ؼ� �����Ѵ�.
	private static String driver = "com.mysql.jdbc.Driver";
	//2. ����̹��� �����ϰ� ������ ���̽��� �����ϴ� �Լ��� �����. url ����
	private static String url="jdbc:mysql://localhost:3307/studentDB";
	//2. ����̹��� �����ϰ� ����Ÿ ���̽��� �����ϴ� �Լ�,
	public static Connection getConnection() throws Exception {
		//1. ����̹��� �����Ѵ�.
		Class.forName(driver);
		//2. ����Ÿ���̽� �����Ѵ�.
		Connection con =(Connection)DriverManager.getConnection(url, "root", "123456");
		return con;	
	}
}
