<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="test.CustomerBean" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Customer</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #101820;
        margin: 0;
        padding: 0;
        text-align: center;
        color: #ffffff;
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
        CustomerBean cb = (CustomerBean) session.getAttribute("cbean");
        out.println("<h2>Welcome: " + cb.getFname() + "</h2>");
        %>
        <br>
        <a href="view">View Products</a><br><br>
        <a href="logout">LogOut</a>
    </div>
</body>
</html>
