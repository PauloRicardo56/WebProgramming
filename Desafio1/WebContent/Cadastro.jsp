<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<title>Cadastrar carro</title>
</head>
<body>

  <ul class="nav nav-tabs nav-justified">
    <li class="nav-item">
      <a class="nav-link disabled" href="Cadastro.jsp">Cadastrar Veículo</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="Lista.jsp">Listar Veículos</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="Alugar.jsp">Alugar Veículo</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="Retorno.jsp">Retornar Veículo</a>
    </li>
  </ul>

  <form action="CadastroServlet" method="get">
    <div class="form-group w-25 mx-auto">
      <label for="usr">Fabricante:</label>
      <input class="form-control ml-2" type="text" name="fabricante"
        placeholder="Digite o nome do fabricante"/>
    </div>

    <div class="form-group w-25 mx-auto">
      <label for="usr">Modelo:</label>
      <input class="form-control ml-2" type="text" name="modelo"
        placeholder="Digite o nome do modelo"/>
    </div>

    <div class="form-group w-25 mx-auto">
      <label for="usr">Ano:</label>
      <input class="form-control ml-2" type="text" name="ano"
        placeholder="Digite o ano de fabricação"/>
    </div>

    <br/>
    <div class="text-center">
      <input class="btn btn-info" type="submit" value="Cadastrar">
    </div>
  </form>

</body>
</html>
