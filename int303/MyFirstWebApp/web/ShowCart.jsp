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
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/css/bootstrap.min.css" integrity="sha384-Smlep5jCw/wG7hdkwQ/Z5nLIefveQRIY9nfy6xoR1uRYBtpZgI6339F5dgvm/e9B" crossorigin="anonymous">
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-12">
                    <h1>Your Cart</h1>
                    <table class="table table-bordered table-hover">
                        <tr>
                            <td>No.</td>
                            <td>Product</td>
                            <td>Price</td>
                            <td>Quantity</td>
                        </tr>
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
                        </tr>
                    </table>
                </div>
            </div>
        </div>
    </body>
</html>
