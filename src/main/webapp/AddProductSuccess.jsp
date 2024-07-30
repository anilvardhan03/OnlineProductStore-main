<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import = "java.util.*,test.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to OnlineProductStore</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #101820;
        color: #ffffff;
        margin: 0;
        padding: 0;
        text-align: center;
    }
    .container {
        max-width: 600px;
        margin: 100px auto;
        padding: 20px;
        border-radius: 5px;
        background-color: #1f2a38;
    }
    .message {
        margin-bottom: 20px;
        font-size: 18px;
    }
</style>
</head>
<body>
    <div class="container">
        <div class="message">
            <% String msg = (String) session.getAttribute("msg"); %>
            <%= msg %>
        </div>
        <%@ include file="AdminLogin.jsp" %>
    </div>
</body>
</html>
