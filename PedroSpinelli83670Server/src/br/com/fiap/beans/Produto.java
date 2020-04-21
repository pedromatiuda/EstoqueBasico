package br.com.fiap.beans;

public class Produto {
	
	private String nomeProduto;
	private double preco;
	
	public Produto(String nomeProduto, double preco) {
		super();
		this.nomeProduto = nomeProduto;
		this.preco = preco;
	}

	public Produto() {
		super();
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
