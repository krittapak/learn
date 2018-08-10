<%-- 
    Document   : Header
    Created on : Aug 10, 2018, 3:12:37 PM
    Author     : INT303
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<table class="table">
    <tr>
        <td><h1>${param.title}</h1></td>
        <td>
            <c:if test="${cart!=null}">
                <a href="ShowCart">
                    <button type="button" class="btn btn-default btn-sm">
                        <span class="glyphicon glyphicon-shopping-cart"></span> Shopping Cart : ${cart.totalQuantity}
                    </button> 
                </a>
            </c:if>
            &nbsp;&nbsp;&nbsp;
            <c:choose>
                <c:when test="${sessionScope.user!=null}">
                    Hello ${sessionScope.user.name}
                </c:when>
                <c:otherwise>
                    Hello Guest
                </c:otherwise>
            </c:choose>
        </td>
    </tr>
</table>
<hr/>
