package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// ����̹��� ����, ���̵�� �н������ mysql ����Ÿ���̽� �����û->��� �����ϴ� ��ü���� ������ �ش�.

public class DBUtil {
// 1. ����̹����� ���ؼ� ����(����)
	private static String driver = "com.msql.jdbc.Driver";
//	2. ����Ÿ ���̽� url���� 
	private static String url="jdbc:mysql://192.168.0.228/studentDB";//���ٳ���
	
//	2. ����̹��� �����ϰ�, ����Ÿ���̽��� �����ϴ� �Լ�
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
//		1. ��¥ ����̹�) ����̹� ����
		Class.forName(driver);
//		2. ����Ÿ���̽��� ����
		Connection con = DriverManager.getConnection(url,"root","123456");
		return con;
	}
	
}
