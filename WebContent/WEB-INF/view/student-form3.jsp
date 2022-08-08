<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
		
		First name: <form:input path="firstName" />
		<br>
		<br>
		
		Last name: <form:input path="lastName" />
		<br>
		<br>
		
		Country: 
		
		<form:select path="country">

			<form:options items="${theCountryOptions}" />

			<%-- <form:options items="${student.countryOptions}" /> --%>

			<%-- <form:option value="Brazil" label="Brazil"></form:option>
			<form:option value="India" label="India"></form:option>
			<form:option value="Mexico" label="Mexico"></form:option>
			<form:option value="United States" label="United States"></form:option>
			<form:option value="Australia" label="Australia"></form:option> --%>
		</form:select>

		<br>
		<br>
		
		Favorite Language:
		
		Java <form:radiobutton path="favoriteLanguage" value="Java" />
		C# <form:radiobutton path="favoriteLanguage" value="C#" />
		PHP <form:radiobutton path="favoriteLanguage" value="PHP" />
		Ruby <form:radiobutton path="favoriteLanguage" value="Ruby" />

		<br>
		<br>
		
		Operating Systems:
		
		MS Windows <form:checkbox path="operatingSystems" value="MS Windows" />
		MAC OS <form:checkbox path="operatingSystems" value="MAC OS" />
		Linux <form:checkbox path="operatingSystems" value="Linux" />

		<br>
		<br>

		<input type="submit" value="Submit">

	</form:form>
</body>
</html>