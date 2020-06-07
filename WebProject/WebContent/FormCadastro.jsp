<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
  <meta charset="UTF-8">
  <title>Bootstrap project</title>
</head>
<body>
  <div class="container">
    <h1>Cadastro de usuário</h1>
    <div class="card">
      <div class="card-body">
        <form action="" method="post">

          <div class="form-group row">
            <label class="col-sm-2">Nome</label>
            <div class="col-sm-7">
              <input class="form-control" type="text" name="txtNome" placeholder="Digite seu nome">
            </div>
          </div>

          <div class="form-group row">
            <label class="col-sm-2">Telefone</label>
            <div class="col-sm-7">
              <input class="form-control" type="text" name="txtTel" placeholder="Digite seu telefone">
            </div>
          </div>

          <div class="form-group row">
            <label class="col-sm-2">Senha</label>
            <div class="col-sm-7">
              <input class="form-control" type="text" name="txtSenha" placeholder="Digite sua senha">
            </div>
          </div>

          <button type="submit" class="btn btn-primary">Salvar</button>
          
        </form>
      </div>
    </div>
  </div>

</body>
</html>
