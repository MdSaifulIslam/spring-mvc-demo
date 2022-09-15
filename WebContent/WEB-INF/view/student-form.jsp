<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>

<html>
<head>
<title>This is student registration Form</title>
</head>

<body>
	<form:form action="processForm" modelAttribute="student">

First Name: <form:input path="firstName" />
		<br>
		<br>

Last  Name: <form:input path="lastName" />
		<br>
		<br>
		Country: 
		<form:select path="country">
			<form:options items="${student.countryOptions }"/>
		</form:select>
		<br>
		<br>
		Favourite Language: <br>
		Java <form:radiobutton path="favouriteLanguage" value="Java"/>
		PHP <form:radiobutton path="favouriteLanguage" value="PHP"/>
		C# <form:radiobutton path="favouriteLanguage" value="C#"/>
		Python<form:radiobutton path="favouriteLanguage" value="Python"/>
		
		<br>
		<br>
		Experties: <br>
		C <form:checkbox path="experties" value="C"/>
		JAVA <form:checkbox path="experties" value="JAVA"/>
		Web <form:checkbox path="experties" value="Web"/>
		FullStack <form:checkbox path="experties" value="FullStack"/>
		
		<br>
		<br>

		<input type="submit" value="Submit" />

	</form:form>

</body>

</html>