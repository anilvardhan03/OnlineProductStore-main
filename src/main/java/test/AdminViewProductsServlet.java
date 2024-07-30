package test;
import java.io.*;
import java.util.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/Adminview")
public class AdminViewProductsServlet extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException,IOException{
		HttpSession hs = req.getSession(false);
		if(hs==null) {
			req.setAttribute("msg","Session Expired Relogin....<br>");
			req.getRequestDispatcher("AdminMsg.jsp").forward(req, res);
		}else {
			ArrayList<ProductBean> al = new ViewProductsDAO().retrieve();
			hs.setAttribute("alist", al);
			req.getRequestDispatcher("AdminViewProducts.jsp").forward(req, res);
		}
	}
}
