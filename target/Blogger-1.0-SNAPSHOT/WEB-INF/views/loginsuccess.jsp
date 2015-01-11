<%-- 
    Document   : loginsuccess
    Created on : Sep 22, 2014, 12:06:45 AM
    Author     : kokob
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>You have successfully logged in.</h1>

        <form action ="continue" method="POST">
            <input type="submit" value="Continue"/>
        </form>
    <c:if test="${isloggedin eq true}">
        <p>
            <a href="<c:url value="j_spring_security_logout" />" > Logout</a>
        </p>
    </c:if>

</body>
</html>
