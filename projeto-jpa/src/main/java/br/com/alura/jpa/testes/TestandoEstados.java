package br.com.alura.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Conta;

/**
 * Criação simples de uma conta via EntityManager e sua posterior remoção com o remove(), testando o status Removed
 */

public class TestandoEstados {
	public static void main(String[] args) {
		
		//Transient
		Conta conta = new Conta();
		conta.setTitular("Antônio");
		conta.setAgencia(123123);
		conta.setNumero(321321);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		// Transient -> Managed
		em.persist(conta);
		
		// Managed -> Removed
		em.remove(conta);
		
		em.getTransaction().commit();
		
	}	
}
