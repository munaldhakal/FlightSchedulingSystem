<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <form class="form" action="./RegisterServlet" method="post">
      <label for="login">Login type</label>
      <select id="login" name="userType">
        <option value="user">USER</option>
        <option value="Admin">ADMIN</option>
      </select><br><br>

      <label for="username"><strong>userName</strong></label>
      <input type="text" id="username" placeholder="username" name="username" required><br><br>

      <label for="password"><strong>Password</strong></label>
      <input type="password" id="password" placeholder="Enter Password" name="password" required><br><br>

      <label for="email"><strong>Email</strong></label>
      <input type="email" id="email" placeholder="Enter your email" name="email" required><br><br>

      <label for="number"><strong>Phone number</strong></label>
      <input type="number" id="number" placeholder="Enter your phone number" name="phoneNumber" required><br><br>

    <input type="submit" value="Submit">
    </form>
  </body>
</html>