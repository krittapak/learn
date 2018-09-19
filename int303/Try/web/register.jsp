<%-- 
    Document   : register
    Created on : Sep 18, 2018, 5:04:24 PM
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
        <div>
            <form action="Register" method="post">
                <input type="text" name="userid" required>
                <input type="text" name="fname" required>
                <input type="text" name="username" required>
                <input type="password" name="password" required>
                <button type="submit">submit</button>
            </form>
        </div>
    </body>
</html>
