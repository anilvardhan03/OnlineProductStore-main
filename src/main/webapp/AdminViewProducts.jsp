<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import ="java.util.*,test.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product List</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f0f0f0;
        margin: 0;
        padding: 20px;
    }
    .container {
        max-width: 800px;
        margin: 0 auto;
        background-color: #ffffff;
        padding: 20px;
        border-radius: 5px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }
    .header {
        font-size: 24px;
        margin-bottom: 20px;
    }
    .product-item {
        margin-bottom: 10px;
        padding: 10px;
        background-color: #f9f9f9;
        border-radius: 5px;
    }
    .product-item a {
        text-decoration: none;
        color: #007bff;
        margin-left: 10px;
    }
    .product-item a:hover {
        text-decoration: underline;
    }
    .logout-link {
        display: block;
        margin-top: 20px;
    }
</style>
</head>
<body>
    <div class="container">
        <% 
AdminBean ab = (AdminBean)session.getAttribute("abean");
ArrayList<ProductBean> al = (ArrayList<ProductBean>)session.getAttribute("alist");
%>
<div class="header">Page Belongs to : <%= (ab != null) ? ab.getFname() : "Unknown" %></div>

        <% if (al.size() == 0) { %>
            <div>Unexpected Error. Please Try Again....</div>
        <% } else { %>
            <% Iterator<ProductBean> it = al.iterator();
            while (it.hasNext()) {
                ProductBean pb = (ProductBean)it.next();
                %>
                <div class="product-item">
				<%= pb.getPcode() %> &nbsp;&nbsp; <%= pb.getPname() %> &nbsp;&nbsp; <%= pb.getPrice() %> &nbsp;&nbsp; <%= pb.getQty() %> &nbsp;&nbsp;
                    <a href='change?pcode=<%= pb.getPcode() %>'>Update</a>
                    <a href='delete?pcode=<%= pb.getPcode() %>'>Delete</a>
                </div>
            <% } %>
        <% } %>
        <a href="Adminlogout" class="logout-link">Logout</a>
    </div>
</body>
</html>
