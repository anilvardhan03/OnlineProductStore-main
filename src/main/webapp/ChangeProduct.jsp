<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import = "java.util.*,test.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Product</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f0f0f0;
        margin: 0;
        padding: 20px;
    }
    form {
        max-width: 600px;
        margin: 0 auto;
        padding: 20px;
        background-color: #ffffff;
        border-radius: 5px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }
    label {
        display: block;
        margin-bottom: 10px;
    }
    input[type="text"],
    input[type="submit"] {
        width: calc(100% - 20px);
        padding: 10px;
        margin-bottom: 15px;
        border: 1px solid #ccc;
        border-radius: 4px;
        box-sizing: border-box;
    }
    input[type="submit"] {
        background-color: #007bff;
        color: #ffffff;
        cursor: pointer;
        transition: background-color 0.3s;
    }
    input[type="submit"]:hover {
        background-color: #0056b3;
    }
</style>
</head>
<body>
<%
	AdminBean ab = (AdminBean)session.getAttribute("abean");
	ProductBean pb = (ProductBean)request.getAttribute("pbean");
	out.println("Page Belongs to : "+ab.getFname()+"<br>");
	%>
    <form action="Update" method="post">
        <label for="pCode">Product Code:</label>
        <input type="text" name="pCode" value="<%= pb.getPcode() %>" readonly> <!-- Use readonly attribute to prevent changes -->
        
        <label for="pName">Product Name:</label>
        <input type="text" name="pName" value="<%= pb.getPname() %>">
        
        <label for="Price">Product Price:</label>
        <input type="text" name="Price" value="<%= pb.getPrice() %>">
        
        <label for="qTy">Product Qty:</label>
        <input type="text" name="qTy" value="<%= pb.getQty() %>">
        
        <input type="submit" value="Update">
    </form>
</body>
</html>
