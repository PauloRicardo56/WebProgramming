<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<title>Login</title>
</head>
<body>

  <%
    String user = request.getParameter("user");
    if (user == "") { %>
      <div class="alert alert-danger">
        Você precisa preencher o campo Usuário com a palavra admin.
      </div>
  <% } %>

  <form action="LoginServlet" method="post">
    <div class="form-group w-25 mx-auto mt-3">
      <label>Usuário:</label>
      <input class="form-control ml-2" type="text" name="user"
        placeholder="Digite seu usuário (admin)"/>
    </div>

    <div class="form-group w-25 mx-auto">
      <label>Senha:</label>
      <input class="form-control ml-2" type="password" name="password"
        placeholder="Digite sua senha (qualquer)"/>
    </div>

    <div class="text-center">
      <input class="btn btn-info" type="submit" value="Entrar">
    </div>
  </form>

</body>
</html>
