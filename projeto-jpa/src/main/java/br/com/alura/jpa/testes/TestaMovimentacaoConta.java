package br.com.alura.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Conta;
import br.com.alura.jpa.modelo.Movimentacao;

/**
 * Criação de busca da quantidade de movimentações por conta
 */

public class TestaMovimentacaoConta {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
		EntityManager em = emf.createEntityManager();
		
		Movimentacao movimentacao = em.find(Movimentacao.class, 1L);
		Conta conta = movimentacao.getConta();
		int quantidadeMovimentacoes = conta.getMovimentacoes().size();
		
		System.out.println("Quantidade de movimentacoes: " + quantidadeMovimentacoes);
		System.out.println("Titular da conta: " + conta.getTitular());
		
	}
}
