<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Please Register Here</title>
</head>
<body>
<center>
<h1>Please Register Here</h1>
<form action="register" method="post">
<h1>Your Personal Information</h1>
First Name: <input type="text" name="firstName"><br>
Last Name: <input type="text" name="lastName"><br>
Email: <input type="text" name="email"><br>
Phone Number: <input type="text" name="phone"><br>
Sex: <input type="radio" name="sex" value="male">Male<input type="radio" name="sex" value="female">Female<br>
Password: <input type="text" name="password"><br>
Date of birth: <input type="date" name="dob"><br>
<br>
<h1>Your Address Information</h1>
Address Line 1: <input type="text" name="address1"><br>
Address Line 2: <input type="text" name="address2"><br>
City: <input type="text" name="city"><br>
State: <input type="text" name="state"><br>
Zip: <input type="text" name="zip" pattern=".{5,5}" maxlength="5"><br>
Country: <input type="text" name="country"><br><br>
<input type="submit" value="Register">
</form>
</center>
</body>
</html>