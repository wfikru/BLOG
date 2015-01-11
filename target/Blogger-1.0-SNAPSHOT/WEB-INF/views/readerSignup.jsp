<%-- 
    Document   : readerSignup
    Created on : Sep 20, 2014, 10:28:57 PM
    Author     : kokob
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="resources/style.css" rel="stylesheet" type="text/css" />
        <title>Reader Signup</title>
    </head>
    <body>
        <h1>Register</h1>
        
        <div class="error">

           <c:if test="${not errorMessage eq null}">
                
                    <p> ${errorMessage}</p>
             
            </c:if> 
        </div>
        
        <form:form commandName="reader" action="signup" method="POST" >
            <table>
                <tr>
                    <td>First Name: </td>
                    <td><form:input path="firstName" type="text" name="firstName" /> </td>
                    <td><form:errors path="firstName" cssClass="error"  /> </td>
                </tr>
                <tr>       
                    <td>Last Name:</td>   
                    <td><form:input path="lastName" type="text" name="lastName" /> </td>
                    <td><form:errors path="lastName" cssClass="error"  /> </td>

                </tr>
                <tr>
                    <td>Gender:</td>
                    <td><form:input path="gender" type="text" name="gender" /> </td>
                    <td><form:errors path="gender" cssClass="error"  /> </td>
                </tr>
                <tr>
                    <td>Email:</td>
                    <td><form:input path="email" type="text" name="email" /> </td>
                    <td><form:errors path="email" cssClass="error"  /> </td>
                </tr>
                <tr>
                    <td>Username:</td>
                    <td><form:input path="userName" type="text" name="userName" /> </td>
                    <td><form:errors path="userName" cssClass="error"  /> </td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><form:input path="passWord" type="password" name="passWord" /> </td>
                    <td><form:errors path="passWord" cssClass="error"  /> </td>
                </tr>
            </table>
            <input type="submit" value="Register"/>
        </form:form>
            
            
            
    </body>
</html>
