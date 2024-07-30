package test;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
@SuppressWarnings("serial")
@WebServlet("/logout")
public class CustomerLogoutServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
		throws ServletException,IOException {
		HttpSession hs = req.getSession(false);
		if(hs==null) {
			req.setAttribute("msg","Session Expired...<br>");
		}else {
			hs.removeAttribute("cbean");
			hs.removeAttribute("alist");
			hs.invalidate();
			req.setAttribute("msg","Logged Out Successfully.....<br>");
			req.getRequestDispatcher("CustomerMsg.jsp").forward(req, res);
		}
		
	}
	
	
	
}