<%-- 
    Document   : readArticle
    Created on : Sep 21, 2014, 9:48:57 AM
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
        <title>Reading Page</title>
    </head>
    <body>

        <div id="article">
            <h3>Title: ${currentArticle.title}</h3>
            <h3>Author: ${currentArticle.authorName}</h3>
            <h3>Category: ${currentArticle.category}</h3>
            <h3>Publish date: ${currentArticle.publishDate}</h3>


            <div id="articlebody">
                <p>${currentArticle.content}</p>
            </div>




        </div>

        <h1>Comments for this article</h1>

        <table>
            <c:forEach var="comment" items="${comments}">
                <tr>


                    <td>${comment.commentor.firstName}: </td>
                    <td>${comment.body}</td>


                </tr>
                <tr>
                    <td>${comment.commentDate}</td>
                </tr>
            </c:forEach>
        </table>



        <div id ="comment" style="border: black thin solid">


            <sec:authorize access="hasRole('ROLE_USER')" >
                <form method="POST" action="../addcomment">

                    <input type="text" name="body"/>
                    <input type="submit" value="Comment"/>

                </form>
            </sec:authorize>


            <c:if test="${not isloggedin eq true}">
                <form method="POST" action="../addcomment">

                    <p> <input type="submit" value="Comment"/></p>

                </form>
            </c:if> 
        </div>

        <p><a href="../home2">Back To Articles</a></p>

        <c:if test="${isloggedin eq true}">
            <p>
                <a href="<c:url value="j_spring_security_logout" />" > Logout</a>
            </p>
        </c:if>

        <!---->


    </body>
</html>
