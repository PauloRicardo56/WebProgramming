<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Resultado</title>
</head>
<body>

  <%
    String operador = request.getParameter("operador");
    int num1 = Integer.parseInt(request.getParameter("num1"));
    int num2 = Integer.parseInt(request.getParameter("num2"));
    String result = "Resultado = ";

    switch(operador) {
    case "+":
      result += (num1 + num2);
      break;
    case "-":
      result += (num1 - num2);
      break;
    case "/":
      result += (num1 / num2);
      break;
    case "*":
      result += (num1 * num2);
      break;
    }
  %>

  <h1> <%=result%> </h1>
</body>
</html>
