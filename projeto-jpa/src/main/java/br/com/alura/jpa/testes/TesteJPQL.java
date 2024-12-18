package br.com.alura.jpa.testes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import br.com.alura.jpa.modelo.Conta;
import br.com.alura.jpa.modelo.Movimentacao;

/**
 * Cria��o de query simples usando JPQL para buscar registros na tabela de movimenta��o por meio do id da conta
 */

public class TesteJPQL {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
		EntityManager em = emf.createEntityManager();
		
		String jpql = "select m from Movimentacao m where m.conta = :pConta order by m.valor desc";
		
		Conta conta = new Conta();
		conta.setId(1L);
		
		TypedQuery<Movimentacao> query = em.createQuery(jpql, Movimentacao.class);
		query.setParameter("pConta", conta);
				
		List<Movimentacao> resultList = query.getResultList();		
		for (Movimentacao movimentacao : resultList) {
			System.out.println("Descri��o: " + movimentacao.getDescricao());
			System.out.println("Tipo: " + movimentacao.getTipoMovimentacao());
		}
		
	}
}
