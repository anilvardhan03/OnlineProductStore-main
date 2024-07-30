package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@WebServlet("/delete")
public class DeleteProductServlet extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        HttpSession hs = req.getSession(false);
        if (hs == null) {
            req.setAttribute("msg", "Session Expired...<br>");
            req.getRequestDispatcher("Msg.jsp").forward(req, res);
        } else {
        	ProductBean pb = new ProductBean();
        	String pcode = req.getParameter("pcode");
        	pb.setPcode(pcode);
        	
        	int  k = new DeleteProductDAO().Delete(pb);
        	if(k>0) {
                req.setAttribute("msg", "Product Deleted Successfully...<br>");
        	}
            req.getRequestDispatcher("DeleteSuccess.jsp").forward(req, res);
        }
	}
}
