package test;
import java.sql.*;
public class DBconnection {
	public static Connection con = null;
	private DBconnection() {}
	static {
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection(DBinfo.dbUrl,DBinfo.uName,DBinfo.pWord);
		
	}catch(Exception e) {
		e.printStackTrace(); }
	}
	public static Connection getCon() {
		return con;
	}
}
		