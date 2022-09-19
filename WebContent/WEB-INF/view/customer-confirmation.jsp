<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<title>Customer Confirmation page</title>
</head>

<body>
	The customer is: ${customer.firstName } ${customer.lastName }
	<br>
	<br> 
	Free passes : ${ customer.freePasses }
	<br>
	<br> 
	Free passes : ${ customer.postalCode }
	<br>
	<br> 
	Course Code : ${ customer.courseCode }

</body>

</html>