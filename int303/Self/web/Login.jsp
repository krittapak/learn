<%-- 
    Document   : login
    Created on : Sep 24, 2018, 3:55:01 PM
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
        <form action="Login" method="post">
            <input name="accountid" type="text" required>
            <input name="pin" type="text" required>
            <input type="submit">
            
        </form>
    </body>
</html>
