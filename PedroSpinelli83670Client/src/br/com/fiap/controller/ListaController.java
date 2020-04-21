package br.com.fiap.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.model.ProdutoBO;
import br.com.fiap.services.EstoqueBasicoStub.Produto;

public class ListaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ListaController() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ProdutoBO bo = new ProdutoBO();
		
		List<Produto> produtos = bo.listar();
		
		request.setAttribute("produtos", produtos);
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
