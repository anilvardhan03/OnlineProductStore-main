package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/order")
public class OrderServlet extends HttpServlet{
	@SuppressWarnings("unused")
	protected void doGet(HttpServletRequest req, HttpServletResponse res) 
	throws ServletException , IOException {
		HttpSession hs = req.getSession(false);
		if(hs==null) {
			req.setAttribute("msg","Session Expired...<br>");
		}else {
			req.setAttribute("ord", "Order Placed Successfully...<br>");
			req.getRequestDispatcher("Order.jsp").forward(req, res);
		}
		
	}
}
