<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

  <jsp:useBean id="carDao" class="br.com.dao.CarDAO"/>
  <c:set var="car" value = "${carDao.selectCar(id)}"/>

  <form action="EditarServlet" method="get">
    <input type="hidden" name="id" value="${id}">

    <div class="form-group w-25 mx-auto">
      <label>Fabricante:</label>
      <input class="form-control ml-2" name="fabricante"
        value="${car.getFabricante()}"/>
    </div>

    <div class="form-group w-25 mx-auto">
      <label>Modelo:</label>
      <input class="form-control ml-2" name="modelo"
        value="${car.getModelo()}"/>
    </div>

    <div class="form-group w-25 mx-auto">
      <label>Ano:</label>
      <input class="form-control ml-2" name="ano"
        value="${car.getAno()}"/>
    </div>

    <div class="text-center">
      <input class="btn btn-info" type="submit" value="Salvar">
    </div>
  </form>

</body>
</html>
