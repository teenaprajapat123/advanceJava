package COM.RAYS.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.omg.CORBA.PRIVATE_MEMBER;

public class TestDynamicStmt {

	public static void main(String[] args) throws Exception {
	
	     //testGetId();
	    //testadd();
		  //testUpdate();
		testselect();
	}
		private static void testselect() throws Exception {

		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/com","root","root");
		Statement smtt = conn.createStatement();
		ResultSet rs = smtt.executeQuery("select * from company where Id = 3");
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
		
		
	}
		private static void testUpdate()throws Exception {
		
		  Class.forName("com.mysql.cj.jdbc.Driver");
			
		  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/com","root","root");
		    
		  Statement stmt = conn.createStatement();
		  
		  int id = 8;
		  String fn = "krishna";
	//	  String ln = "Rani";
	//	  int sal = 90000;
	//	  int did = 4;
		  
		  int i = stmt.executeUpdate("Update company set fname = 'krishna' where id = 8");
		  
		  System.out.println(i +"  "+"Update....");
		
	}
	      private static void testGetId() throws Exception {

	    		Class.forName("com.mysql.cj.jdbc.Driver");
	    		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/com","root","root");
	    		Statement smtt = conn.createStatement();
	    		ResultSet rs = smtt.executeQuery("select * from company where Id = 2");
	    		System.out.println("here you go.... ");
	    		System.out.println("Id"+"\tfname"+"\t lname"+"\t     address");
	    		System.out.println("___________________________________________");
	    		while (rs.next()) {
	    			System.out.print(""+rs.getString(1));
	    			System.out.print("\t"+rs.getString(2));
	    			System.out.print("\t"+rs.getString(3));
	    			System.out.print("    \t"+rs.getString(4));
	    			System.out.println("    \t"+rs.getString(5));
	    			
	    		}
	    			//int id = 8;
	    			 //String fn = "Radha";
	    			  //String ln = "Rani";
	    			  //int sal = 90000;
	    			  //int did = 4;
	      
	      
	}

	private static void testadd() throws Exception {
         
      Class.forName("com.mysql.cj.jdbc.Driver");
		
	  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/com","root","root");
	    
	  Statement stmt = conn.createStatement();
	  
	  int id = 8;
	  String fn = "Radha";
	  String ln = "Rani";
	  int sal = 90000;
	  int did = 4;
	  
	  int i = stmt.executeUpdate("insert into company values("+id+",'"+fn+"','"+ln+"',"+sal+","+did+")");
	  
	  System.out.println(i  +  " Inserted");
	  
	  conn.close();
	  stmt.close();
	}
}
