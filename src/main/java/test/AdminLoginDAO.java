package test;
import java.sql.*;

public class AdminLoginDAO {
	public AdminBean ab = null;
	public AdminBean Login(String uN,String pW) {
		try {
			Connection con = DBconnection.getCon();
			PreparedStatement ps = con.prepareStatement("select * from AdminData where uname = ? and pword = ?");
			ps.setString(1, uN);
			ps.setString(2, pW);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				ab = new AdminBean();
				ab.setuName(rs.getString(1));
				ab.setpWord(rs.getString(2));
				ab.setFname(rs.getString(3));
				ab.setLname(rs.getString(4));
				ab.setAddr(rs.getString(5));
				ab.setmId(rs.getString(6));
				ab.setPhno(rs.getLong(7));
			}
		}catch(Exception e) {System.out.println(e.toString());}
		return ab;
	}
}
