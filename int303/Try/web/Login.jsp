<%-- 
    Document   : Login
    Created on : Sep 18, 2018, 6:13:15 PM
    Author     : Krittapak
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login Page</h1>
        <form action="Login" method="post">
            <input type="text" name="userid" required>
            <input type="password" name="password" required>
            <button type="submit">Login</button>
        </form>
         
    </body>
</html>
