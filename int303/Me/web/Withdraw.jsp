<%-- 
    Document   : Withdraw
    Created on : Oct 23, 2018, 12:33:15 PM
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
        <form method="post" action="Withdraw">
            <input name="withdraw" type="number" require min="0">
            <input type="submit">
        </form>
        <hr>
        <a href="MyAccount">MyAccount</a>
    </body>
</html>
