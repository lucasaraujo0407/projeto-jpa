package br.com.alura.jpa.testes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.MediaComData;
import br.com.alura.jpa.modelo.dao.MovimentacaoDao;

/**
 * Teste de soma diária das movimentações, já utilizando o MovimentacaoDao
 */

public class TesteMediaDiariaMovimentacoes {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
		EntityManager em = emf.createEntityManager();
		
		List<MediaComData> mediaMovimentacoes = new MovimentacaoDao(em).getMediaDiariaMovimentacoes();
		
		for (MediaComData resultado : mediaMovimentacoes) {
			System.out.println("Média do dia " + resultado.getDia() + "/" + resultado.getMes() + "/" + resultado.getAno() + ": " + resultado.getValor());
		}			
	}
}
