package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/Clogin")
public class CustomerLoginServlet extends HttpServlet{
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws
	ServletException,IOException{
		String uN = req.getParameter("uname");
		String pW = req.getParameter("pword");
		CustomerBean cb = new CustomerLoginDAO().Login(uN, pW);
		if(cb==null) {
			req.setAttribute("msg", "Invalid Username or Password.....<br>Please try Again... or Try Register..<br><br>");
			req.getRequestDispatcher("CustomerMsg.jsp").forward(req, res);
		}else {
			HttpSession hs = req.getSession();
			hs.setAttribute("cbean", cb);
			req.getRequestDispatcher("CustomerLogin.jsp").forward(req, res);
		}
	}
}
;
