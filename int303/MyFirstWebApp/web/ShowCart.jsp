<%-- 
    Document   : ShowCart
    Created on : Aug 9, 2018, 4:05:19 PM
    Author     : INT303
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Your Cart</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

    </head>
    <body>
        <div class="container">
            <h1>Your Cart</h1>
            <table class="table">
                <th>
                <td>No.</td>
                <td>Product</td>
                <td>Price</td>
                <td>Quantity</td>
                
                </th>
                <c:forEach items="${cart.getLineItems()}" var="s" varStatus="sp">
                    <tr>  
                        <td>${s.getProduct().getProductCode()}</td>
                        <td>${s.getProduct().getProductName()}</td>
                        <td>${s.getSalePrice()}</td>
                        <td>${s.getQuantity()}</td>
                        
                    </tr>
                </c:forEach>
                </tr>
                <td colspan="3">${cart.getTotalPrice()}</td>
                <td>${cart.getTotalQuantity()}</td>
                <td></td>
                </tr>
            </table>
        </div>
    </body>
</html>
