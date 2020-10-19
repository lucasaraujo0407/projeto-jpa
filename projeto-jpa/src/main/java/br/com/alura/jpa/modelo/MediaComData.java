package br.com.alura.jpa.modelo;

public class MediaComData {
	private double valor;
	private Integer dia;
	private Integer mes;
		
	public MediaComData(double valor, Integer dia, Integer mes) {
		this.valor = valor;
		this.dia = dia;
		this.mes = mes;
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
}
