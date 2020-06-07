<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <%-- <jsp:useBean id="users" class="user.UserDAO"/> --%>
  <form action="Vehicle.jsp" method="post">
    <input type="text" name="login">
    <input type="text" name="password">
    <input type="submit" value="Login">
    <%-- <c:if test="${users.getUsers.containsKey()}" --%>
  </form>

  <form action="SigninUser.jsp" method="post">
    <input type="submit" value="Sign In">
  </form>

</body>
</html>
