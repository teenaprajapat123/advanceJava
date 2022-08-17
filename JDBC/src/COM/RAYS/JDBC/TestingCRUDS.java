package COM.RAYS.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestingCRUDS {

	public static void main(String[] args) throws Exception {
		
		//testselect();
	    //testAdd();
		  testUpdate();
		  
	}
		  
	private static void testUpdate()throws Exception {
		
		  Class.forName("com.mysql.cj.jdbc.Driver");
			
		  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/com","root","root");
		    
		  Statement stmt = conn.createStatement();
		  
 int i = stmt.executeUpdate("Update company set  where id = 10");
		  
		  System.out.println(i +"Update....");
		
	}
	
	private static void testAdd() throws Exception {
        
	      Class.forName("com.mysql.cj.jdbc.Driver");
			
		  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/com","root","root");
		    
		  Statement stmt = conn.createStatement();
		  
		  int i = stmt.executeUpdate("insert into company values( 9, 'krishna' , 'prajapat' , 80000 , 2)");
		  int i1 = stmt.executeUpdate("insert into company values( 10, 'krishna' , 'prajapat' , 80000 , 2)");
		  int i2 = stmt.executeUpdate("insert into company values( 11, 'krishna' , 'prajapat' , 80000 , 2)");
		  int i3 = stmt.executeUpdate("insert into company values( 12, 'krishna' , 'prajapat' , 80000 , 2)");

		  
		  System.out.println(i + "inserted");
	}
	
	

	
private static void testselect() throws Exception {

		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/com","root","root");
		Statement smtt = conn.createStatement();
		ResultSet rs = smtt.executeQuery("select * from company");
		System.out.println("Id"+"\tfname"+"\t lname"+"\t     address");
		System.out.println("------------------------------------------");
		
		while (rs.next()) {
			System.out.print(""+rs.getString(1));
			System.out.print("\t"+rs.getString(2));
			System.out.print("\t"+rs.getString(3));
			System.out.print("    \t"+rs.getString(4));
			System.out.println("    \t"+rs.getString(5));
			
		}
	        rs.close();
		conn.close();
		smtt.close();
	}
}
