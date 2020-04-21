package br.com.fiap.services;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Produto;

public class EstoqueBasico {

	public static List<Produto> produtos = new ArrayList<Produto>();

	public String cadastrar(String nomeProduto, double preco) {

		Produto produto = new Produto(nomeProduto, preco);

		try {
			produtos.add(produto);
			return "O produto " + produto.getNomeProduto() + " foi cadastrado!";
		} catch (Exception e) {
			e.printStackTrace();
			return "O produto " + produto.getNomeProduto() + " n�o foi cadastrado!";
		}
	}

	public String atualizar(int i, String nomeProduto, double preco) {
		if (produtos.get(i) != null) {

			try {
				produtos.get(i).setNomeProduto(nomeProduto);
				produtos.get(i).setPreco(preco);
				return "O produto " + produtos.get(i).getNomeProduto() + " foi atualizado!";
			} catch (Exception e) {
				e.printStackTrace();
				return "O produto " + produtos.get(i).getNomeProduto() + " n�o foi atualizado!";
			}
		} else {
			return "O produto " + produtos.get(i).getNomeProduto() + " n�o existe!";
		}
	}

	public String remover(int i) {

		if (produtos.get(i) != null) {

			try {
				produtos.remove(i);
				return "O produto de indice " + i + " foi removido!";
			} catch (Exception e) {
				e.printStackTrace();
				return "O produto de indice " + i + " n�o foi removido!";
			}
		} else {
			return "O produto de indice " + i + " n�o existe!";
		}
	}

	public List<Produto> listar() {
		return produtos;
	}
}
