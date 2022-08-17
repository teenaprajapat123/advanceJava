package COM.RAYS.marksheet;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.mysql.cj.protocol.x.ReusableOutputStream;

public final class jdbcDataSource {

	private static jdbcDataSource jds; 
	
	private ComboPooledDataSource ds;
	
	public jdbcDataSource() throws Exception {
		
		ds = new ComboPooledDataSource();
		ds.setDriverClass("com.mysql.cj.jdbc.Driver");
		ds.setJdbcUrl("jdbc:mysql://localhost:3306/marksheet");
		ds.setUser("root");
		ds.setPassword("root");
		ds.setInitialPoolSize(5);
		ds.setAcquireIncrement(5);
		ds.setMaxPoolSize(5);
		
		
	}
	
	public static jdbcDataSource getInstence() throws Exception {
		if (jds == null) {
			jds = new jdbcDataSource();
		}
		return jds;
	}
	
	public static Connection getConnection() throws SQLException, Exception {
		return getInstence().ds.getConnection();
	}
	public static void closeconnection(Connection conn , Statement stmt , ResultSet rs) throws SQLException {
		if(rs != null)
			rs.close();
		if (stmt!= null)
			stmt.close();
		if (conn!= null)
			conn.close();
	}
	
	public static void closeconnection(Connection conn) throws SQLException {
		closeconnection(conn , null ,null);
		
	}
public static void main(String[] args) throws SQLException, Exception {
	for (int i = 0; i < 6; i++) {
		
	
	String sql = "select * from marksheet";
	Connection conn = jdbcDataSource.getConnection();
	Statement stmt = conn.createStatement();
	ResultSet rs = stmt.executeQuery(sql);
	System.out.println("DB pool connection");
	System.out.println("Id\tfname\tlname\trollno\tphy\tche\tmat");
	while (rs.next()) {
		System.out.print(rs.getInt(1));
		System.out.print("\t"+rs.getString(2));
		System.out.print("\t"+rs.getString(3));
		System.out.print("\t"+rs.getString(4));
		System.out.print("\t"+rs.getInt(5));
		System.out.print("\t"+rs.getInt(6));
		System.out.println("\t"+rs.getInt(7));
		
	}
	
	
}


}}