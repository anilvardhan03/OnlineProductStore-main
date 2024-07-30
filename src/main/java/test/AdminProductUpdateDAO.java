package test;
import java.sql.*;
public class AdminProductUpdateDAO {
	public int k = 0;
	public int Update(ProductBean pb) {
		try {
			Connection con = DBconnection.getCon();
			PreparedStatement ps = con.prepareStatement("update Product set name = ? , price = ? , qty = ? where pcode = ? ");
			ps.setString(1, pb.getPname());
			ps.setFloat(2, pb.getPrice());
			ps.setInt(3, pb.getQty());
			ps.setString(4,pb.getPcode());
			k = ps.executeUpdate();
		}catch(Exception e) {System.out.println(e.toString());}
		return k;
	}
}
