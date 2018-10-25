<%-- 
    Document   : MyAccount
    Created on : Oct 24, 2018, 1:10:03 PM
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
        <h1>Hello My Name is ${sessionScope.Login.name}</h1>
        <h3>Balance is ${sessionScope.Login.balance}</h3><br>
        
        <a href="Deposit.jsp">Deposit</a><br>
        <a href="Withdraw.jsp">Withdraw</a><br>
        <a href="History">History</a><hr>
        <a href="Logout">Logout</a>
    </body>
</html>
