<%-- 
    Document   : Login
    Created on : Oct 23, 2018, 12:32:33 PM
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
        <h1>Login!</h1>
        <div>
            <form action="Login" method="post">
            Account Id <input name="accountid" type="number" required><br>
            Pin <input type="number" name="pin" required><br>
            <input type="submit">
            </form>
            
        </div>
        <h3>${Wrong}</h3>
    </body>
</html>
