<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import ="java.util.*,test.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Dashboard</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f0f0f0; /* Set background color */
        margin: 0;
        padding: 0;
    }
    .container {
        max-width: 800px;
        margin: 20px auto;
        padding: 20px;
        background-color: #ffffff; /* Set container background color */
        border-radius: 5px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); /* Add shadow effect */
    }
    .product {
        margin-bottom: 10px;
        padding: 10px;
        border-radius: 5px;
    }
    .product a {
        padding: 5px 10px;
        margin-left: 10px;
        text-decoration: none;
        background-color: #007bff;
        color: #ffffff;
        border-radius: 5px;
        transition: background-color 0.3s;
    }
    .product a:hover {
        background-color: #0056b3;
    }
    .logout {
        display: block;
        margin-top: 20px;
        text-align: center;
    }
</style>
</head>
<body>
    <div class="container">
        <%
        CustomerBean cb = (CustomerBean)session.getAttribute("cbean");
        ArrayList<ProductBean> al = (ArrayList<ProductBean>)session.getAttribute("alist");
        out.println("Page Belongs to: " + cb.getFname() + "<br>"+"<br>"); 
        if (al.size() == 0) {
            out.println("Unexpected Error. Please Try Again....<br>");
        } else {
            Iterator<ProductBean> it = al.iterator();
            while (it.hasNext()) {
                ProductBean pb = (ProductBean)it.next();
        %>
        <div class="product">
            <%= pb.getPname() %> &nbsp;&nbsp; <%= pb.getPrice() %> &nbsp;&nbsp; <%= pb.getQty() %>
            <a href='order?pcode=<%= pb.getPcode() %>'>Buy Now</a>
            <a href='cart?pcode=<%= pb.getPcode() %>'>Add to Cart</a>
        </div>
        <%
            }
        }
        %>
        <a class="logout" href="logout">Logout</a>
    </div>
</body>
</html>
