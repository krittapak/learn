<%-- 
    Document   : LoginView
    Created on : Sep 17, 2018, 6:22:17 PM
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
        <h1>login</h1>
        <form action="Login" method="post">
            User ID : <input type="text" name="userid">
            Password : <input type="password" name="password">
            <input type="submit">
        </form>
        <c:if test="${message != null}">
            ${message}
        </c:if>
    </body>
</html>
