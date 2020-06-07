<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<title>Alugar carros</title>
</head>
<body>

  <ul class="nav nav-tabs nav-justified">
    <li class="nav-item">
      <a class="nav-link" href="Cadastro.jsp">Cadastrar Veículo</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="Lista.jsp">Listar Veículos</a>
    </li>
    <li class="nav-item">
      <a class="nav-link disabled" href="Alugar.jsp">Alugar Veículo</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="Retorno.jsp">Retornar Veículo</a>
    </li>
  </ul>

<form action="AlugarServlet" method="get">
  <jsp:useBean id="carDao" class="br.com.dao.CarDAO"/>

  <table class="table table-sm table-striped mt-4">
    <thead>
      <tr>
        <th>Fabricante</th>
        <th>Modelo</th>
        <th>Ano</th>
        <th></th>
      </tr>
    </thead>
    <tbody>
      <c:forEach var="car" items="${carDao.selectCar()}">
        <c:if test="${car.getDisponivel() == 1}">
          <tr>
            <td>${car.getFabricante()}</td>
            <td>${car.getModelo()}</td>
            <td>${car.getModelo()}</td>
            <td><button class="btn btn-success" type="submit" name="alugar" value="${car.getID()}">
              Alugar
            </button></td>
          </tr>
        </c:if>
      </c:forEach>
    </tbody>
  </table>
</form>

</body>
</html>
