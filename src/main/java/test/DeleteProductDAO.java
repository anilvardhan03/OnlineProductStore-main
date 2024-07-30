package test;
import java.sql.*;
public class DeleteProductDAO {
	public int k = 0;
	public int Delete(ProductBean pb) {
		try {
			Connection con = DBconnection.getCon();
			PreparedStatement ps = con.prepareStatement("delete from Product where pcode = ?");
			ps.setString(1, pb.getPcode());
			k = ps.executeUpdate();
		}catch(Exception e) {System.out.println(e.toString());}
		return k;
		
	}
}
