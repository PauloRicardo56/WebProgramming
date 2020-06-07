<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
  <h1>Vehicles</h1>
  <h3>Signin new vehicle</h3>

  <form action="VehicleServlet" method="post">
    <div>
      Model:<br/>
      Year:<br/>
      Color:<br/>
    </div>
    <div>
      <input type="text" name="model"/><br/>
      <input type="number" name="year"/><br/>
      <input type="text" name="color" value="white"/>
    </div>
    <br/><input id="signinButton" type="submit" value="Cadastrar veículo"/>
  </form>

<jsp:useBean id="vehicleDAO" class="vehicle.VehicleDAO"/>

<table>
  <tr id="tableIndex">
    <th>Model</th>
    <th>Year</th>
    <th>Color</th>
  </tr>
  <c:forEach var="vehicle" items="${vehicleDAO.getVehicles()}">
    <tr>
      <th>${vehicle.getModel()}</th>
      <th>${vehicle.getYear()}</th>
      <th>${vehicle.getColor()}</th>
    </tr>
  </c:forEach>
</table>


<table>

</table>
</body>
</html>
