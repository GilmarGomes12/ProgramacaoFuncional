package br.com.gtech.unaryoperator;

public class Venda {

	private int valor;

	public Venda(int valor) {
		super();
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Venda [valor=" + valor + "]";
	}

}
