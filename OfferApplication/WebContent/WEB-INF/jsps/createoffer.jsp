<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="${pageContext.request.contextPath}/static/css/main.css" rel="stylesheet" type="text/css"></link>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form method="post" action="${pageContext.request.contextPath}/docreate" commandName="offer">
		<table class="formtable">
			<tr><td class="label">Name:</td><td><form:input class="control" path="name" name="name" type="text"/><br/><form:errors path="name" cssClass="error"></form:errors></td></tr>
			<tr><td class="label">Email:</td><td><form:input class="control" path="email" name="email" type="text"/><br/><form:errors path="email" cssClass="error"></form:errors></td></tr>
			<tr><td class="label">Your Offer:</td><td><form:textarea class="control" path="text" name="text" rows="10" cols="10"></form:textarea><br/><form:errors path="text" cssClass="error"></form:errors></td></tr>
			<tr><td>&nbsp;</td><td><input class="control" name="Create Offer" type="submit"></td></tr>
		</table>	
	</form:form>
</body>
</html>