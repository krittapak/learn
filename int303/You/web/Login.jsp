<%-- 
    Document   : Login
    Created on : Oct 24, 2018, 1:08:43 PM
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
        <h1>Login</h1>
        <form method="post" action="Login">
            AccountId : <input type="number" name="accountId" required>
            Pin : <input type="number" name="pin" required>
            <input type="submit">
            
        </form>
        ${message}
    </body>
</html>
