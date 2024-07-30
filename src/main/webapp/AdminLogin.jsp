<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import = "test.AdminBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Admin</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #101820; /* Set background color to #101820 */
        margin: 0;
        padding: 0;
        text-align: center;
        color: #ffffff; /* Set text color to white */
    }
    .container {
        padding: 50px;
    }
    a {
        display: inline-block;
        padding: 10px 20px;
        margin: 10px;
        background-color: #007bff;
        color: #ffffff;
        text-decoration: none;
        border-radius: 5px;
        font-size: 16px;
        transition: background-color 0.3s;
    }
    a:hover {
        background-color: #0056b3;
    }
</style>
</head>
<body>
    <div class="container">
        <%
        AdminBean ab = (AdminBean)session.getAttribute("abean");
        out.println("<h2>Welcome Admin: " + ab.getFname() + "</h2>");
        %>
        <a href="AddProduct.html">Add Product</a>
        <a href="Adminview">View All Products</a>
        <a href="Adminlogout">LogOut</a>
    </div>
</body>
</html>
