package in.co.rays.callable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestingCallable {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/com","root","root");
		Statement smtt = conn.createStatement();
		conn.setAutoCommit(false);
		smtt.executeUpdate("");
	}
}
