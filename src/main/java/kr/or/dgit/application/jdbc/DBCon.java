package kr.or.dgit.application.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import javax.swing.JOptionPane;

public class DBCon {
	private static final DBCon instance = new DBCon(); // singletone pattern

	private Connection connection;

	public static DBCon getInstance() {
		return instance;
	}

	private DBCon() { // singletone 패턴시 생성자 private 외부에서 접근금지
		// String url = "jdbc:mysql://localhost:3306/erp_project";
		// String user = "root";
		// String password = "rootroot";

		try {
			// connection = DriverManager.getConnection(url, user, password);
			LoadProperties pro = new LoadProperties();
			Properties info = pro.getProperties();
			connection = DriverManager.getConnection(info.getProperty("url"), info);
		} catch (SQLException e) {
			System.err.printf("%s = %s%n", e.getMessage(), e.getErrorCode());
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		return connection;
	}
	
	public void connectionClose() {
		try {
			connection.close();
			JOptionPane.showMessageDialog(null, "DB연결 해제되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
