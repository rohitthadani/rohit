<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

This is login section

<form:form modelAttribute="user" action="checkLogin.do" >
	<form:label path="emailId">Username:</form:label><form:input path="emailId"/> <br/>
	<form:label path="password">Password:</form:label><form:input path="password"/> <br/>
	<form:button value="Login">Login</form:button>
</form:form>