<%-- 
    Document   : activate
    Created on : Sep 20, 2018, 3:03:49 PM
    Author     : Krittapak
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Activate</title>
    </head>
    <body>
        <div>
            <form action="ActivateServlet" method="post">
                
                <input type="text" name="userid" value="${User.userid}" hidden>
                <input type="submit">
            </form>
        </div>
        <div>
            <c:if test="${message != null}">
                ${message}
            </c:if>
        </div>
    </body>
</html>
