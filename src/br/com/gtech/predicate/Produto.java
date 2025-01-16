package br.com.gtech.predicate;

public class Produto {

	private String nomeProduto;
	private double valor;

	public Produto(String nomeProduto, double valor) {
		super();
		this.nomeProduto = nomeProduto;
		this.valor = valor;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Produto [nomeProduto=" + nomeProduto + ", valor=" + valor + "]";
	}

}
