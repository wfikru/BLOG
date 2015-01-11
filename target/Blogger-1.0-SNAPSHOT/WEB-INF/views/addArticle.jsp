<%-- 
    Document   : addArticle
    Created on : Sep 20, 2014, 9:15:15 PM
    Author     : kokob
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Article</title>
    </head>
    <body>
        <form action="addarticle" method="post">
	<table>
		<tr>
			<td>Title: </td>
			<td><input type="text" name="title" /> </td>
		</tr>
		<tr>
			<td>Author Name:</td>
			<td><input type="text" name="authorName" /> </td>
		</tr>
                <tr>
			<td>Category:</td>
			<td><input type="text" name="category" /> </td>
		</tr>
		<tr>
			<td>Body:</td>
			<td><input type="text" name="body" /> </td>
		</tr>
<!--		<tr>
			<td>Publish date:</td>
                        <td><input type="text" name="pub_date" value=<%= new Date()%> /> </td>
		</tr>-->
	</table>
            <input type="submit" value="Post"/>
	
	</form>
                
                <a href="<c:url value="/j_spring_security_logout" />" > Logout</a>
    </body>
</html>
