package test;
import java.sql.*;
public class CustomerRegisterDAO {
	public int k = 0;
	public int register(CustomerBean cb) {
		try {
			Connection con = DBconnection.getCon();
			PreparedStatement ps = con.prepareStatement("insert into CustomerData values(?,?,?,?,?,?,?)");
			ps.setString(1,cb.getuName());
			ps.setString(2,cb.getpWord());
			ps.setString(3,cb.getFname());
			ps.setString(4,cb.getLname());
			ps.setString(5,cb.getAddr());
			ps.setString(6,cb.getmId());
			ps.setLong(7,cb.getPhno());
			k = ps.executeUpdate();
		}catch(Exception e) {System.out.println(e.toString());}
		return k;
	}
}
