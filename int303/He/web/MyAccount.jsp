<%-- 
    Document   : MyAccount
    Created on : Oct 24, 2018, 9:08:33 PM
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
        <h1>Hello My name is ${sessionScope.Login.name}</h1>
        <h1>Hello My balance is ${sessionScope.Login.balance}</h1>
        ${msg}
        
        <a href="Deposit">Deposit</a>
        <a href="Withdraw">Withdraw</a>
        <a href="History">History</a>
        <a href="Logout">Logout</a>
    </body>
</html>
