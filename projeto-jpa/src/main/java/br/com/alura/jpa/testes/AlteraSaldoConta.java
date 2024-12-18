package br.com.alura.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Conta;

/**
 * Alteração de saldo da conta do primeiro registro da tabela "conta"
 */

public class AlteraSaldoConta {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
		EntityManager em = emf.createEntityManager();
		
		Conta contaLeonardo = em.find(Conta.class, 1L);
		
		em.getTransaction().begin();
		contaLeonardo.setSaldo(20.0);
		em.getTransaction().commit();
	}

}
