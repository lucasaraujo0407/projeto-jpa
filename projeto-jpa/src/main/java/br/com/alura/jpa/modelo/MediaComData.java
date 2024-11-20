package br.com.alura.jpa.modelo;

public class MediaComData {
	private double valor;
	private Integer dia;
	private Integer mes;
	private Integer ano;
		
	public MediaComData(double valor, Integer dia, Integer mes, Integer ano) {
		this.valor = valor;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	public double getValor() {
		return valor;
	}
	public Integer getDia() {
		return dia;
	}
	public Integer getMes() {
		return mes;
	}
	public Integer getAno() {
		return ano;
	}
}
