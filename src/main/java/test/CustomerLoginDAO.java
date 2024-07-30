package test;
import java.sql.*;

public class CustomerLoginDAO {
	public CustomerBean cb = null;
	public CustomerBean Login(String uN,String pW) {
		try {
			Connection con = DBconnection.getCon();
			PreparedStatement ps = con.prepareStatement("select * from CustomerData where uname = ? and pword = ?");
			ps.setString(1, uN);
			ps.setString(2, pW);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				cb = new CustomerBean();
				cb.setuName(rs.getString(1));
				cb.setpWord(rs.getString(2));
				cb.setFname(rs.getString(3));
				cb.setLname(rs.getString(4));
				cb.setAddr(rs.getString(5));
				cb.setmId(rs.getString(6));
				cb.setPhno(rs.getLong(7));
			}
		}catch(Exception e) {System.out.println(e.toString());}
		return cb;
	}
}
