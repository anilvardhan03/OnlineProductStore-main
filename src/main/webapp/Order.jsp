<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order Confirmation</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f0f0f0; /* Set background color */
        margin: 0;
        padding: 0;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }
    a {
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
    .message {
        margin-bottom: 20px;
        font-size: 18px;
        color: #ff0000; /* Set message text color */
    }
</style>
</head>
<body>
    <div class="message">
        <% String msg = (String) request.getAttribute("ord"); %>
        <%= msg %>
    </div>
    <a href="view">View Products</a>
    <a href="logout">Log Out</a>
</body>
</html>
