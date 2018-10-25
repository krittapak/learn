<%-- 
    Document   : MyAccount
    Created on : Oct 25, 2018, 9:21:48 AM
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
        <h1>Hello My Name Is ${sessionScope.Login.name}!</h1>
        <h1> ${sessionScope.Login.balance}!</h1>
        <hr>
        ${msg}
        <hr>
        <a href="Deposit">Deposit</a>
        <a href="Withdraw">Withdraw</a>
        <a href="History">History</a>
        <a href="Logout">Logout</a>
    </body>
</html>
