<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<title>
This is student Form Confirmation
</title>
</head>

<body>

Final Submission For : ${student.getFirstName() }  ${student.lastName}
<br>
<br>
country: ${student.country } <br>
Favourite Language : ${student.favouriteLanguage }<br>
<ul>
Experties:
<c:forEach var="temp" items="${student.experties }">

	<li>${temp}</li>

</c:forEach>

</ul>
</body>
</html>