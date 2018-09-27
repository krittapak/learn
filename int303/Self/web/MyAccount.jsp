<%-- 
    Document   : MyAccount
    Created on : Sep 24, 2018, 3:56:36 PM
    Author     : Krittapak
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Account Page</title>
    </head>
    <body>
        <h1>My Account Page</h1>
        ${sessionScope.accountid.name} <br>
        balance ${sessionScope.accountid.balance}<br>
        <a href="DepositPage">Deposit</a><br>
        <a href="WithdrawPage">Withdraw</a><br>
        <a href="HistoryPage">History</a>
        <hr>
        <a href="Logout">Logout</a>
    </body>
</html>
