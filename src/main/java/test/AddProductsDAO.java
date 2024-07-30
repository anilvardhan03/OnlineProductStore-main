package test;
import java.sql.*;
public class AddProductsDAO {
	public int k = 0;
	public int AddProduct(ProductBean pb) {
		try {
			Connection con = DBconnection.getCon();
			PreparedStatement ps = con.prepareStatement("insert into Product values(?,?,?,?)");
			ps.setString(1, pb.getPcode());
			ps.setString(2,pb.getPname());
			ps.setFloat(3,pb.getPrice());
			ps.setInt(4, pb.getQty());
			k = ps.executeUpdate();
		}catch(Exception e) {System.out.println(e.toString());}
		return k;
	}
}
