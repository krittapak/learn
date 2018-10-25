<%-- 
    Document   : Login
    Created on : Oct 24, 2018, 9:08:04 PM
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
        <form action="Login" method="post">
            Account ID : <input type="number" name="accountId" required="">
            Pin : <input type="number" name="pin" required="">
            <input type="submit">
            ${message}
        </form>
        
    </body>
</html>
