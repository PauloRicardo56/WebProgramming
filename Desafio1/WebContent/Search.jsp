<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<title>Busca</title>
</head>
<body>

  <%-- <%
    String search = request.getParameter("modelo");
    if (search == "") { %>
      <div class="alert alert-danger">
        Insira o modelo do carro que deseha pesquisar.
      </div>
  <% } %> --%>

  <%-- Menu --%>
  <ul class="nav nav-tabs nav-justified">
    <li class="nav-item">
      <a class="nav-link" href="Cadastro.jsp">Cadastrar Veículo</a>
    </li>
    <li class="nav-item">
      <a class="nav-link disabled" href="Lista.jsp">Listar Veículos</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="Alugar.jsp">Alugar Veículo</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="Retorno.jsp">Retornar Veículo</a>
    </li>
  </ul>

  <jsp:useBean id="carDao" class="br.com.dao.CarDAO"/>

  <%-- Tabela --%>
  <form action="ListarServlet" method="get">
    <table class="table table-sm table-striped mx-auto w-50 mt-4">
    <thead>
      <tr>
        <th>Fabricante</th>
        <th>Modelo</th>
        <th>Ano</th>
        <th>Disponibilidade</th>
        <th></th>
      </tr>
    </thead>

    <tbody>
      <c:forEach var="car" items="${carDao.selectCar()}">
        <c:if test="${car.getModelo() == modelo}">
          <tr>
            <td>${car.getFabricante()}</td>
            <td>${car.getModelo()}</td>
            <td>${car.getAno()}</td>
            <c:choose>
                <c:when test="${car.getDisponivel() == 1}">
                  <td class="text-success">Disponível</td>
                </c:when>
                <c:otherwise>
                    <td class="text-danger">Indisponível</td>
                </c:otherwise>
            </c:choose>
            <td><button class="btn btn-info" type="submit" name="editar" value="${car.getID()}">
              Editar
            </button>
            <button class="btn btn-danger" type="submit" name="remover" value="${car.getID()}">
              Remover
            </button></td>
          </tr>
        </c:if>
      </c:forEach>
    </tbody>
  </table>
</form>

</body>
</html>
