package COM.RAYS.JDBC;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestCRUD {
public static void main(String[] args) throws Exception {
	
	//testselect();
	  testGetId(1);
}

private static void testselect() throws Exception {
}

private static void testGetId(int i) throws Exception {
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/com","root","root");
	Statement smtt = conn.createStatement();
	ResultSet rs = smtt.executeQuery("select * from company where Id = 2");
	
	while (rs.next()) {
		System.out.print(""+rs.getString(1));
		System.out.print("\t"+rs.getString(2));
		System.out.print("\t"+rs.getString(3));
		System.out.print("    \t"+rs.getString(4));
		System.out.println("    \t"+rs.getString(5));
		
	}
        rs.close();
        smtt.close();
        conn.close();
	}
	
	
}

