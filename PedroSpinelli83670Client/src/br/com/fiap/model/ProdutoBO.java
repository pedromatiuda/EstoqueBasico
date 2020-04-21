package br.com.fiap.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.fiap.services.EstoqueBasicoStub;
import br.com.fiap.services.EstoqueBasicoStub.Atualizar;
import br.com.fiap.services.EstoqueBasicoStub.AtualizarResponse;
import br.com.fiap.services.EstoqueBasicoStub.Cadastrar;
import br.com.fiap.services.EstoqueBasicoStub.CadastrarResponse;
import br.com.fiap.services.EstoqueBasicoStub.Listar;
import br.com.fiap.services.EstoqueBasicoStub.ListarResponse;
import br.com.fiap.services.EstoqueBasicoStub.Produto;
import br.com.fiap.services.EstoqueBasicoStub.Remover;
import br.com.fiap.services.EstoqueBasicoStub.RemoverResponse;

public class ProdutoBO {

	public String cadastrar(String nomeProduto, double preco) {
		try {
			EstoqueBasicoStub ebs = new EstoqueBasicoStub();

			Cadastrar cadastrar = new Cadastrar();

			cadastrar.setNomeProduto(nomeProduto);
			cadastrar.setPreco(preco);

			CadastrarResponse cadastrarResposta = ebs.cadastrar(cadastrar);

			return cadastrarResposta.get_return();

		} catch (Exception e) {
			e.printStackTrace();
			return "Falha na comunicação com o servidor!";
		}
	}

	public String atualizar(int i, String nomeProduto, double preco) {
		try {
			EstoqueBasicoStub ebs = new EstoqueBasicoStub();

			Atualizar atualizar = new Atualizar();
			
			atualizar.setI(i);
			atualizar.setNomeProduto(nomeProduto);
			atualizar.setPreco(preco);

			AtualizarResponse atualizarResponse = ebs.atualizar(atualizar);

			return atualizarResponse.get_return();

		} catch (Exception e) {
			e.printStackTrace();
			return "Falha na comunicação com o servidor!";
		}
	}

	public String remover(int i) {
		try {
			EstoqueBasicoStub ebs = new EstoqueBasicoStub();

			Remover remover = new Remover();
			
			remover.setI(i);

			RemoverResponse removerResponse = ebs.remover(remover);

			return removerResponse.get_return();
			
		} catch (Exception e) {
			e.printStackTrace();
			return "Falha na comunicação com o servidor!";
		}
	}

	public List<Produto> listar() {
		try {
			EstoqueBasicoStub ebs = new EstoqueBasicoStub();

			Listar listar = new Listar();

			ListarResponse listarResposta = ebs.listar(listar);

			return new ArrayList<Produto>(Arrays.asList(listarResposta.get_return()));
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
