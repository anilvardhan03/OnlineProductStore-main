<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #101820;
        margin: 0;
        padding: 0;
    }
    .message {
        margin: 20px auto;
        max-width: 600px;
        padding: 20px;
        background-color: #101820; /* Set container background color */
        border-radius: 8px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); /* Add shadow effect */
    }
    .message p {
        font-size: 18px;
        color: #ff0000; /* Set message text color */
    }
</style>
</head>
<body>
    <div class="message">
        <%
        String msg = (String) request.getAttribute("msg");
        if (msg != null && !msg.isEmpty()) {
        %>
        <p>
            <%= msg %>
        </p>
        <% } %>
        <%@ include file="ADMINLogin.html" %>
    </div>
</body>
</html>
