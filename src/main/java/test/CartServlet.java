package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/cart")
public class CartServlet extends HttpServlet{
	@SuppressWarnings("unused")
	protected void doGet(HttpServletRequest req, HttpServletResponse res) 
	throws ServletException , IOException {
		HttpSession hs = req.getSession(false);
		if(hs==null) {
			req.setAttribute("msg","Session Expired...<br>");
		}else {
			req.setAttribute("cart", "Order Added to Cart Successfully...<br>");
			req.getRequestDispatcher("Cart.jsp").forward(req, res);
		}
		
	}
}
