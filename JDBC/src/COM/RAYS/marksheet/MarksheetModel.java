package COM.RAYS.marksheet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class MarksheetModel {
	
	 ResourceBundle rb = ResourceBundle.getBundle("in.co.rays.rb.app");

	public void Add(MarksheetBean bean) throws Exception {
		
		 Class.forName(rb.getString("driver"));
		  Connection conn = DriverManager.getConnection(rb.getString("url"), rb.getString("username"), rb.getString("password"));
		    
		  Statement stmt = conn.createStatement();
		  
		  PreparedStatement ps = conn.prepareStatement("insert into marksheet vAlues(?,?,?,?,?,?,?);");
		  
		  ps.setInt(1, bean.getId());
		  ps.setString(4, bean.getRollno());
		  ps.setString(2, bean.getFname());
		  ps.setString(3, bean.getLname());
		  ps.setInt(5, bean.getPhy());
		  ps.setInt(6, bean.getChe());
		  ps.setInt(7, bean.getMat());
		  
		  
		  ps.executeUpdate();
		  System.out.println("------------");
	}
	
	 public static void Delete(MarksheetBean bean) throws Exception{
		  
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  
		  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet","root","root");
		    
	      Statement stmt = conn.createStatement();
	      conn.setAutoCommit(false);
	      
	      
	      PreparedStatement ps = conn.prepareStatement("delete from marksheet where id = ?");
	      
	      
	      ps.setInt(1, bean.getId());
	      
	      ps.executeUpdate();
	      conn.commit();
	      
	      conn.close();
	      
	      stmt.close();
	      
	      System.out.println("deleted........");
	  }


public void Update(MarksheetBean bean) throws Exception {
	

	
	  Class.forName("com.mysql.cj.jdbc.Driver");
		
	  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet","root","root");
	    
	  Statement stmt = conn.createStatement();
	  
	  PreparedStatement ps = conn.prepareStatement("update marksheet set fname = ?, lname = ? where id = ?");
	  
	  conn.setAutoCommit(false);
	  
	  ps.setString(1 ,  bean.getFname());
	  ps.setString(2, bean.getLname());
	  ps.setInt(3, bean.getId());
	  
	  ps.executeUpdate();

      conn.commit();
      
      stmt.close();
      
      System.out.println("Updated..............");    
      
}

     public MarksheetBean GetID(MarksheetBean m) throws Exception {

	
	  Class.forName("com.mysql.cj.jdbc.Driver");
		
	  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet","root","root");
	  
	  conn.setAutoCommit(false);
	  
	  PreparedStatement ps = conn.prepareStatement("select * from marksheet where rollno = ?");
	  
	  ps.setString(1, m.getRollno());
	  
	  ResultSet rs = ps.executeQuery();
	  	  
	  while (rs.next()) {
	
		  m.setId(rs.getInt(1));
		  m.setFname(rs.getString(2));
		  m.setLname(rs.getString(3));
		  m.setRollno(rs.getString(4));
		  m.setPhy(rs.getInt(5));
		  m.setChe(rs.getInt(6));
		  m.setMat(rs.getInt(7));
	 
	  
	  }
      
	  conn.commit();
	  
	  conn.close();
	  
	  ps.close();
	  
	  return m;
	
	  
	  
    }

	
	
	   public static List<MarksheetBean> meritList(MarksheetBean bean) throws Exception{
		   
		   Class.forName("com.mysql.cj.jdbc.Driver");
			
			  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet","root","root");
			  
			  conn.setAutoCommit(false);
			  
			  PreparedStatement ps = conn.prepareStatement("select * from marksheet");
			  
			  ResultSet rs = ps.executeQuery();
			  
			  
			  ArrayList<MarksheetBean> list = new ArrayList<MarksheetBean>();
			  
			  System.out.println("Id\troll no\tfname\tlname\tphy\tche\tmat");
			  
			  while (rs.next()) {
				 MarksheetBean m = new MarksheetBean();
				  m.setId(rs.getInt(1));
				  m.setFname(rs.getString(2));
				  m.setLname(rs.getString(3));
				  m.setRollno(rs.getString(4));
				  m.setPhy(rs.getInt(5));
				  m.setChe(rs.getInt(6));
				  m.setMat(rs.getInt(7));
			      list.add(m);
				
			}
			  
			  conn.commit();
			return list;

		   
		
	}
}
