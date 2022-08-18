<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>lead|create</title>
</head>
<body>
<h2> crate new lead  </h2>

<form action="savelead" method="post">
<pre>
firstname<input type="text" name="firstName" /> 
lastname<input type="text" name="lastName" /> 
email<input type="text" name="email" /> 
mobile<input type="text" name="mobile" /> 
<input type="submit" value="save"/>
</pre>
</form>
${sms}
</body>
</html>