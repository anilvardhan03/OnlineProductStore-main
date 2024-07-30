package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/admin")
public class AdminLoginServlet extends HttpServlet{
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws
	ServletException,IOException{
		String uN = req.getParameter("uname");
		String pW = req.getParameter("pword");
		AdminBean ab = new AdminLoginDAO().Login(uN, pW);
		if(ab==null) {
			req.setAttribute("msg", "Invalid Username or Password.....<br>Please try Again...<br><br>");
			req.getRequestDispatcher("AdminMsg.jsp").forward(req, res);
		}else {
			HttpSession hs = req.getSession();
			hs.setAttribute("abean", ab);
			req.getRequestDispatcher("AdminLogin.jsp").forward(req, res);
		}
	}
}
;
