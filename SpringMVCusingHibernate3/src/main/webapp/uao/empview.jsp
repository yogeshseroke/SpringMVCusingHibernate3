<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="emplogic.html" method="post">
Employee_ID :- <form:input path="empid"></form:input>
<br>
<br>
Employee_Name :-<form:input path="empname"></form:input>
<br>
<br>
Employee_Job :-<form:input path="empjob"></form:input>
<br>
<br>
<input type="submit" value="Click" />
</form:form>
${res}
</body>
</html>