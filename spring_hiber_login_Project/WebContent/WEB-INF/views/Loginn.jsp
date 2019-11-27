<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.error{color:red}
</style>
</head>
<body>
<a href="index.jsp">HOme</a>
<form:errors path="userBean.*" cssClass="error"/>
<form:form action="DoAdd" modelAttribute="userBean">
<table>

 
 <tr>
  <td><form:label path="username">Name</form:label></td>
  <td><form:input path="username"></form:input></td>
 </tr>
 <tr>
    <td><form:label path="password">Password</form:label></td>
    <td><form:input path="password"/></td>
 </tr>
 <tr>
    <td colspan="2">
       <input type="submit" value="Add details"/>
       </td>
       </tr>
</table>
</form:form>
</body>
</html>