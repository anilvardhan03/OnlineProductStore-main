package test;
import java.io.*;
import java.util.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@WebServlet("/Update")
public class AdminUpdateProduct extends HttpServlet{
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
	throws ServletException,IOException{
		HttpSession hs = req.getSession(false);
		if(hs==null) {
			req.setAttribute("msg","Session Expired.....<br>");
			req.getRequestDispatcher("AdminMsg.jsp").forward(req, res);
			
		}else {
			String pCode = req.getParameter("pCode");
			String pName = req.getParameter("pName");
			float Price = Float.parseFloat(req.getParameter("Price"));
			int qTy = Integer.parseInt(req.getParameter("qTy"));
			ArrayList<ProductBean> al = (ArrayList<ProductBean>)hs.getAttribute("alist");
			Iterator<ProductBean> it = al.iterator();
			while(it.hasNext()) {
				ProductBean pb = (ProductBean)it.next();
				if(pCode.equals(pb.getPcode())) {
					pb.setPname(pName);
					pb.setPrice(Price);
					pb.setQty(qTy);
					int k = new AdminProductUpdateDAO().Update(pb);
					if(k>0) {
						req.setAttribute("MSG", "Product Update Successful....<br>");
					}
				}
			}
			req.getRequestDispatcher("UpdateSuccess.jsp").forward(req, res);
		}
	}
}
