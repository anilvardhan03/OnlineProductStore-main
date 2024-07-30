package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@WebServlet("/add")
public class AddProductServlet extends HttpServlet{
	protected void doPost(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException{
		ProductBean pb = new ProductBean();
		pb.setPcode(req.getParameter("pcode"));
		pb.setPname(req.getParameter("pname"));
		pb.setPrice(Float.parseFloat(req.getParameter("price")));
		pb.setQty(Integer.parseInt(req.getParameter("qty")));
		int k = new AddProductsDAO().AddProduct(pb);
		if(k>0) {
			HttpSession hs = req.getSession(false);
			hs.setAttribute("msg", "Product Added Successfully....<br>");
			req.getRequestDispatcher("AddProductSuccess.jsp").forward(req, res);
		}
	}
}