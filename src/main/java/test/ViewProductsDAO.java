package test;
import java.util.*;
import java.sql.*;
public class ViewProductsDAO {
	public ArrayList<ProductBean> al = new ArrayList<ProductBean>();
	public ArrayList<ProductBean> retrieve(){
		try {
			Connection con = DBconnection.getCon();
			PreparedStatement ps = con.prepareStatement("select * from Product");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				ProductBean pb = new ProductBean();
				pb.setPcode(rs.getString(1));
				pb.setPname(rs.getString(2));
				pb.setPrice(rs.getFloat(3));
				pb.setQty(rs.getInt(4));
				al.add(pb);
			}
		}catch(Exception e) {System.out.println(e.toString());}
		return al;
	}

}
