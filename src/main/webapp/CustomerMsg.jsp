<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Login</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #101820;
        margin: 0;
        padding: 0;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }
    .container {
        background-color: ; /* Set container background color */
        padding: 20px;
        border-radius: 5px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); /* Add shadow effect */
    }
    .message {
        margin-bottom: 20px;
        font-size: 18px;
        color: #ff0000; /* Set message text color */
    }
</style>
</head>
<body>
    <div class="container">
        <% 
        String msg = (String) request.getAttribute("msg");
        if (msg != null && !msg.isEmpty()) {
        %>
        <div class="message">
            <%= msg %>
        </div>
        <% } %>
        <%@ include file="CustomerLogin.html" %>
    </div>
</body>
</html>
