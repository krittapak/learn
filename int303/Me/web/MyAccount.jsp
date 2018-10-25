<%-- 
    Document   : MyAccount
    Created on : Oct 23, 2018, 12:32:47 PM
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
        <h1>Hello My Name Is ${sessionScope.Login.name}</h1>
        <h3>Balance : ${sessionScope.Login.balance}</h3>
        ${sessionScope.finish}
        <ul>
            <li> <a href="Deposit.jsp">Deposit</a></li>
            <li> <a href="Withdraw.jsp">Withdraw</a></li>
            <li> <a href="History">History</a></li>
            <hr>
            <li><a href="Logout">Logout</a></li>
        </ul>
    </body>
</html>
