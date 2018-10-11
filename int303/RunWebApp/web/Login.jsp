<%-- 
    Document   : Login
    Created on : Oct 10, 2018, 5:20:46 PM
    Author     : Krittapak
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Login</h1>
        <h3 style="color: red">${msg}</h3>
        <form action="Login" method="post">
            ID: <input type="number" name="id" required><br>
            PIN: <input type="password" name="pin" required><br>
            <input type="submit" value="submit">
        </form>
    </body>
</html>
