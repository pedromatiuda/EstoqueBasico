package br.com.fiap.test;

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

public class Teste {

	public static void main(String[] args) {
		
//		===== TESTE CADASTRAR =====

//		try {
//			EstoqueBasicoStub ebs = new EstoqueBasicoStub();
//
//			Cadastrar cadastrar = new Cadastrar();
//
//			cadastrar.setNomeProduto("Teclado");
//			cadastrar.setPreco(129.99);
//
//			CadastrarResponse cadastrarResposta = ebs.cadastrar(cadastrar);
//
//			System.out.println(cadastrarResposta.get_return());
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
//		===== TESTE ATUALIZAR =====

//		try {
//			EstoqueBasicoStub ebs = new EstoqueBasicoStub();
//
//			Atualizar atualizar = new Atualizar();
//
//			atualizar.setI(0);
//			atualizar.setNomeProduto("Maouse");
//			atualizar.setPreco(15.99);
//
//			AtualizarResponse atualizarResponse = ebs.atualizar(atualizar);
//
//			System.out.println(atualizarResponse.get_return());
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

//		===== TESTE LISTAR =====
		
		try {
			EstoqueBasicoStub ebs = new EstoqueBasicoStub();

			Listar listar = new Listar();

			ListarResponse listarResposta = ebs.listar(listar);
			
			List<Produto> produtos= new ArrayList<Produto>(Arrays.asList(listarResposta.get_return()));
			
			for (Produto produto : produtos) {
				System.out.println(produto.getNomeProduto());
				System.out.println(produto.getPreco());
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

//		===== TESTE REMOVER =====
		
//		try {
//			EstoqueBasicoStub ebs = new EstoqueBasicoStub();
//
//			Remover remover = new Remover();
//
//			remover.setI(0);
//
//			RemoverResponse removerResponse = ebs.remover(remover);
//
//			System.out.println(removerResponse.get_return());
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}

}
