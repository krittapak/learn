<%-- 
    Document   : History
    Created on : Oct 25, 2018, 9:21:57 AM
    Author     : Krittapak
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>History!</h1>
        <table border="1">
            <tr>
                <td>#</td>
                <td>TIME</td>
                <td>METHOD</td>
                <td>AMOUNT</td>
                <td>BALANCE</td>
            </tr>
            <c:forEach items="${history}" var="his" varStatus="vs">
                <tr>
                    <td>${vs.count}</td>
                    <td>${his.time}</td>
                    <td>${his.method}</td>
                    <td>${his.amount}</td>
                    <td>${his.balance}</td>
                </tr>
            </c:forEach>
        </table>
        <hr>
        <a href="MyAccount">MyAccount</a>
    </body>
</html>
