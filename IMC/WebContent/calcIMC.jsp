<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <%
  Double imc;
  String result;
  Double peso = Double.parseDouble(request.getParameter("peso"));
  Double altura = Double.parseDouble(request.getParameter("altura"));

  altura /= 100.0;
  imc = peso/(altura*altura);

  if (imc >= 18.5 && imc <= 24.9) {
    result = "Seu IMC está normal.";
  } else {
    result = "Seu IMC não está normal.";
  }
  %>

  <h1> <%=imc%> </h1>
  <h2> <%=result%> </h2>
</body>
</html>
