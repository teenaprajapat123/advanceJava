package COM.RAYS.JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class Testcallable {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/com","root","root");
		CallableStatement cal = conn.prepareCall("{call comp(?)}");
		cal.registerOutParameter(1, Types.INTEGER);
		cal.execute();
		int count = cal.getInt(1);
		System.out.println("total rows are :" + count);
	}
}
