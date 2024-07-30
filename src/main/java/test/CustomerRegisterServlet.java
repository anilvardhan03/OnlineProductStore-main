package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/reg")
public class CustomerRegisterServlet extends HttpServlet{
	protected void doPost(HttpServletRequest req , HttpServletResponse res) 
			throws IOException,ServletException{
		CustomerBean ub = new CustomerBean();
		ub.setuName(req.getParameter("uname"));
		ub.setpWord(req.getParameter("pword"));
		ub.setFname(req.getParameter("fname"));
		ub.setLname(req.getParameter("lname"));
		ub.setAddr(req.getParameter("addr"));
		ub.setmId(req.getParameter("mid"));
		ub.setPhno(Long.parseLong(req.getParameter("phno")));
		int k = new CustomerRegisterDAO().register(ub);
		if(k>0) {
			req.setAttribute("msg","User Registration Successful...<br>");
			req.getRequestDispatcher("RegSuccess.jsp").forward(req, res);
		}
	}
}
