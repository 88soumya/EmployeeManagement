<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h1>Add Employee Record</h1>
<form action="add" method="post">
Name:<input type="text" name="name"><br><br>
Email:<input type="email" name="email"><br><br>
Phoneno:<input type="number" name="phno"><br><br>
Salary:<input type="number" name="salary"><br><br>
<button>Add</button>
</form>
<br> <a href="home"><button>Back</button></a>
</div>
</body>
</html>