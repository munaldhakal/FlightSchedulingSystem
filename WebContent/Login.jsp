<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
 <form class="form" action="./LoginServlet" method="post">
      <label for="username"><strong>Username</strong></label>
      <input type="text" id="username" placeholder="username" name="userName" required><br>

      <label for="password"><strong>Password</strong></label>
      <input type="password" id="password" placeholder="Enter Password" name="password" required><br>


    <label for="login">Login type</label>
    <select id="login" name="userType">
      <option value="user" >USER</option>
      <option value="Admin" >ADMIN</option>
    </select>

    <input type="submit" value="Submit">
    </form>
</body>
</html>