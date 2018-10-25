<%-- 
    Document   : Deposit
    Created on : Oct 25, 2018, 9:22:12 AM
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
        <h1>Deposit!</h1>
        <form  action="Deposit" method="post">
            <input type="number" required="" min="0" name="deposit">
            <input type="submit">
        </form>
    </body>
</html>
