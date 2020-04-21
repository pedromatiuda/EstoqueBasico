<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Cadastro de Produto</title>
</head>
<body>

	<h2>Formulário de Cadastro de Produto</h2>
	<form action="ProdutoController">
		<label>Nome Produto: </label> <input type="text" name="nomeProduto"
			required> <br> <label>Preço Produto: </label> <input
			type="text" name="preco" required> <br> <input
			type="submit" value="Cadastrar">
	</form>

	<a href="ListaController">Lista</a>

	<table>
		<tr>
			<th>Nome Produto</th>
			<th>Preço</th>
		</tr>
		<c:forEach var="produto" items="${produtos}">
			<tr>
				<td>${produto.getNomeProduto() }</td>
				<td>${produto.getPreco() }</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>