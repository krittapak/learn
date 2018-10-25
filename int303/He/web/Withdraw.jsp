<%-- 
    Document   : Withdraw
    Created on : Oct 24, 2018, 9:10:31 PM
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
        <h1>Withdraw!</h1>
        <form action="Withdraw" method="post">
        <input min="0" type="number" required="" name="withdraw">
        <input type="submit">
        </form>
    </body>
</html>
