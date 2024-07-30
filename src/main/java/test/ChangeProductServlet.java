package test;
import  java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@WebServlet("/change")
public class ChangeProductServlet extends HttpServlet{
	protected void doGet(HttpServletRequest req,HttpServletResponse res)
			throws ServletException,IOException {
		HttpSession hs = req.getSession(false);
		if(hs==null) {
			req.setAttribute("msg", "Session Expired...<br>");
			req.getRequestDispatcher("AdminMsg.jsp").forward(req, res);
		}else {
			String pcode = req.getParameter("pcode");
			ArrayList<ProductBean> al = (ArrayList<ProductBean>)hs.getAttribute("alist");
			Iterator<ProductBean> it = al.iterator();
			while(it.hasNext()) {
				ProductBean pb = (ProductBean)it.next();
				if(pcode.equals(pb.getPcode())) {
					req.setAttribute("pbean", pb);
					break;
				}
			}req.getRequestDispatcher("ChangeProduct.jsp").forward(req, res);
		}	
	}
}
