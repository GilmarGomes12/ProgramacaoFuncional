package br.com.gtech.binaryoperator;

public class Produto {

	private double preco;

	public Produto(double preco) {
		super();
		this.preco = preco;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Produto [preco=" + preco + "]";
	}

}
