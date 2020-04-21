package br.com.fiap.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.model.ProdutoBO;


public class ProdutoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ProdutoController() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ProdutoBO produtoBO = new ProdutoBO();
		
		String cadastroResposta = produtoBO.cadastrar(request.getParameter("nomeProduto"), 
				Double.parseDouble(request.getParameter("preco")));
		
		request.setAttribute("cadastroResposta", cadastroResposta);
		
		request.getRequestDispatcher("produtoCadastrado.jsp").forward(request, response);

	}

}
