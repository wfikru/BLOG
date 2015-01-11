<%-- 
    Document   : home
    Created on : Sep 20, 2014, 10:54:22 PM
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
        <title>Home Page</title>
    </head>
    <body>
        <h1>Home page!</h1>

        <div>
            <h1>Articles currently in my blog</h1>
            <table>
                <c:forEach var="article" items="${articles}">
                    <tr>

                        <td><a href="articles/${article.id}"> ${article.title} </a></td>

                    </tr>
                </c:forEach>
            </table>

        </div>

        <div>
            <c:if test="${not isloggedin eq true}">
                <p>Please <a href="readerSignup">Sign up</a></p>

                <p>Please <a href="login.jsp">Sign-In</a></p>
            </c:if>

            <c:if test="${isloggedin eq true}">
                <p>
                    <a href="<c:url value="j_spring_security_logout" />" > Logout</a>
                </p>
                
                <p>Welcome ${currentReader.firstName}</p>
                
            </c:if>


            <sec:authorize access="hasRole('ROLE_ADMIN')" >
                <p><a href="addArticle">Add Article</a></p>
            </sec:authorize>



        </div>
        

    </body>
</html>
